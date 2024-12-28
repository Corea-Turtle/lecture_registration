package com.sparta.registartion.domains.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name = "lecture")
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lectureId;

    @Column(length=100, nullable = false)
    private String lectureName;

    @Column
    private String instructorName;



    @Column
    private LocalDateTime lectureStart;

    @Column
    private LocalDateTime lectureEnd;


    public Long getLectureId() {
        return lectureId;
    }

    public String getLectureName() {
        return lectureName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public LocalDateTime getLectureStart() {
        return lectureStart;
    }

    public LocalDateTime getLectureEnd() {
        return lectureEnd;
    }
}
