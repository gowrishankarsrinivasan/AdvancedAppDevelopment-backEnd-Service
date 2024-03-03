package com.bec.gowrishankarbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.gowrishankarbackend.model.CourseData;
import com.bec.gowrishankarbackend.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    private final CourseRepo courseRepo;

    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public List<CourseData> getCourseData() {
        return courseRepo.findAll();
    }

}
