package com.chanhmn.backendforum.repository;

import com.chanhmn.backendforum.entity.PostCommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PostCommentRepository extends JpaRepository<PostCommentEntity, Integer> {
    @Query(value = "DELETE FROM post_comment_tbl WHERE " +
            " post_id = :postId", nativeQuery = true)
    void deleteCommentByPostId(@Param("postId") int postId);
}