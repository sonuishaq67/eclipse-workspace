package com.irfan.MyMaven.web.repository;

import java.util.Set;

import com.irfan.MyMaven.support.jpa.CustomJpaRepository;
import com.irfan.MyMaven.web.entity.Book;

/**
 * <b>Book Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface BookRepository extends CustomJpaRepository<Book, Long> {

	public Book findByBookName(String bookName);

	public Set<Book> findByBookAuthors_Author_Id(Long authorId);
}
