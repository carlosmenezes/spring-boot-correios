package com.fireball.springbootcorreios.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by carlos on 25/03/14.
 */
@Controller
class PackagesController {

    @RequestMapping("/")
    String index() {
        "packages/index"
    }

}
