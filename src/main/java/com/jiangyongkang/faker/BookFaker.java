package com.jiangyongkang.faker;

import com.jiangyongkang.model.Book;
import com.jiangyongkang.toolkit.RandomUtil;
import com.jiangyongkang.toolkit.YamlLoader;

/**
 * Author: vincent
 * Date: 2018-12-01 23:43:00
 * Comment:
 */

public class BookFaker {

    private final static Book book = YamlLoader.read("book", Book.class);

    public static String title() {
        return RandomUtil.nextElement(book.getTitle());
    }

}
