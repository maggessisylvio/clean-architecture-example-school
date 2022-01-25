package org.cleanarchitecture.school.application.recommendation;

import org.cleanarchitecture.school.domain.student.Student;

public interface SendEmailRecommendation {

    void sendTo(Student indicated);
}
