package org.exoplatform.addons.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyServiceTest {

    @Test
    void getMessage() {
        MyService my=new MyService();

        assertNotNull(my.getMessage());
        assertEquals("alioua", my.getMessage());
    }
}