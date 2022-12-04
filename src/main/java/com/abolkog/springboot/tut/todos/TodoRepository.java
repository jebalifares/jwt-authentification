package com.abolkog.springboot.tut.todos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @Created 15/09/2018 11:17 PM.
 */

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

    Todo findByTitle(String title);

    List<Todo> findByUserId(String userId);

}
