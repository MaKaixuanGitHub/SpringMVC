package com.makaixuan.dao;

import com.makaixuan.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    // 增加
    int addBook(Books books);

    // 删除
    int delBookById(@Param("bookId") int id);

    // 修改
    int updBook(Books books);

    // 查看一个
    Books selBook(@Param("bookId") int id);

    // 查看所有
    List<Books> selBooks();
}
