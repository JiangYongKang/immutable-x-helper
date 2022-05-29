# Immutable X Helper

### Deploy Contract
```
$ yarn ropsten:deploy
yarn run v1.22.18
$ npx hardhat run --network ropsten scripts/deploy.ts
Generating typings for: 1 artifacts in dir: typechain for target: ethers-v5
Successfully generated 5 typings!
Compiled 1 Solidity file successfully
IMXERC721Demo deployed to: 0xFf20e251dF05bA2300c139f7F410e5AE19AB0623
Done in 210.28s.
```

### Create Project
```
$ yarn ropsten:createProject
yarn run v1.22.18
$ npx hardhat run --network ropsten scripts/createProject.ts
No need to generate any newer typings.
Create Project Successful, Project Id: 51691
Done in 7.29s.
```

### Create Collection
```
$ yarn ropsten:createCollection
yarn run v1.22.18
$ npx hardhat run --network ropsten scripts/createCollection.ts
No need to generate any newer typings.
Create Collection Response: {"address":"0xff20e251df05ba2300c139f7f410e5ae19ab0623","name":"IMX ERC721 Demo","description":"IMX ERC721 Demo","icon_url":"","collection_image_url":"","project_id":51691,"metadata_api_url":"https://ipfs.io/ipfs/"}
Done in 9.24s.
```

### Mint NFT
```
$ yarn ropsten:mint
yarn run v1.22.18
$ npx hardhat run --network ropsten scripts/mint.ts
No need to generate any newer typings.
Mint NFT: {"results":[{"token_id":"1653811075567","contract_address":"0xff20e251df05ba2300c139f7f410e5ae19ab0623","tx_id":4581750}]}
Done in 7.21s.
```

### Create Order
```
$ yarn ropsten:order:create
yarn run v1.22.18
$ npx hardhat run --network ropsten scripts/createOrder.ts
No need to generate any newer typings.
CreateOrder: {"order_id":128442,"status":"","time":0}
Done in 9.02s.
```

### Cancel Order
```
$ yarn ropsten:order:cancel
yarn run v1.22.18
$ npx hardhat run --network ropsten scripts/cancelOrder.ts
No need to generate any newer typings.
{ order_id: 128442, status: '' }
Done in 8.77s.
```

### Show Balance
```
$ yarn ropsten:balance:show
yarn run v1.22.18
$ npx hardhat run --network ropsten scripts/showBalance.ts
No need to generate any newer typings.
ShowBalance: {"result":[{"symbol":"ETH","balance":"100000000400000000","preparing_withdrawal":"0","withdrawable":"0"}],"cursor":"eyJfIjoiIiwic3ltYm9sIjoiRVRIIiwiY29udHJhY3RfYWRkcmVzcyI6IiIsImlteCI6IjEwMDAwMDAwMDQwMDAwMDAwMCIsInByZXBhcmluZ193aXRoZHJhd2FsIjoiMCIsIndpdGhkcmF3YWJsZSI6IjAifQ"}
Done in 6.01s.
```

### Transfer Balance
```
$ yarn ropsten:balance:transfer
yarn run v1.22.18
$ npx hardhat run --network ropsten scripts/transferBalance.ts
No need to generate any newer typings.
TransferId: 4581751 Transfer 0.0000000001ETH From: 0x8c1c499415a19e4086dcaf94803ab01cb7185570 To: 0x64f44b31ad0ed4537f94a5c084cfba8945463345
Done in 9.72s.
```