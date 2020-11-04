package com.lc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommomReslut<T> {

    private int code;

    private String message;

    private T object;

    public CommomReslut(int code, String message) {
        this(code, message, null);
    }
}
