package com.makaixuan.controller;

import com.makaixuan.pojo.Books;
import com.makaixuan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    /**
     * 查询所有书籍
     * @param model
     * @return
     */
    @RequestMapping("/books")
    public String books(Model model){
        List<Books> list = bookService.selBooks();
        model.addAttribute("list", list);
        return "books";
    }

    /**
     * 跳转到添加书籍jsp
     * @param
     * @return
     */
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }
    /**
     * 添加书籍请求
     * @param books
     * @return
     */
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/books";
    }





    /**
     * 添加一本书
     * @param books
     * @return bookService.addBook(books)
     */
//    @RequestMapping("/addBook")
//    public int addBook(Books books) {
//        return bookService.addBook(books);
//    }

    /**
     * 删除一本书
     * @param id
     * @return bookService.delBookById(id)
     */
//    @RequestMapping("/delBookById")
//    public int delBookById(int id) {
//        return bookService.delBookById(id);
//    }

    /**
     * 更新一本书
     * @param books
     * @return bookService.updBook(books)
     */
//    @RequestMapping("/updBook")
//    public int updBook(Books books) {
//        return bookService.updBook(books);
//    }

    /**
     * 查询所哟书
     * @return bookService.selBooks()
     */
//    @RequestMapping("/selBooks")
//    public List<Books> selBooks() {
//        return bookService.selBooks();
//    }

    /**
     * 查询一本书
     * @param id
     * @return bookService.selBook(id)
     */
//    @RequestMapping("/selBook")
//    public Books selBook(int id) {
//        return bookService.selBook(id);
//    }

}
