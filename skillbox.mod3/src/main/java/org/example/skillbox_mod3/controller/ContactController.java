package org.example.skillbox_mod3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/contact")
public class ContactController {
    @GetMapping("/all")
    public String all() {
        return null;
    }

    @PostMapping("/add")
    public String add() {
        return null;
    }

    @DeleteMapping("")
    public String delete() {
        return null;
    }

    @PatchMapping("/update")
    public String update() {
        return null;
    }
}
