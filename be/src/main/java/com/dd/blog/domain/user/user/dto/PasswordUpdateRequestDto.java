package com.dd.blog.domain.user.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PasswordUpdateRequestDto {
    @NotBlank(message = "새 비밀번호를 입력해주세요.")
    private String newPassword;
}