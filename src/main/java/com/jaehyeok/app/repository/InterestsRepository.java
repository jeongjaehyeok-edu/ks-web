package com.jaehyeok.app.repository;

import com.jaehyeok.app.entity.Interests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestsRepository extends JpaRepository<Interests, Long> {
}