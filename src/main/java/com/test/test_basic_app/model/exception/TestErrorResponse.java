package com.test.test_basic_app.model.exception;

public class TestErrorResponse {
    private String errorMessage;
   private String errorReason;

    public TestErrorResponse(String errorMessage, String errorReason) {
        this.errorMessage = errorMessage;
        this.errorReason = errorReason;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    public String getErrorReason() {
        return errorReason;
    }
}
