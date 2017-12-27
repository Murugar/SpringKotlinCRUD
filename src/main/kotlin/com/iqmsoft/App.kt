package com.iqmsoft

import org.apache.log4j.Logger
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class App {
    val logger: Logger = Logger.getLogger(App::class.java)

}
fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}
