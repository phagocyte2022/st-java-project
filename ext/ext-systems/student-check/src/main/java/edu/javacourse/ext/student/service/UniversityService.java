package edu.javacourse.ext.student.service;

import edu.javacourse.ext.student.dao.UniversityRepository;
import edu.javacourse.ext.student.domain.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UniversityService {
    @Autowired
    private UniversityRepository universityRepository;

    @Transactional(readOnly = true)
    public List<University> findUniversities(){
        return universityRepository.findAll();

    }
}
