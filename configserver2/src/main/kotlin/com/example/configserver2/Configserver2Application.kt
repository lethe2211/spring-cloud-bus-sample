package com.example.configserver2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class Configserver2Application

fun main(args: Array<String>) {
	runApplication<Configserver2Application>(*args)
}
