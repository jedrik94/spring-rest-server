package pl.jedrik94.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.jedrik94.demo.exception.StudentNotFoundException;
import pl.jedrik94.demo.model.Student;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/rest-api")
public class StudentRestController {

    private List<Student> studentList = new ArrayList<>();

    @PostConstruct
    private void loadData() {
        studentList.add(new Student("Wojtkowiak", "Jedrzej"));
        studentList.add(new Student("Wojtkowiak", "Milosz"));
        studentList.add(new Student("Wojtkowiak", "Hanna"));
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getStudents() {
        return studentList;
    }

    @RequestMapping(value = "/students/{studentId}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable int studentId) {

        if (studentId >= studentList.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return studentList.get(studentId);
    }
}
