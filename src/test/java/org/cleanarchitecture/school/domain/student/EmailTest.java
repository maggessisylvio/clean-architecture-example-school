package org.cleanarchitecture.school.domain.student;

import org.cleanarchitecture.school.domain.student.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldNotCreateEmailsWithInvalidAddresses() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("invalid-email"));
    }

    @Test
    void shouldCreateEmailWithValidAddress(){
        assertDoesNotThrow(() -> new Email("sylviodev@gmail.com"));
    }
}