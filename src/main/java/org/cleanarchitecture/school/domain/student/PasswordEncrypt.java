package org.cleanarchitecture.school.domain.student;

public interface PasswordEncrypt {

    String encryptPassword(String password);

    boolean validateEncryptPassword(String encryptPassword, String password);
}
