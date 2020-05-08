package com.jaehyeok.app.repository;



import com.jaehyeok.app.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}