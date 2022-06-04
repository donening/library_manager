package com.library.cs.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.cs.library.entity.BookInfo;
import com.library.cs.library.reposity.BookReposity;

@RestController
@RequestMapping("/book")
/**
 * @author 张越
 */
public class BookHandler {
    @Autowired
    private BookReposity bookReposity;

    @GetMapping("/findAll")
    public List<BookInfo> findAll() {
        return bookReposity.findAll();
    }
}
