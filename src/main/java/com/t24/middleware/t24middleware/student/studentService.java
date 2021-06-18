package com.t24.middleware.t24middleware.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.SchemaOutputResolver;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class studentService {

    private final StudentRepository studentRepository;

    @Autowired
    public studentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
        /*return List.of(
                new Student(1L,"Rafa","rafa@gmail.com", LocalDate.of(2013, Month.JANUARY, 7),8),
                new Student(2L,"Zeesun","zeesun@gmail.com",LocalDate.of(2010, Month.OCTOBER, 7),11)
        );*/
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("Email Taken");
        }
        studentRepository.save(student);
    }
}
