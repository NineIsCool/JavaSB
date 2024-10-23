package org.example.skillbox_mod4.adapter.web;

import lombok.RequiredArgsConstructor;
import org.example.skillbox_mod4.adapter.web.dto.UserDto;
import org.example.skillbox_mod4.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("all")
    public List<UserDto> getAll(){
        return userService.getAll();
    }

    @PostMapping("add")
    public void add(@RequestParam("name") String name){
        userService.add(name);
    }

    @DeleteMapping("delete")
    public void delete(@RequestParam("id") Long id){
        userService.delete(id);
    }
}
