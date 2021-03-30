package cn.qqa.service;

import cn.qqa.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    //添加图书
    public Integer addBook(Books books);
    //删除图书
    public Integer deleteBookById( Integer bookId);
    //修改图书
    public Integer updateBook(Books books);
    //通过id查询图书
    public Books selectBookById(Integer bookId);
    //查询全部图书
    public List<Books> selectAllBook();

}
