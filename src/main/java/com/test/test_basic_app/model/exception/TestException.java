package com.test.test_basic_app.model.exception;

import lombok.Data;

@Data
public class TestException extends RuntimeException{
    TestAPI errorMessage;
    TestError errorReason;

    public TestException(TestAPI errorMessage, TestError errorReason) {
        this.errorMessage = errorMessage;
        this.errorReason = errorReason;
    }

    public TestAPI getErrorMessage() {
        return errorMessage;
    }

    public TestError getErrorReason() {
        return errorReason;
    }

    public void setErrorMessage(TestAPI errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setErrorReason(TestError errorReason) {
        this.errorReason = errorReason;
    }
}
