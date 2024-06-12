package com.demoproject.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	// /courses
	// Course: id, name, author

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "Kalhari Chathumini"),
				new Course(2, "Learn DevOps", "Chathumini Ekanayake"),
				new Course(3, "Learn Azure", "Vijitha Ekanayake"),
				new Course(4, "Learn GCP", "Chathuri Ekanayake")
				);
	}
}
