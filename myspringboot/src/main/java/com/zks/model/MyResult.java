package com.zks.model;

import lombok.Data;

import java.util.List;

/**
 * Created by 韦师兄
 * 2019-03-12 14:39
 */

/**
 * getter setter
 */
@Data
public class MyResult {
    private int code;
    private String msg;
    private List<?> list;
    private Object obj;

}
