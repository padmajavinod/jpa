package com.nisum.pocwithjpa.repositories;

import com.nisum.pocwithjpa.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}
