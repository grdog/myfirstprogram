package com.example.contact;

import com.example.contact.utils.randomIdGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ContactApplicationTests {
    @Autowired
    private randomIdGenerator idGenerator=randomIdGenerator.getInstance();
    @Test
    void test() {
        System.out.println(idGenerator.generateId());
    }

}
