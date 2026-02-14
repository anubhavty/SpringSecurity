package com.anubhavtyagi28.springsecurity;

import com.anubhavtyagi28.springsecurity.entities.User;
import com.anubhavtyagi28.springsecurity.services.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringsecurityApplicationTests {
    @Autowired
    private JwtService jwtService;

	@Test
	void contextLoads() {
        User user = new User(4L, "anubhav@gmail.com", "1234");

        String token = jwtService.generateToken(user);

        System.out.println(token);

        Long userId = jwtService.getUserIdFromToken(token);
        System.out.println(userId);
	}

}
