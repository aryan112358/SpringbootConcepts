package com.test.test_basic_app.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class TestGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TestException.class)
    public ResponseEntity<TestErrorResponse> handleTestException(TestException testException){
        switch(testException.getErrorReason()) {
            case TEST_ERROR_INVALID_ID,TEST_ERROR_INVALID_NAME ->{
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new TestErrorResponse(
                        testException.getErrorMessage().getErrorMessage(),
                        testException.getErrorReason().getErrorReason()
                ));
            }
            default  -> {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new TestErrorResponse(
                        testException.getErrorMessage().getErrorMessage(),
                        TestError.INTERNAL_ERROR.getErrorReason()
                ));
            }
        }
    }
}
