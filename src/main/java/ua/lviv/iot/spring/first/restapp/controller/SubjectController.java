package ua.lviv.iot.spring.first.restapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.first.business.SubjectService;
import ua.lviv.iot.spring.first.restapp.model.Subject;

@RestController
public class SubjectController {

  @Autowired
  private SubjectService subjectService;
  
  public List<Subject> getAllSubjects() {
    return subjectService.findAll();
  }
}
