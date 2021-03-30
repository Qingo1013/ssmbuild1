package cn.qqa.mapper;

import cn.qqa.pojo.Books;
import org.apache.ibatis.logging.LogFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BooksMapperImpl extends SqlSessionDaoSupport implements BooksMapper {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public Integer addBook(Books books) {
        return getSqlSession().getMapper(BooksMapper.class).addBook(books);
    }

    public Integer deleteBookById(Integer bookId) {
        return getSqlSession().getMapper(BooksMapper.class).deleteBookById(bookId);
    }

    public Integer updateBook(Books books) {
        return getSqlSession().getMapper(BooksMapper.class).updateBook(books);
    }

    public Books selectBookById(Integer bookId) {
        return getSqlSession().getMapper(BooksMapper.class).selectBookById(bookId);
    }

    public List<Books> selectAllBook() {
        return getSqlSession().getMapper(BooksMapper.class).selectAllBook();
    }
}
