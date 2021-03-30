package cn.qqa.mapper;

import cn.qqa.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {

    //添加图书
    public Integer addBook(Books books);
    //删除图书
    public Integer deleteBookById(@Param("bookId") Integer bookId);
    //修改图书
    public Integer updateBook(Books books);
    //通过id查询图书
    public Books selectBookById(@Param("bookId") Integer bookId);
    //查询全部图书
    public List<Books> selectAllBook();

}
