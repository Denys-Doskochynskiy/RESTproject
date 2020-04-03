package ua.lviv.iot.spring.first.restapp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Student {
  private String firstName;
  private String secondName;
  
 
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

  public void setGroup(Group group) {
    this.group = group;
  }

  public Student(String firstName, String secondName) {
    super();
    // this.id=id;
    this.firstName = firstName;
    this.secondName = secondName;
  }


  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
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
