package net.learning.SpringSecurityBasicAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

        @GetMapping("/admin")
        public String testAdmin() {
            return "Hello ADMIN!!";
        }

        @GetMapping("/user")
        public String testUser() {
            return "Hello USER!!";
        }
}
