package ru.atsarev.logopedquizz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/quizz")
    public String quizz() {
        return "quizz";
    }

    @RequestMapping("/questioner")
    public String questioner() {
        return "questioner";
    }

    @RequestMapping("/truefalse")
    public String truefalse() {
        return "truefalse";
    }

    @PostMapping("/hello")
    public String sayHello(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}