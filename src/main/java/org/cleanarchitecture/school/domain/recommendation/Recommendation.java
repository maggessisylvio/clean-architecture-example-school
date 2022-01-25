package org.cleanarchitecture.school.domain.recommendation;

import org.cleanarchitecture.school.domain.student.Student;

import java.time.LocalDateTime;

public class Recommendation {

    private Student indicator;
    private Student indicated;
    private LocalDateTime indicationDate;

    public Recommendation(Student indicator, Student indicated) {
        this.indicator = indicator;
        this.indicated = indicated;
        this.indicationDate = LocalDateTime.now();
    }

    public Student getIndicator() {
        return indicator;
    }

    public Student getIndicated() {
        return indicated;
    }

    public LocalDateTime getIndicationDate() {
        return indicationDate;
    }
}
