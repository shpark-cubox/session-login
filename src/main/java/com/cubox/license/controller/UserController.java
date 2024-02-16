package com.cubox.license.controller;

import com.cubox.license.dto.UserDto;
import com.cubox.license.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model, UserDto userDto) {
        model.addAttribute("userDto", userDto);
        return "user/signup_form";
    }

    @PostMapping("/process_register")
    public String processRegister(UserDto userDto) {
        userService.save(userDto);
        return "login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}
