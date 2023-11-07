package edu.javacourse.ext.register.dao;

import edu.javacourse.ext.register.domain.MarriageCertificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarriageDao extends JpaRepository <MarriageCertificate, Long>{

}
