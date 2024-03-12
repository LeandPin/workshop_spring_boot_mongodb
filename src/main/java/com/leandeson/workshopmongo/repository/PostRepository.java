package com.leandeson.workshopmongo.repository;


import com.leandeson.workshopmongo.domain.Post;
import com.leandeson.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
