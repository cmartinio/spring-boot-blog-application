package com.chrismartain.springbootblogapplication.controllers;


import com.chrismartain.springbootblogapplication.models.Post;
import com.chrismartain.springbootblogapplication.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// Working on a new set of updated controllers.
@Controller
public class HomeController {
    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String home(Model model) {
        List<Post> posts = postService.getAll();
        model.addAttribute("posts", posts);
        return "home";
    }

}
