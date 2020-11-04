package com.lc.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "users")
public class Users {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String name;

    private String gender;

    private int age;

    private String address;

    private String qq;

    private String email;

}
