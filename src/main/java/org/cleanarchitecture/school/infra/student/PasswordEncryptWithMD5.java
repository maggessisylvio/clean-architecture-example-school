package org.cleanarchitecture.school.infra.student;

import org.cleanarchitecture.school.domain.student.PasswordEncrypt;

public class PasswordEncryptWithMD5 implements PasswordEncrypt {

    @Override
    public String encryptPassword(String password) {
        return null;
    }

    @Override
    public boolean validateEncryptPassword(String encryptPassword, String password) {
        return false;
    }
}
