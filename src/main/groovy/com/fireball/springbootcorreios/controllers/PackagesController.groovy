package com.fireball.springbootcorreios.controllers

import com.fireball.springbootcorreios.repositories.PackageRepository
import com.fireball.springbootcorreios.services.PostalServiceQueryService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * Created by carlos on 25/03/14.
 */
@Controller
class PackagesController {

    static final Logger logger = LoggerFactory.getLogger(PackagesController)

    @Autowired
    PackageRepository packageRepository

    @Autowired
    PostalServiceQueryService postalServiceQueryService

    @RequestMapping("/")
    def index() {

        def allPackages = packageRepository.findAll()

        allPackages.each {
            if (!it.delivered()) {
                logger.info("Package [{}] not delivered, retrieving info from postal service", it.code);
                postalServiceQueryService.updateStatus(it)
            }
        }

        def modelAndView = new ModelAndView()

        modelAndView.addObject("packages", allPackages)
        modelAndView.viewName = "packages/index"
        modelAndView
    }

}
