package com.test.test_basic_app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class UserData {
    public UserData(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    @Id
    private Integer userId;
    private String userName;
}
