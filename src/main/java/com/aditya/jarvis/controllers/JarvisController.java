package com.aditya.jarvis.controllers;

import com.aditya.jarvis.constants.Status;
import com.aditya.jarvis.pojo.ReturnEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by Aditya on 9/20/2018.
 */

@RestController
public class JarvisController {

    @RequestMapping("/verify/{email}")
    public ResponseEntity<Object> verifyEmailAndSerial(@PathVariable String email) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        String validEmail = "aditya.chandel101";
        Map<String, Boolean> valid = new HashMap<>();
        String message;
        List<Object> data = new ArrayList<>();
        if (email.equalsIgnoreCase(validEmail)) {
            valid.put("valid", true);
            data.add(valid);
            message = "Email validation successful";
            return new ResponseEntity<>(new ReturnEntity(Status.SUCCESS, data, message), HttpStatus.OK);
        } else {
            valid.put("Valid", true);
            data.add(valid);
            message = "Email validation failed";
            return new ResponseEntity<>(new ReturnEntity(Status.SUCCESS, data, message), HttpStatus.OK);
        }
    }

}
