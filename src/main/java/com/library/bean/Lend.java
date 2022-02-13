package com.library.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 小桥流水
 * @description 功能描述
 * @date 2022-02-13 3:01
 */
@Data
public class Lend implements Serializable {
    private long ser_num;
    private long book_id;
    private long reader_id;
    private Date lend_date;
    private Date back_date;
}
