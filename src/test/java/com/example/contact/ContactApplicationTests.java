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
        long start=System.nanoTime();
        Long id=idGenerator.generateId();
        long end=System.nanoTime();
        System.out.println(id);
        System.out.println("该段代码运行所需时间:"+(end-start)/10e6+"毫秒");
    }
}
