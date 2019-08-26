package org.launchcode.springWebApp.springframework.spring5webapp.repositories;

import org.launchcode.springWebApp.springframework.spring5webapp.model.Artist;
import org.springframework.data.repository.CrudRepository;

public class SongRepository {

    public interface AuthorRepository extends CrudRepository<Artist, Long> {
    }

}


import guru.springframework.spring5webapp.model.Book;
        import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}