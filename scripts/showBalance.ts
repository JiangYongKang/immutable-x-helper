// We require the Hardhat Runtime Environment explicitly here. This is optional
// but useful for running the script in a standalone fashion through `node <script>`.
//
// When running the script with `npx hardhat run <script>` you'll find the Hardhat
// Runtime Environment's members available in the global scope.
import axios from "axios";

async function main() {

    let userAddress = "0x64f44B31ad0Ed4537f94a5c084CfBA8945463345".toLowerCase()
    let response = await axios.get(`https://api.ropsten.x.immutable.com/v2/balances/${userAddress}`)
    console.log(`ShowBalance: ${JSON.stringify(response.data)}`)

}

// We recommend this pattern to be able to use async/await everywhere
// and properly handle errors.
main().catch((error) => {
    console.error(error);
    process.exitCode = 1;
});
