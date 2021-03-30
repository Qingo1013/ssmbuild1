package cn.qqa.service;

import cn.qqa.mapper.BooksMapper;
import cn.qqa.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {

    //service层调dao层

    @Autowired
    private BooksMapper booksMapper;

    public Integer addBook(Books books) {
        return booksMapper.addBook(books);
    }

    public Integer deleteBookById(Integer bookId) {
        return booksMapper.deleteBookById(bookId);
    }

    public Integer updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    public Books selectBookById(Integer bookId) {
        return booksMapper.selectBookById(bookId);
    }

    public List<Books> selectAllBook() {
        return booksMapper.selectAllBook();
    }
}
