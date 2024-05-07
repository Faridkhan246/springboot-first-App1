package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ramesh","Fadatare");
	}
@GetMapping("/students")
	public List<Student>getStudents(){
	List<Student>students =new ArrayList<>();
	students.add(new Student("Ramesh","Fadatare"));
	students.add(new Student("Tony","Cena"));
	students.add(new Student("Sanjay","Jadhav"));
	students.add(new Student("Ram","jadhav"));
	students.add(new Student("Umesh","Fadatare"));
	return students;
}
//http://localhost:8080/student/ramesh/fadatare
//@PathVariable annotation
@GetMapping("{firstName}/{lastName}")
public Student studentpathVariable(@PathVariable("firstName")String firstName,
		@PathVariable("lastName")String lastName) {
	return new Student(firstName,lastName);
}
//build rest Api to handle query parameters
//http://localHost:8080/student?firstName=Ramesh&lastName=Fadatre
@GetMapping("/student/query")
public Student studentQueryparam(@RequestParam(name="firstName")String
		firstName,@RequestParam(name="lastName")String lastName) {
	return new Student(firstName,lastName);
	
}

	
	
}
