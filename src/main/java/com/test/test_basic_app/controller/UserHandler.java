package com.test.test_basic_app.controller;

import com.test.test_basic_app.model.UserData;
import com.test.test_basic_app.model.exception.TestAPI;
import com.test.test_basic_app.model.exception.TestError;
import com.test.test_basic_app.model.exception.TestException;
import com.test.test_basic_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1.0/api", produces = "application/json")
@CrossOrigin(origins = "*")
public class UserHandler {

    @Autowired
    private UserService userService;

    @GetMapping("/aadhaar/{aadhaarId}")
    public ResponseEntity<?> getAadhaar(@PathVariable("aadhaarId") final int aadhaarId) {
        return ResponseEntity.ok(userService.getAadhaar(aadhaarId));
    }
    @PostMapping("/aadhaar")
    public ResponseEntity<?> postAadhaar(@RequestBody  UserData userData) {
        return ResponseEntity.ok(userService.postAadhar(userData));
    }

    @PostMapping("/post")
    public ResponseEntity<?> postAadhaarBody(@RequestBody UserData userData){
        HttpHeaders httpHeaders = new HttpHeaders();


        return  ResponseEntity.ok().body(
                userService.restCallPostAadhaar(userData)
        );

    }

    @GetMapping("/find/{aadhaarId}")
    public ResponseEntity<?> findAadhaar(@PathVariable("aadhaarId") final int aadhaarId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        return new ResponseEntity<>(
                userService.restCallGetAadhaar(aadhaarId),
                httpHeaders,
                HttpStatus.CREATED
        );
    }
}