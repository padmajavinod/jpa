package com.nisum.pocwithjpa.services;

import com.nisum.pocwithjpa.model.Course;
import com.nisum.pocwithjpa.model.CustomerDetails;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    public Course addData(Course course);
    public Optional<Course> getCourseDetailsById(String id);
    public Iterable<Course> getAllCourseDetails();
    public Course updateDetails(Course course);
    public void deleteCourse(String id);
    public List<Course> getCourseDetailsBystudId(String cid);


}
