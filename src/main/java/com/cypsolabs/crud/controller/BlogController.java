package com.cypsolabs.crud.controller;

import com.cypsolabs.crud.entity.Blog;
import com.cypsolabs.crud.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Dulanjana Lakshan Kumarasingha
 */
@RestController
@RequestMapping("/api/blog")
@RequiredArgsConstructor
public class BlogController {
    @Autowired
    private final BlogService service;

    @GetMapping()
    public List<Blog> getAllBlogs(){
        return service.getAllBlog();
    }


}
