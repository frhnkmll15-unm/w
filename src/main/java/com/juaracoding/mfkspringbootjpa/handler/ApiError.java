package com.juaracoding.mfkspringbootjpa.handler;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.juaracoding.mfkspringbootjpa.utils.ConstantMessage;
//import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 09/02/2023 21:46
@Last Modified 09/02/2023 21:46
Version 1.0
*/

public class ApiError {

    private HttpStatus serverResponse;
    private int status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private String message;
    private String path;
    private List<ApiValidationError> subErrors;
    private String errorCode;

    private ApiError() {
        timestamp = LocalDateTime.now();
    }

    ApiError(HttpStatus serverResponse) {
        this();
        this.serverResponse = serverResponse;
    }

    ApiError(HttpStatus serverResponse, Throwable ex) {
        this();
        this.serverResponse = serverResponse;
        this.message = ConstantMessage.ERROR_UNEXPECTED;
//        this.debugMessage = ex.getMessage();
    }

//    ApiError(HttpStatus serverResponse, String message, Throwable ex,String path,String errorCode) {
    ApiError(HttpStatus serverResponse, String message, Throwable ex,String path,String errorCode) {
        this();
        this.serverResponse = serverResponse;
        this.message = message;
        this.path = path;
        this.errorCode=errorCode;
    }

    public int getStatus() {
        return serverResponse.value();
    }

	public HttpStatus getServerResponse() {
		return serverResponse;
	}

	public void setServerResponse(HttpStatus serverResponse) {
		this.serverResponse = serverResponse;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<ApiValidationError> getSubErrors() {
		return subErrors;
	}

	public void setSubErrors(List<ApiValidationError> subErrors) {
		this.subErrors = subErrors;
	}

//	boonk mulu apaan belom di config kowkow

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
