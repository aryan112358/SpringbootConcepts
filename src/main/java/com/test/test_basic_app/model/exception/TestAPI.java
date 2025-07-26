package com.test.test_basic_app.model.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public enum TestAPI {
    TEST_GET_CALL("Get failed"),
    TEST_POST_CALL("Post_failed");

    private String errorMessage;

    TestAPI(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage(){
        return errorMessage;
    }


}
