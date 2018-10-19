package com.jiangyongkang.random.data.boy;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;

/**
 * Author: vincent
 * Date: 2018-10-19 10:38:00
 * Comment:
 */

public class YamlConverter {

    static <T> T doConvert(String fileName, Class<T> clazz) {
        Yaml addressYaml = new Yaml(new Constructor(clazz));
        InputStream inputStream = clazz.getClassLoader().getResourceAsStream(fileName);
        return addressYaml.load(inputStream);
    }
}
