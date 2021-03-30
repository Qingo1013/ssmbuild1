package cn.qqa.controller;


import cn.qqa.pojo.Books;
import cn.qqa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class BookController {

    //controller层调用service层
    @Autowired
    private BookService bookService;

    @RequestMapping("/toShow")
    public String toShow(Model model){
        List<Books> books = bookService.selectAllBook();
        //System.out.println(books);
        model.addAttribute("list",books);
        return "show";
    }

    @RequestMapping("/addBook")
    public String addBook(Model model){
        return "addBook";
    }

    @RequestMapping("/runAddBook")
    public String runAddBook(Books books){
        bookService.addBook(books);
        return "redirect:/toShow";
    }


    @RequestMapping("/updateBook")
    public String updateBook(Integer id,Model model){
        Books books = bookService.selectBookById(id);
        model.addAttribute("obj",books);
        return "updateBook";
    }

    @RequestMapping("/runUpdateBook")
    public String runUpdateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/toShow";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") Integer id){
        bookService.deleteBookById(id);
        return "redirect:/toShow.action";
    }

    @RequestMapping("/deleteBookByAjax/{id}")
    public void deleteBookByAjax(@PathVariable("id") Integer id,String msg, HttpServletResponse response) throws IOException {
        System.out.println(msg);
        Integer integer = bookService.deleteBookById(id);
        if(integer>0){
            response.getWriter().print("删除成功！");
        }else {
            response.getWriter().print("删除失败！");
        }
    }





}
