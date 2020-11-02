package com.irfan.MyMaven.web.repository;

import com.irfan.MyMaven.support.jpa.CustomJpaRepository;
import com.irfan.MyMaven.web.entity.Author;
import com.irfan.MyMaven.web.entity.Book;
import com.irfan.MyMaven.web.entity.BookAuthor;

/**
 * <b>BookAuthor Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface BookAuthorRepository extends CustomJpaRepository<BookAuthor, Long> {

	public BookAuthor findByBookAndAuthor(Book book, Author author);

	public void deleteByAuthor(Author author);

	public void deleteByBook(Book book);
}
