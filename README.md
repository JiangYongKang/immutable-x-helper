# Faker
Faker 可以非常方便的生成测试数据，但 Faker 并不能保证多次生成的数据是唯一的。Faker 很小巧，目前为止它只有 22k。

[![JDK-1.8](https://img.shields.io/badge/jdk-1.8-yellow.svg)](https://img.shields.io/badge/jdk-1.8-yellow.svg)
[![Build Status](https://travis-ci.com/JiangYongKang/faker-data.svg?branch=master)](https://travis-ci.com/JiangYongKang/faker-data)
[![RELEASE](https://img.shields.io/badge/RELEASE-1.0--SNAPSHOT-blue.svg)](https://img.shields.io/badge/RELEASE-1.0--SNAPSHOT-blue.svg)
[![GPL-3.0](https://img.shields.io/badge/license-GPL--3.0-blue.svg)](LICENSE)

### 快速开始

```java
ColorFaker.name() // => "orange"
CatFaker.name() // => "Coco"
AddressFaker.city() // => "广西东兴市"
DotaFaker.hero() // => "Abaddon"
DotaFaker.team() // => "LGD-GAMING"
```
