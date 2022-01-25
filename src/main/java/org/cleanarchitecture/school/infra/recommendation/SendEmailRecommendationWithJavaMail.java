package org.cleanarchitecture.school.infra.recommendation;

import org.cleanarchitecture.school.application.recommendation.SendEmailRecommendation;
import org.cleanarchitecture.school.domain.student.Student;

public class SendEmailRecommendationWithJavaMail implements SendEmailRecommendation {

    @Override
    public void sendTo(Student indicated) {
        // lógica de envio de e-mail com a lib JAVA MAIL
    }
}
