package com.kian.socialhub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kian.socialhub.model.Society; 

@Service
public class SocietyService {
    public List<Society> getAllSocieties() {
        return List.of(
            new Society(1L, "Photography Club", "A club for photography enthusiasts.", 50.0, 120, "Arts", null),
            new Society(2L, "Robotics Society", "Exploring the world of robotics and AI.", 75.0, 80, "Technology", null),
            new Society(3L, "Drama Club", "For those passionate about theater and acting.", 40.0, 60, "Performing Arts", null)
        );
    }
}
<<<<<<< HEAD:socialhub/src/main/java/com/kian/socialhub/service/SocietyService.Java


=======
>>>>>>> a3ccbd5577306ac1c965df72f32cea134556f9e8:socialhub/src/main/java/com/kian/socialhub/service/SocietyService.java
