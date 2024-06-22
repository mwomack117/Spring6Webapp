package com.womack.spring6webapp.services;

import com.womack.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
