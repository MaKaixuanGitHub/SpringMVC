package com.makaixuan.dao;

import com.makaixuan.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    /***
    * insert books
    */
    // 增加
    int addBook(Books books);

    /***
    * delete book
    */
    // 删除
    int delBookById(@Param("bookId") int id);

    /***
    * modify books
    */
    // 修改
    int updBook(Books books);

    /***
    * select book
    */
    // 查看一个
    Books selBook(@Param("bookId") int id);

    /***
    * select books
    */
    // 查看所有
    List<Books> selBooks();
}
