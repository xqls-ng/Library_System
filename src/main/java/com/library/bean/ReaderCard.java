package com.library.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 小桥流水
 * @description 功能描述
 * @date 2022-02-13 3:02
 */
@Data
public class ReaderCard implements Serializable {
    private long readerId;
    private String username;
    private String password;
}
