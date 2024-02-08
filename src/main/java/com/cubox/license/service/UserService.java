package com.cubox.license.service;

import com.cubox.license.constant.RoleType;
import com.cubox.license.dto.UserDto;
import com.cubox.license.entity.User;
import com.cubox.license.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(UserDto userDto) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userDto.setRoleType(RoleType.ADMIN);
        User user = new User(userDto);
        userRepository.save(user);
    }
}
