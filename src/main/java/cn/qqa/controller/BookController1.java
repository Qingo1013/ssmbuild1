package cn.qqa.controller;


import cn.qqa.pojo.Books;
import cn.qqa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class BookController1 {

    //controller层调用service层
    @Autowired
    private BookService bookService;

    @RequestMapping("/toShow")
    public String toShow(Model model){
        List<Books> books = bookService.selectAllBook();
        model.addAttribute("list",books);
        return "show";
    }

    @RequestMapping("/toShow1")
    public String toShow1(Model model){
        List<Books> books = bookService.selectAllBook();
        model.addAttribute("list",books);
        return "show";
    }



}
