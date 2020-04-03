package ua.lviv.iot.spring.first.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.spring.first.restapp.model.Group;

public interface GroupRepository extends JpaRepository<Group, Integer> {

}
