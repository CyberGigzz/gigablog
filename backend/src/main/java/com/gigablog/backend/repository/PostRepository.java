package com.gigablog.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gigablog.backend.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
} 
