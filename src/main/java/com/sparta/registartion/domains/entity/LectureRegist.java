package com.sparta.registartion.domains.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lecture_regist")
public class LectureRegist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long lectureId;

    @Column(nullable = false)
    private LocalDateTime registTime;

    public Long getRegistId() {
        return registId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getLectureId() {
        return lectureId;
    }

    public LocalDateTime getRegistTime() {
        return registTime;
    }
}
