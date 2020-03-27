package com.lcz.cloud_note.dao;

import java.util.List;

import com.lcz.cloud_note.entity.Book;
import org.apache.ibatis.annotations.Param;


public interface BookDao {
	//根据登录的uid查找笔记本的数据
	public List<Book> findByUserId(String userId);
	//增加笔记本的操作
	public void save(Book book);

	//增加笔记本的操作
	public void delect(@Param("cn_notebook_id") String cn_notebook_id);
}
