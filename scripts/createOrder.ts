// We require the Hardhat Runtime Environment explicitly here. This is optional
// but useful for running the script in a standalone fashion through `node <script>`.
//
// When running the script with `npx hardhat run <script>` you'll find the Hardhat
// Runtime Environment's members available in the global scope.
import { ethers } from "hardhat";
import { BigNumber } from "ethers";
import { ERC721TokenType, ETHTokenType, ImmutableXClient, } from '@imtbl/imx-sdk';

async function main() {

    let userPrivateKey = process.env.PRIVATE_KEY || "";
    let contractAddress = process.env.IMX_COLLECTION_CONTRACT_ADDRESS || "";
    let tokenId = "1653811075567";
    let amount = BigNumber.from("10000000000")

    let signer = new ethers.Wallet(userPrivateKey).connect(
        new ethers.providers.JsonRpcProvider(process.env.ROPSTEN_URL)
    );

    let imxClient = await ImmutableXClient.build({
        signer: signer,
        publicApiUrl: "https://api.ropsten.x.immutable.com/v1",
        starkContractAddress: "0x5FDCCA53617f4d2b9134B29090C87D01058e27e9",
        registrationContractAddress: "0x72a06bf2a1CE5e39cBA06c0CAb824960B587d64c",
        gasLimit: "7000000",
        gasPrice: "40000000000"
    });

    let createOrderResp = await imxClient.createOrder({
        user: signer.address,
        tokenSell: {
            type: ERC721TokenType.ERC721,
            data: {
                tokenId: tokenId,
                tokenAddress: contractAddress
            }
        },
        amountSell: BigNumber.from('1'),
        tokenBuy: {
            type: ETHTokenType.ETH,
            data: {
                decimals: 18,
            },
        },
        amountBuy: amount,
    })
    console.log(`CreateOrder: ${JSON.stringify(createOrderResp)}`)

}

// We recommend this pattern to be able to use async/await everywhere
// and properly handle errors.
main().catch((error) => {
    console.error(error);
    process.exitCode = 1;
});
