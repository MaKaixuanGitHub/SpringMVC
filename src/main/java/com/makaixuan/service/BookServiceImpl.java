package com.makaixuan.service;

import com.makaixuan.dao.BookMapper;
import com.makaixuan.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int delBookById(int id) {
        return bookMapper.delBookById(id);
    }

    public int updBook(Books books) {
        return bookMapper.updBook(books);
    }

    public Books selBook(int id) {
        return bookMapper.selBook(id);
    }

    public List<Books> selBooks() {
        return bookMapper.selBooks();
    }
}
