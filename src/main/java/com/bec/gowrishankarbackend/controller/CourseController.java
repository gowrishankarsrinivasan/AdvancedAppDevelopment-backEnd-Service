package com.bec.gowrishankarbackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.gowrishankarbackend.model.CourseData;
import com.bec.gowrishankarbackend.service.CourseService;

@RestController

// @RequestMapping(MyConstant.COURSE_API)
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("data")
    public List<CourseData> getAllCourseData() {
        return courseService.getCourseData();

    }
}
