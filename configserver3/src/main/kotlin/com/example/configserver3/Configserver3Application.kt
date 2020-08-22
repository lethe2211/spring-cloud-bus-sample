package com.example.configserver3

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class Configserver3Application

fun main(args: Array<String>) {
	runApplication<Configserver3Application>(*args)
}
