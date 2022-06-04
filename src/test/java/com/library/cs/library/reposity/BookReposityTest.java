package com.library.cs.library.reposity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class BookReposityTest {
    @Autowired
    private BookReposity bookReposity;
    @Test
    void findAll(){
        System.out.println(bookReposity.findAll());
    }
}
