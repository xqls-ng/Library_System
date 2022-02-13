package com.library.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 小桥流水
 * @description 功能描述
 * @date 2022-02-13 3:13
 */
@Data
public class ReaderInfo implements Serializable {
    private long reader_id;
    private String name;
    private String sex;
    private Date birth;
    private String address;
    private String phone;
}
