package ua.lviv.iot.spring.first.dataaccess;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.spring.first.restapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

  List<Student> getAllByFirstName(String firstName);

  List<Student> getAllByFirstNameAndLastName(String firstName, String lastName);

  Student findBestStudent();

}
