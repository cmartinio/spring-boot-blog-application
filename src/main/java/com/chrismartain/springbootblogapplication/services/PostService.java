package com.chrismartain.springbootblogapplication.services;


import com.chrismartain.springbootblogapplication.models.Post;
import com.chrismartain.springbootblogapplication.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Optional<Post> getById(Long id) {
        return postRepository.findById(id);
    }

    public List<Post> getAll(){
        return postRepository.findAll();
    }
    public Post save(Post post){
        if (post.getId() == null) {
            post.setCreatedAt(LocalDateTime.now());
        }
        post.setUpdatedAt(LocalDateTime.now());
        return postRepository.save(post);
      }
    public void delete(Post post) {
        postRepository.delete(post);
      }
    }


