package com.anubhavtyagi28.springsecurity.repositories;

import com.anubhavtyagi28.springsecurity.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
