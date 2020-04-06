package ua.lviv.iot.spring.first.business;

import org.springframework.stereotype.Service;

import ua.lviv.iot.spring.first.dataaccess.SubjectRepository;
import java.util.List;
import javax.security.auth.Subject;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SubjectService {
 
  @Autowired
  SubjectRepository subjectRepository;

  public List<Subject> findAll() {
      return subjectRepository.findAll();
  }
}
