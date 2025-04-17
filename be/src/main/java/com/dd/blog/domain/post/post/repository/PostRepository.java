package com.dd.blog.domain.post.post.repository;

import com.dd.blog.domain.post.post.entity.Post;
import com.dd.blog.domain.post.category.entity.Category;

import com.dd.blog.domain.user.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByPostId(Long postId);
    // 특정 카테고리의 게시글만 조회
    List<Post> findByCategory(Category category);

    //특정 사용자가 작성한 게시글 리스트
    List<Post> findByUserId(Long userId);
}
