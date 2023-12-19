package com.project.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.blog.model.Post;
import com.project.blog.model.PostRecord;

import java.util.List;


public interface PostRepository extends JpaRepository<Post, Long>{

    List <PostRecord> findByPublished(boolean published);
    List <PostRecord> findByTitleContaining(String title);
}
