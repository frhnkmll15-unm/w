package com.juaracoding.mfkspringbootjpa.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 09/02/2023 21:46
@Last Modified 09/02/2023 21:46
Version 1.0
*/
public class ResponseHandler {


    public ResponseHandler() {
    }

    public ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj, Object errorCode, WebRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", message);
        map.put("status", status.value());
        map.put("data", responseObj==null?"":responseObj);
        map.put("timestamp", new Date());
        map.put("success",!status.isError());
        if(errorCode != null)
        {
            map.put("error_code",errorCode);
            map.put("path",request.getDescription(false));
        }
        return new ResponseEntity<Object>(map,status);
    }
}
