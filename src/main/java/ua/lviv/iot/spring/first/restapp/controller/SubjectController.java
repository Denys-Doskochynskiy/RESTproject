package ua.lviv.iot.spring.first.restapp.controller;

import java.util.List;
import javax.security.auth.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.first.business.SubjectService;

@RequestMapping("/subjects")
@RestController
public class SubjectController {

  @Autowired
  SubjectService subjectService;

  @GetMapping
  public List<Subject> getAllSubjects() {
      return subjectService.findAll();
  }
}
