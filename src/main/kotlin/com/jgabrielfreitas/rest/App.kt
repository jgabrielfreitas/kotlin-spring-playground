package com.jgabrielfreitas.rest

import org.springframework.boot.SpringApplication.run as initSpring
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by JGabrielFreitas on 08/11/2017.
 */

@SpringBootApplication
open class App {}

fun main(args: Array<String>) {
    initSpring(App::class.java, *args)
}