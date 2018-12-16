package com.hw.springannotation.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @Description
 * @Author Administrator
 * @Date 2018/12/16
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert() {
        String sql = "insert into tbl_user(username,age) values(?,?)";
        jdbcTemplate.update(sql, UUID.randomUUID().toString().substring(5, 10), 14);
    }
}
