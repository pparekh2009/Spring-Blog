package com.priyansh.springblog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBlogApplication

fun main(args: Array<String>) {
	runApplication<SpringBlogApplication>(*args)
}
