package sk.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sk.login.dao.StudentDAOImpl;
import sk.login.model.Student;

@RestController
public class StudentController
{
    @Autowired
    private StudentDAOImpl studentDAOImpl;
    
    /*** Creating a new Student ***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/register", method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
    public void createStudent(@RequestBody Student student)
    {
        studentDAOImpl.createStudent(student);
    }
    
    /*** Retrieve a single Student by name and age***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/student/{name}/{age}",produces="application/json",
            method=RequestMethod.GET)
    public Student getStudent(@PathVariable("name") String name, @PathVariable("age") long age)
    {
        Student student = studentDAOImpl.getStudent(name, age);
        return student;
    }
}
