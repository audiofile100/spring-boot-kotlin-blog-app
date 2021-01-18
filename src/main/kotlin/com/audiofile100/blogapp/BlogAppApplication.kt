package com.audiofile100.blogapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogAppApplication

fun main(args: Array<String>) {
    runApplication<BlogAppApplication>(*args)
}
