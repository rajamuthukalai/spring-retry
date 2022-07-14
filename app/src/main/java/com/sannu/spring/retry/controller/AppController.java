package com.sannu.spring.retry.controller;

import com.sannu.spring.retry.RetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @Autowired
    public RetryService retryService;

    @GetMapping("/app/{username}")
    public String getApp(@PathVariable String username) throws Exception {
        return retryService.retry(username);
    }
}
