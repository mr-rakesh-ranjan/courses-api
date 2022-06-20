package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
