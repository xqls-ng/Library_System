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
    private long serNum;
    private long bookId;
    private long readerId;
    private Date lendDate;
    private Date backDate;
}
