package com.womack.spring6webapp.services;

import com.womack.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
