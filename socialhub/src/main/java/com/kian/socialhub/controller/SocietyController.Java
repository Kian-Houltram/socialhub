package com.kian.socialhub.controller;

import com.kian.socialhub.model.Society;
import com.kian.socialhub.service.SocietyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/societies")
public class SocietyController {

    private final SocietyService societyService;

    public SocietyController(SocietyService societyService) {
        this.societyService = societyService;
    }

    @getMapping
    public List<Society> getAllSocieties() {
        return societyService.getAllSocieties();
    }
}
