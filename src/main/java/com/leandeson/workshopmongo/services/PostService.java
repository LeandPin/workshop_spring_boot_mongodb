package com.leandeson.workshopmongo.services;

import com.leandeson.workshopmongo.domain.Post;
import com.leandeson.workshopmongo.domain.User;
import com.leandeson.workshopmongo.dto.UserDTO;
import com.leandeson.workshopmongo.exception.ObjectNotFoundException;
import com.leandeson.workshopmongo.repository.PostRepository;
import com.leandeson.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;


    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
