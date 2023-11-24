package com.example.demo;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/demo")
@RestController
public class DemoController {
    
    /**
     * 
     */
    @PostMapping
    public void addModel(@Valid @ModelAttribute DemoModel model) {
        log.info("add model: {}", model);
        
    }
}
