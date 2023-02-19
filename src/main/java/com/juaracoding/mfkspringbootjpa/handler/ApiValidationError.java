package com.juaracoding.mfkspringbootjpa.handler;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 09/02/2023 21:46
@Last Modified 09/02/2023 21:46
Version 1.0
*/
class ApiValidationError {

    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    ApiValidationError(String field, String message,Object rejectedValue,String object) {

        this.object = object;
        this.message = message;
        this.rejectedValue=rejectedValue;
        this.field = field;
    }

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Object getRejectedValue() {
		return rejectedValue;
	}

	public void setRejectedValue(Object rejectedValue) {
		this.rejectedValue = rejectedValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
