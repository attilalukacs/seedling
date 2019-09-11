package hu.procyon.seedling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hu.procyon.seedling.model.BasicResponse;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    @ResponseBody
    public BasicResponse login() {
        return new BasicResponse(true);
    }
}