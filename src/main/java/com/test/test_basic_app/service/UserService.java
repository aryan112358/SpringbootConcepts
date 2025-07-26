package com.test.test_basic_app.service;

import com.test.test_basic_app.model.UserData;
import com.test.test_basic_app.model.exception.TestAPI;
import com.test.test_basic_app.model.exception.TestError;
import com.test.test_basic_app.model.exception.TestException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class UserService {

    public UserData getAadhaar(int aadhaarId) {
        return new UserData(aadhaarId, "Ravish");
    }
    public UserData postAadhar(UserData userData){
        return  userData;
    }

    public Object restCallGetAadhaar(int aadhaarId) {
        RestTemplate rest = new RestTemplate();
        return rest.getForObject(
                "http://localhost:8080/v1.0/api/aadhaar/{aadhaarId}",
                UserData.class,
                aadhaarId
        );
    }

    public Object restCallPostAadhaar(UserData userData){
        RestTemplate restTemplate = new RestTemplate();

        throw new TestException(TestAPI.TEST_GET_CALL, TestError.TEST_ERROR_INVALID_ID);

//        return restTemplate.postForObject(  "http://localhost:8080/v1.0/api/aadhaar",
//                userData, UserData.class);
    }
}