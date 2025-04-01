package com.gigablog.backend.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@Testcontainers
public class PostControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    // @Test
    // void shouldGetAllPosts() throws Exception {
    //     mockMvc.perform(get("/api/v1/posts")
    //             .contentType(MediaType.APPLICATION_JSON))
    //             .andExpect(status().isOk())
    //             .andExpect(jsonPath("$").isArray())
    //             .andExpect(jsonPath("$[0].title").exists())
    //             .andExpect(jsonPath("$[0].content").exists())
    //             .andExpect(jsonPath("$[0].createdAt").exists());
    // }

    // @Test
    // void shouldGetPostById() throws Exception {
    //     mockMvc.perform(get("/api/v1/posts/20")
    //             .contentType(MediaType.APPLICATION_JSON))
    //             .andExpect(status().isOk())
    //             .andExpect(jsonPath("$.title").exists())
    //             .andExpect(jsonPath("$.content").exists())
    //             .andExpect(jsonPath("$.createdAt").exists());
    // }

    // @Test
    // void shouldCreatePost() throws Exception {
    //     String postJson = "{\"title\": \"Test Post Title\", \"content\": \"Test Post Content\"}";

    //     mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/posts")
    //             .contentType(MediaType.APPLICATION_JSON)
    //             .content(postJson))
    //             .andExpect(status().isCreated()) // Or status().isOk() depending on your controller
    //             .andExpect(jsonPath("$.title").value("Test Post Title"))
    //             .andExpect(jsonPath("$.content").value("Test Post Content"))
    //             .andExpect(jsonPath("$.createdAt").exists());
    // }

    // @Test
    // void shouldUpdatePost() throws Exception {
    //     String postJson = "{\"title\": \"Test Post Title Updated\", \"content\": \"Test Post Content Updated\"}";

    //     mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/posts/20")
    //             .contentType(MediaType.APPLICATION_JSON)
    //             .content(postJson))
    //             .andExpect(status().isOk())
    //             .andExpect(jsonPath("$.title").value("Test Post Title Updated"))
    //             .andExpect(jsonPath("$.content").value("Test Post Content Updated"))
    //             .andExpect(jsonPath("$.updatedAt").exists());
    // }

    // @Test
    // void shouldDeletePost() throws Exception {
    //     mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/posts/20")
    //             .contentType(MediaType.APPLICATION_JSON))
    //             .andExpect(status().isNoContent());
    // }

}