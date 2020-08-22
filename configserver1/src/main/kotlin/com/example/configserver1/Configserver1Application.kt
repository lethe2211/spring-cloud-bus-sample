package com.example.configserver1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Configserver1Application

fun main(args: Array<String>) {
	runApplication<Configserver1Application>(*args)
}
