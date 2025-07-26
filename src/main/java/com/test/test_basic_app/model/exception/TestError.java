package com.test.test_basic_app.model.exception;

public enum TestError {
    TEST_ERROR_INVALID_ID("The userId is invalid"),
    TEST_ERROR_INVALID_NAME("The userName is invalid"),
    INTERNAL_ERROR("Internal Error occured , reach admin");
    private String errorReason;

    TestError ( String errorReason){
        this.errorReason = errorReason;
    }

    public String getErrorReason(){
        return errorReason;
    }
    public void setErrorReason(String errorReason){
        this.errorReason = errorReason;

    }
}
