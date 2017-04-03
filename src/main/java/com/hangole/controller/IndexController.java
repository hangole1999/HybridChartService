package com.hangole.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

/**
 * Created by kimgiwhang_010 on 2017-04-03.
 */
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(Locale locale, Model model) {
        return "/index";
    }
}
