package ua.lviv.iot.spring.first.restapp.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "\"group\"")
public class Group {
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Integer id;

  private String name;
  private Integer enrolmentYear;
  
  @OneToMany(mappedBy = "Group", fetch = FetchType.EAGER)
  @JsonIgnoreProperties("group")
  private Set<Student> students;
  

  public Integer getEnrolmentYear() {
    return enrolmentYear;
  }

  public void setEnrolmentYear(Integer enrolmentYear) {
    this.enrolmentYear = enrolmentYear;
  }

  public Set<Student> getStudents() {
    return students;
  }

  public void setStudents(Set<Student> students) {
    this.students = students;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getEnrolment_year() {
    return enrolmentYear;
  }

  public void setEnrolment_year(Integer enrolment_year) {
    this.enrolmentYear = enrolment_year;
  }

  public Group() {}


}
