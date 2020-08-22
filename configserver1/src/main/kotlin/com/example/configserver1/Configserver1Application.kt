package com.example.configserver1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class Configserver1Application

fun main(args: Array<String>) {
	runApplication<Configserver1Application>(*args)
}
