package com.br.svn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walter on 17/9/30.
 */
@RestController
@Controller
public class SvnController {

    
    @RequestMapping(value = "/api/test.html")
    public String test() {

        return "hello world";
    }

}
