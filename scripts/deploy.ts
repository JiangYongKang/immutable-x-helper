// We require the Hardhat Runtime Environment explicitly here. This is optional
// but useful for running the script in a standalone fashion through `node <script>`.
//
// When running the script with `npx hardhat run <script>` you'll find the Hardhat
// Runtime Environment's members available in the global scope.
import { ethers } from "hardhat";

async function main() {
    // Hardhat always runs the compile task when running scripts with its command
    // line interface.
    //
    // If this script is run directly using `node` you may want to call compile
    // manually to make sure everything is compiled
    // await hre.run('compile');

    // We get the contract to deploy
    let contractFactory = await ethers.getContractFactory("IMXERC721Demo");
    let contract = await contractFactory.deploy(
        "https://ipfs.io.ipfs/",
        "0xd1df2ad66ba772c202941ad05aa9a07d85946e75",
        "0x4527BE8f31E2ebFbEF4fCADDb5a17447B27d2aef"
    );
    await contract.deployed();
    console.log("IMXERC721Demo deployed to:", contract.address);
}

// We recommend this pattern to be able to use async/await everywhere
// and properly handle errors.
main().catch((error) => {
    console.error(error);
    process.exitCode = 1;
});
