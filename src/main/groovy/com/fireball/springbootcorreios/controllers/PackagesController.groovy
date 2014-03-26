package com.fireball.springbootcorreios.controllers

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by carlos on 25/03/14.
 */
@Controller
class PackagesController {

    static final Logger logger = LoggerFactory.getLogger(PackagesController)

    @RequestMapping("/")
    String index() {

        "packages/index"
    }

}
