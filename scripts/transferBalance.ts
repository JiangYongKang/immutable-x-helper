// We require the Hardhat Runtime Environment explicitly here. This is optional
// but useful for running the script in a standalone fashion through `node <script>`.
//
// When running the script with `npx hardhat run <script>` you'll find the Hardhat
// Runtime Environment's members available in the global scope.
import { ethers } from "hardhat";
import { ETHTokenType, ImmutableXClient, } from '@imtbl/imx-sdk';
import { BigNumber } from "ethers";

async function main() {

    let userPrivateKey = process.env.PRIVATE_KEY || "";
    let receiveAddress = "0x8c1C499415a19e4086DCAf94803AB01cb7185570".toLowerCase();
    let transferBalance = BigNumber.from("100000000");

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

    let transferResp = await imxClient.transfer({
        sender: signer.address.toLowerCase(),
        token: {
            type: ETHTokenType.ETH,
            data: {
                decimals: 18,
            },
        },
        quantity: transferBalance,
        receiver: receiveAddress,
    })
    console.log(`TransferId: ${transferResp.transfer_id} Transfer ${ethers.utils.formatEther(transferBalance)}ETH From: ${signer.address.toLowerCase()} To: ${receiveAddress}`)

}

// We recommend this pattern to be able to use async/await everywhere
// and properly handle errors.
main().catch((error) => {
    console.error(error);
    process.exitCode = 1;
});
