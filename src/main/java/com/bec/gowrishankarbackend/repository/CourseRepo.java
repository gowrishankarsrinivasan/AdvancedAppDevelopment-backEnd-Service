package com.bec.gowrishankarbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bec.gowrishankarbackend.model.CourseData;

public interface CourseRepo extends JpaRepository<CourseData, String> {

}
