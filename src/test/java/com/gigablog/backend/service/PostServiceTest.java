package com.gigablog.backend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.gigablog.backend.model.Post;
import com.gigablog.backend.repository.PostRepository;

@ExtendWith(MockitoExtension.class)
public class PostServiceTest {

    @Mock
    private PostRepository postRepository;

    @InjectMocks
    private PostService postService;

    @Test
    public void getAllPosts() {
        when(postRepository.findAll()).thenReturn(List.of(new Post(), new Post()));

        List<Post> posts = postService.getAllPosts();

        assertEquals(2, posts.size());
        verify(postRepository, times(1)).findAll();
    }

    @Test
    public void testCreatePost() {
        Post post = new Post();
        post.setTitle("Test Title");
        post.setContent("Test Content");
        post.setCreatedAt(LocalDateTime.now());

        when(postRepository.save(any(Post.class))).thenReturn(post);

        Post createdPost = postService.createPost(post);

        assertEquals(post.getTitle(), createdPost.getTitle());
        assertEquals(post.getContent(), createdPost.getContent());
        assertEquals(post.getCreatedAt(), createdPost.getCreatedAt());
        verify(postRepository, times(1)).save(any(Post.class));
    }

}
