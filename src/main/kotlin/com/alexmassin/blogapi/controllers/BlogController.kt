package com.alexmassin.blogapi.controllers

import com.alexmassin.blogapi.models.Post
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class BlogController {

    @GetMapping("/")
    fun blogs(): List<Post> = listOf(
        Post(1, "My first Blog Post", "Hello there", "Alex Massin", LocalDateTime.now())
    )
}