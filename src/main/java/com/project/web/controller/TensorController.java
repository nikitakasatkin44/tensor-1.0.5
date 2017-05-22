package com.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ?????? on 21.05.2017.
 */
@Controller
public class TensorController {

    public TensorController() {
        super();
    }

    @RequestMapping({"/","/index"})
    public String showIndex() {

        return "index";
    }
}
