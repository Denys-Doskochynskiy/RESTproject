package ua.lviv.iot.spring.first.restapp.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@NamedNativeQuery(name = "Student.findBestStudent", 
query = "select * from student where id = 1")
public class Student {
  private String firstName;
  private String lastName;
  
 
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  public Group getGroup() {
    return group;
  }

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "group_id")
  @JsonIgnoreProperties("students")
  private Group group;

  public Student() {}
  
  @ManyToMany( cascade = {CascadeType.MERGE})
  @JoinTable(name = "Student_Subjects",
  joinColumns = { @JoinColumn(name = "student_id", nullable=false)},
  inverseJoinColumns = { @JoinColumn(name = "subject_id", nullable=true)})
  @JsonIgnoreProperties("students")
  private Set<Subject> subjects;

  public Set<Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(Set<Subject> subjects) {
    this.subjects = subjects;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public Student(String firstName, String secondName) {
    super();
    this.firstName = firstName;
    this.lastName = secondName;
  }


  public String getSecondName() {
    return lastName;
  }

  public void setSecondName(String secondName) {
    this.lastName = secondName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
