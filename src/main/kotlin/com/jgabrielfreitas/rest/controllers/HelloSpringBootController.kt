package com.jgabrielfreitas.rest.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by JGabrielFreitas on 08/11/2017.
 */

@RestController
class HelloSpringBootController {

    @RequestMapping(value = "/")
    fun helloSpringBoot() = "Hello SpringBoot"
}