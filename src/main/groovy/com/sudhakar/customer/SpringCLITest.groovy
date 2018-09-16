package com.sudhakar.customer

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SpringCLITest {

    @RequestMapping("/hello")
    String home() {
        "Hello World!"
    }

}

