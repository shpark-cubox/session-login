package com.cubox.license;

import com.cubox.license.constant.RoleType;
import com.cubox.license.dto.UserDto;
import com.cubox.license.entity.User;
import com.cubox.license.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCreateUser() {
        UserDto userDto = new UserDto(null, "dcun@cubox.aero", "123", "dcun", "devlop", "pro", RoleType.ADMIN, "dcun", null, null, null);
        User user = new User(userDto);
        User exist = userRepository.save(user);
    }
}
