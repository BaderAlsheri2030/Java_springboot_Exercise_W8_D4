package com.example.schoolmanagmentsystem.Service;

import com.example.schoolmanagmentsystem.Api.ApiException;
import com.example.schoolmanagmentsystem.Model.Teacher;
import com.example.schoolmanagmentsystem.Repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository repository;
    public List<Teacher> getTeachers(){
        return repository.findAll();
    }

    public void addTeacher(Teacher teacher){
        repository.save(teacher);
    }

    public void updateTeacher(Integer id,Teacher teacher){
        Teacher teacher1 = repository.findTeacherById(id);
        if (teacher1 == null){
            throw new ApiException("Invalid id");
        }
        teacher1.setAddress(teacher.getAddress());
        teacher1.setEmail(teacher.getEmail());
        teacher1.setSalary(teacher.getSalary());
        teacher1.setAge(teacher.getAge());
        repository.save(teacher1);
    }

    public void deleteTeacher(Integer id){
        Teacher teacher = repository.findTeacherById(id);
        if (teacher == null){
            throw new ApiException("Invalid id");
        }
        repository.delete(teacher);
    }
}
