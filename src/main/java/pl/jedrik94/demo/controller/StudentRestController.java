package pl.jedrik94.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.jedrik94.demo.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/rest-api")
public class StudentRestController {

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getStudent() {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Wojtkowiak", "Jedrzej"));
        studentList.add(new Student("Wojtkowiak", "Milosz"));

        return studentList;
    }
}
