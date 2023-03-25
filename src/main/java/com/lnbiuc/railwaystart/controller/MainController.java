package com.lnbiuc.railwaystart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author VIOLET
 * @create 2023-03-26 1:47
 */

@Controller
public class MainController
{
    @RequestMapping("{params}")
    public ModelAndView index(@PathVariable String params, ModelAndView modelAndView)
    {
        modelAndView.setViewName("index");
        modelAndView.addObject(params);
        return modelAndView;
    }
}
