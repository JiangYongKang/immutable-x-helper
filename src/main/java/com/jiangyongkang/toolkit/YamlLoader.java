package com.jiangyongkang.toolkit;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;

/**
 * Author: vincent
 * Date: 2018-12-01 22:26:00
 * Comment:
 */

public class YamlLoader {

    private final static String FILE_SUFFIX = ".yml";
    private final static ClassLoader CLASS_LOADER = YamlLoader.class.getClassLoader();

    public static <T> T read(String fileName, Class<T> clazz) {
        InputStream inputStream = CLASS_LOADER.getResourceAsStream(fileName + FILE_SUFFIX);
        return new Yaml(new Constructor(clazz)).load(inputStream);
    }

}
