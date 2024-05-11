package com.cypsolabs.crud.serviceImpl;

import com.cypsolabs.crud.entity.Blog;
import com.cypsolabs.crud.repository.BlogRepository;
import com.cypsolabs.crud.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Dulanjana Lakshan Kumarasingha
 */
@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService {
    @Autowired
    private final BlogRepository repository;

    @Override
    public Blog save(Blog blog) {
        return repository.save(blog);
    }

    @Override
    public List<Blog> getAllBlog() {
        return repository.findAll();
    }

    @Override
    public boolean delete(UUID id) {
        repository.deleteById(id);
        return true;
    }
}
