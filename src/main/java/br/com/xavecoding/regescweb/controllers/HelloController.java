package br.com.xavecoding.regescweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

    @GetMapping("/hello-final")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("nome", "Maria");
        return mv;
    }

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("nome", "Zezinho");
        return "hello";
    }
}
