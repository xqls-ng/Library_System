package com.library.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 小桥流水
 * @description 功能描述
 * @date 2022-02-13 2:42
 */
@Data
public class Book implements Serializable {
    private long book_id;
    private String name;
    private String author;
    private String publish;
    private String ISBN;
    private String introduction;
    private String language;
    private BigDecimal price;
    private Date pub_date;
    private int class_id;
    private int number;
}
