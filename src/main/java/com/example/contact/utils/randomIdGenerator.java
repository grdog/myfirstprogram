package com.example.contact.utils;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

/**
 * @author bianjiang
 */
@Component
public class randomIdGenerator {
    // 保证所有内存线程可见
    private volatile static randomIdGenerator instance;
    // 防止编译器自动生成一个public属性的构造方法
    private randomIdGenerator(){}
    public static randomIdGenerator getInstance(){
        if(instance == null){
            synchronized (randomIdGenerator.class){
                if(instance == null){
                    instance = new randomIdGenerator();
                }
            }
        }
        return instance;
    }
    public Long generateId(){
        SecureRandom secureRandom = new SecureRandom();
        long rangeStart = 1000000000L;
        long rangeEnd = 9999999999L; // 最大的10位数
        long rangeSize = rangeEnd - rangeStart + 1;
        long id = rangeStart + (secureRandom.nextLong() & Long.MAX_VALUE) % rangeSize;
        return Long.valueOf(id);
    }


}
