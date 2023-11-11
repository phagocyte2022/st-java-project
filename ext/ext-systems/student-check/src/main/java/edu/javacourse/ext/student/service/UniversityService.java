package edu.javacourse.ext.student.service;

import edu.javacourse.ext.student.dao.FacultyRepository;
import edu.javacourse.ext.student.dao.UniversityRepository;
import edu.javacourse.ext.student.domain.Faculty;
import edu.javacourse.ext.student.domain.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UniversityService {
    @Autowired
    private UniversityRepository universityRepository;
    @Autowired
    private FacultyRepository facultyRepository;

    @Transactional(readOnly = true)
    public List<University> findUniversities(){
        return universityRepository.findAll();

    }

    @Transactional(readOnly = true)
    public List<Faculty> findFaculties(){
        return facultyRepository.findAll();

    }
}
