package ua.lviv.iot.spring.first.dataaccess;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.spring.first.restapp.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
