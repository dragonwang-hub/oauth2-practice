package com.practice.oauth2;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public OAuth2User hello() {
        return (OAuth2User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
