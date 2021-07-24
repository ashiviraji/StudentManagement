package com.ashika.thymleafapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashika.thymleafapp.models.Student;
import com.ashika.thymleafapp.repositories.StudnetRepository;

@Service
public class StudentService {
   
	@Autowired
	private StudnetRepository studentRepository;
	
	
	public List<Student> getAll(){
		return (List<Student>)studentRepository.findAll();
	}
	public Optional<Student> getOne(Integer Id) {
		return studentRepository.findById(Id);
		
	}
	
	public void addNew(Student student) {
		studentRepository.save(student);
	}
	
	public void update(Student student) {
		studentRepository.save(student);
	}
	
	public void delete(Integer Id) {
		studentRepository.deleteById(Id);
		
	}
}
