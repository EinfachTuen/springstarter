package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class RestApiController {

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    @RequestMapping("/login")
    public String login(HttpSession session) {
        System.out.println(session.getId());
        return "no user";
    }
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    @RequestMapping("/signup")
    public String signup(HttpSession session) {
        System.out.println(session.getId());
        return "no user";
    }
}
