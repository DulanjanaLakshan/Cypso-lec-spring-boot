package com.cypsolabs.crud.service;

import com.cypsolabs.crud.entity.Blog;

import java.util.List;
import java.util.UUID;

/**
 * @author Dulanjana Lakshan Kumarasingha
 */
public interface BlogService {
    Blog save(Blog blog);
    List<Blog> getAllBlog();
    boolean delete(UUID id);
}
