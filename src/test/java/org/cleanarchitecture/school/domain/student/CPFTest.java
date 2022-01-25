package org.cleanarchitecture.school.domain.student;

import org.cleanarchitecture.school.domain.student.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void shouldNotCreateCPFWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("12345678900"));
    }

    @Test
    void shouldCreateCPFWithValidNumber() {
        assertDoesNotThrow(() -> new CPF("123.456.789-00"));
    }
}