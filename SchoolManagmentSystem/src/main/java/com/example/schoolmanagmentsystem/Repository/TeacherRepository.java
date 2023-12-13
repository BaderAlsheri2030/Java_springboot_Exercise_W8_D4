package com.example.schoolmanagmentsystem.Repository;

import com.example.schoolmanagmentsystem.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

    Teacher findTeacherById(Integer id);
}
