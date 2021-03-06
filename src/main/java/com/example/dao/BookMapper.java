package com.example.dao;

import com.example.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    // 增加一本书
    int addBook(Books books);
    // 删除一本书
    int deleteBookById(@Param("bookId") int id);
    // 修改一本书
    int updateBook(Books books);
    // 根据id查询一本书
    Books queryBookById(@Param("bookId") int id);
    // 查询全部书籍
    List<Books> getAllBook();

}
