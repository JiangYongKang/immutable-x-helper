// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

import "@imtbl/imx-contracts/contracts/Mintable.sol";
import "@openzeppelin/contracts/token/ERC721/ERC721.sol";
import "@openzeppelin/contracts/token/ERC721/extensions/ERC721URIStorage.sol";

contract IMXERC721Demo is ERC721, ERC721URIStorage, Mintable {
    string public baseURI;
    address public contractOwner;
    address public starkContractAddress;

    constructor(
        string memory _baseURI,
        address _contractOwner,
        address _starkContractAddress
    )
        ERC721("IMX ERC721 Demo", "IMX-ERC721")
        Mintable(_contractOwner, _starkContractAddress)
    {
        baseURI = _baseURI;
        contractOwner = _contractOwner;
        starkContractAddress = _starkContractAddress;
    }

    function _mintFor(
        address to,
        uint256 id,
        bytes memory blueprint
    ) internal override {
        _safeMint(to, id);
        _setTokenURI(id, string(abi.encodePacked(baseURI, blueprint)));
    }

    function burn(uint256 tokenId) public {
        _burn(tokenId);
    }

    function setURI(string memory newuri) public onlyOwnerOrIMX {
        baseURI = newuri;
    }

    function tokenURI(uint256 tokenId)
        public
        view
        override(ERC721, ERC721URIStorage)
        returns (string memory)
    {
        return super.tokenURI(tokenId);
    }

    function _burn(uint256 tokenId)
        internal
        override(ERC721, ERC721URIStorage)
    {
        require(
            ownerOf(tokenId) == _msgSender() || ownerOf(tokenId) == owner(),
            "IMX-ERC721: You Are Not The Owner Of The Token"
        );
        super._burn(tokenId);
    }
}
