package edu.javacourse.ext.student.dao;

import edu.javacourse.ext.student.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository <Faculty, Long> {


}
