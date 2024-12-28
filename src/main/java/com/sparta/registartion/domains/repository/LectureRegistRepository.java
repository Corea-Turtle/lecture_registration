package com.sparta.registartion.domains.repository;

import com.sparta.registartion.domains.entity.LectureRegist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRegistRepository extends JpaRepository<LectureRegist, Long> {

}
