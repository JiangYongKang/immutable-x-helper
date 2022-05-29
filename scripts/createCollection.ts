// We require the Hardhat Runtime Environment explicitly here. This is optional
// but useful for running the script in a standalone fashion through `node <script>`.
//
// When running the script with `npx hardhat run <script>` you'll find the Hardhat
// Runtime Environment's members available in the global scope.
import { ethers } from "hardhat";
import { ImmutableXClient, } from '@imtbl/imx-sdk';

async function main() {

    let userPrivateKey = process.env.PRIVATE_KEY || ""
    let imxCollectionName = process.env.IMX_COLLECTION_NAME || ""
    let imxCollectionDescription = process.env.IMX_COLLECTION_DESCRIPTION || ""
    let imxCollectionContractAddress = process.env.IMX_COLLECTION_CONTRACT_ADDRESS || ""
    let imxCollectionIconUrl = process.env.IMX_COLLECTION_ICON_URL || ""
    let imxCollectionMetadataApiUrl = process.env.IMX_COLLECTION_METADATA_API_URL || ""
    let imxCollectionImageUrl = process.env.IMX_COLLECTION_IMAGE_URL || ""
    let imxCollectionProjectId = process.env.IMX_COLLECTION_PROJECT_ID || ""

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

    let createCollectionResp = await imxClient.createCollection({
        name: imxCollectionName,
        description: imxCollectionDescription,
        contract_address: imxCollectionContractAddress,
        owner_public_key: signer.publicKey,
        icon_url: imxCollectionIconUrl,
        metadata_api_url: imxCollectionMetadataApiUrl,
        collection_image_url: imxCollectionImageUrl,
        project_id: Number.parseInt(imxCollectionProjectId),
    });
    console.log("Create Collection Response: " + JSON.stringify(createCollectionResp));


}

// We recommend this pattern to be able to use async/await everywhere
// and properly handle errors.
main().catch((error) => {
    console.error(error);
    process.exitCode = 1;
});
