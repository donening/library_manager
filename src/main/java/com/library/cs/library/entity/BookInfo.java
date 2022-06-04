package com.library.cs.library.entity;

import lombok.Data;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
/**
 * @author 张越
*/
public class BookInfo {
    @Id
    private Integer bookId;
    private String name;
    private String author;
    private String publish;
    private String isbn;
    private String introduction;
    private String language;
    private String price;
    private Date pubDate;
    private Integer classId;
    private Integer number;
}
