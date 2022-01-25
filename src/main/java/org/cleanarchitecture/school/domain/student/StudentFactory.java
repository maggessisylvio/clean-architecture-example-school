package org.cleanarchitecture.school.domain.student;

public class StudentFactory {

    private Student student;

    public StudentFactory withCPFNameEmail(String cpf, String name, String email){
        this.student = new Student(new CPF(cpf), name, new Email(email));
        return this;
    }

    public StudentFactory withTelephone(String ddd, String number){
        this.student.addTelephone(ddd, number);
        return this;
    }

    public Student create(){
        return this.student;
    }
}
