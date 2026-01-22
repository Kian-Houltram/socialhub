package com.kian.socialhub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kian.socialhub.model.Society;
import com.kian.socialhub.service.SocietyService;

@RestController
@RequestMapping("/api/societies")
public class SocietyController {

    private final SocietyService societyService;

    public SocietyController(SocietyService societyService) {
        this.societyService = societyService;
    }

<<<<<<< HEAD:socialhub/src/main/java/com/kian/socialhub/controller/SocietyController.Java
    
=======
>>>>>>> a3ccbd5577306ac1c965df72f32cea134556f9e8:socialhub/src/main/java/com/kian/socialhub/controller/SocietyController.java
    @GetMapping
    public List<Society> getAllSocieties() {
        return societyService.getAllSocieties();
    }
}

