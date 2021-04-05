package com.makaixuan.service;

import com.makaixuan.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    // 增加
    int addBook(Books books);

    // 删除
    int delBookById(int id);

    // 修改
    int updBook(Books books);

    // 查看一个
    Books selBook(int id);

    // 查看所有
    List<Books> selBooks();
}
