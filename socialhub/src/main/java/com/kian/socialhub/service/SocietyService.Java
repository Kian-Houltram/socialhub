package com.kian.socialhub.service;

import com.kian.socialhub.model.Society;
import org.springframework.stereotype.Service;

import java.util.List; 

@service
public class SocietyService {
    public List<Society> getAllSocieties() {
        return List.of(
            new Society(1L, "Photography Club", "A club for photography enthusiasts.", 50.0, 120, "Arts", null),
            new Society(2L, "Robotics Society", "Exploring the world of robotics and AI.", 75.0, 80, "Technology", null),
            new Society(3L, "Drama Club", "For those passionate about theater and acting.", 40.0, 60, "Performing Arts", null)
        );
    }
}