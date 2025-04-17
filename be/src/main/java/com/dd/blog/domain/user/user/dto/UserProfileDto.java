package com.dd.blog.domain.user.user.dto;

import com.dd.blog.domain.user.user.entity.User;
import com.dd.blog.domain.user.user.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfileDto {
    private Long id;
    private String email;
    private String nickname;
    private int remainingPoint;
    private int totalPoint;
    private UserRole role;
    private LocalDateTime createdAt;
    private boolean isSocialUser;

    private int postCount;       // 작성한 게시글 수
    private int followerCount;   // 팔로워 수
    private int followingCount;  // 팔로잉 수

    public static UserProfileDto fromEntity(User user, int postCount, int followerCount, int followingCount) {
        return UserProfileDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .nickname(user.getNickname())
                .remainingPoint(user.getRemainingPoint())
                .totalPoint(user.getTotalPoint())
                .role(user.getRole())
                .createdAt(user.getCreatedAt())
                .postCount(postCount)
                .followerCount(followerCount)
                .followingCount(followingCount)
                .build();
    }
}
