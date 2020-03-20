package ua.lviv.iot.springFirstProject.rest.model;

public class Student {

  public Student(String firstName, String secondName) {
    this.firstName = firstName;
    this.secondName = secondName;
  }

  public Student() {

  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  private String firstName;
  private String secondName;
  private int Id;
  
  public int getId() {
    return Id;
  }

  public void setId(int id) {
    this.Id = id;
  }

 
}
