package ua.lviv.iot.spring.first.restapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.spring.first.dataaccess", "ua.lviv.iot.spring.first.business",
    "ua.lviv.iot.spring.first.restapp.controller"})
@EnableJpaRepositories({"ua.lviv.iot.spring.first.dataaccess"})
public class RestappApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestappApplication.class, args);
  }

}
