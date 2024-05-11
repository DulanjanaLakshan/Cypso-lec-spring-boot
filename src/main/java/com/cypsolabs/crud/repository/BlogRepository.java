package com.cypsolabs.crud.repository;

import com.cypsolabs.crud.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Dulanjana Lakshan Kumarasingha
 */
public interface BlogRepository extends JpaRepository<Blog, UUID> {
}
