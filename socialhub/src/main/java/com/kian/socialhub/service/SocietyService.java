package com.kian.socialhub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kian.socialhub.model.Society; 

@Service
public class SocietyService {
    public List<Society> getAllSocieties() {
        return List.of(
            new Society(1L, "Photography Club", "A club for photography enthusiasts.", 50.0, 120, "Arts", "https://images.unsplash.com/photo-1554048612-b6a482bc67e5?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            new Society(2L, "Robotics Society", "Exploring the world of robotics and AI.", 75.0, 80, "Technology", "https://images.unsplash.com/photo-1488590528505-98d2b5aba04b?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            new Society(3L, "Drama Club", "For those passionate about theater and acting.", 40.0, 60, "Performing Arts", "https://images.unsplash.com/photo-1583787035686-91b82ad5d811?q=80&w=1074&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        );
    }
}