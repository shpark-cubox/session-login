package com.cubox.license.dto;

import com.cubox.license.constant.RoleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// default: private final, Getter 자동 생성
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String email;
    private String password;
    private String username;
    private String department;
    private String position;
    private RoleType roleType;
    private String createdBy;
    private LocalDateTime createdDt;
    private String modifiedBy;
    private LocalDateTime modifiedD;
}
