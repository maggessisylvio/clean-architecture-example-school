package org.cleanarchitecture.school.domain.student;

import java.util.Objects;

public class Email {

    private String address;

    public Email(String address) {
        if (Objects.isNull(address) ||
                !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Invalid e-mail!");
        }

        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}