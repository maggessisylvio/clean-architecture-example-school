package org.cleanarchitecture.school.infra.student;

import org.cleanarchitecture.school.domain.student.CPF;
import org.cleanarchitecture.school.domain.student.Student;
import org.cleanarchitecture.school.domain.student.StudentRepository;
import org.cleanarchitecture.school.domain.student.Telephone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentRepositoryWithJDBC implements StudentRepository {

    private Connection connection;

    public StudentRepositoryWithJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void register(Student student) {
        try {
            String sql = "INSERT INTO STUDENT VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getCpf());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.execute();

            sql = "INSERT INTO TELEPHONE CALUES (?, ?)";
            ps = connection.prepareStatement(sql);
            for (Telephone telephone : student.getTelephones()){
                ps.setString(1, telephone.getDdd());
                ps.setString(2, telephone.getNumber());
            }
        } catch (SQLException e){
           throw new RuntimeException(e);
        }
    }

    @Override
    public Student findByCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Student> findAllStudentsRegistered() {
        return null;
    }
}
