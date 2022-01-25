package org.cleanarchitecture.school.infra.student;

import org.cleanarchitecture.school.domain.student.CPF;
import org.cleanarchitecture.school.domain.student.Student;
import org.cleanarchitecture.school.domain.student.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentRepository {

    private List<Student> registered = new ArrayList<>();

    @Override
    public void register(Student student) {
        this.registered.add(student);
    }

    @Override
    public Student findByCPF(CPF cpf) {
        return this.registered.stream()
                .filter(student ->
                        student.getCpf().equals(cpf.getNumber())
                ).findFirst()
                .orElseThrow(() -> new RuntimeException("Student not found!"));
    }

    @Override
    public List<Student> findAllStudentsRegistered() {
        return null;
    }
}
