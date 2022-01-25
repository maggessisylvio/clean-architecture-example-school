package org.cleanarchitecture.school.domain.student;

import org.cleanarchitecture.school.domain.student.Telephone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneTest {

    @Test
    void shouldNotCreateTelephoneWithInvalidDDD() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telephone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telephone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telephone("1", "123456789"));
    }

    @Test
    void shouldNotCreateTelephoneWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telephone("11", null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telephone("11", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telephone("11", "123"));
    }

    @Test
    void shouldCreateTelephoneWithValidNumberAndDDD() {
        assertDoesNotThrow(() -> new Telephone("11", "123456789"));
    }
}