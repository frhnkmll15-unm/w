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
import com.juaracoding.mfkspringbootjpa.utils.ConstantMessage;

import java.util.regex.Pattern;

public class FormatValidation {


    public static void emailFormatValidation(String email) throws Exception
    {
        if(!(Pattern.compile(ConstantMessage.REGEX_EMAIL_STANDARD_RFC5322)
                .matcher(email)
                .matches()))
        {
            throw new ResourceNotFoundException(ConstantMessage.ERROR_EMAIL_FORMAT_INVALID);
        }
    }

    public static void phoneNumberFormatValidation(String phoneNumner) throws Exception
    {
        if(!(Pattern.compile(ConstantMessage.REGEX_PHONE)
                .matcher(phoneNumner)
                .matches()))
        {
            throw new ResourceNotFoundException(ConstantMessage.ERROR_PHONE_NUMBER_FORMAT_INVALID);
        }
    }

    public static void dateFormatYYYYMMDDValidation(String date) throws Exception
    {
        if(!(Pattern.compile(ConstantMessage.REGEX_DATE_YYYYMMDD)
                .matcher(date)
                .matches()))
        {
            throw new ResourceNotFoundException(ConstantMessage.ERROR_DATE_FORMAT_YYYYMMDD);
        }
    }

//    public static boolean numericValidation(Object a)
//    {
//        if(a instanceof Double)if((Double)a==0.0)return false;
//        else if (a instanceof Integer)if((Integer)a==0)return false;
//        else if (a instanceof Float)if((Float)a==0.0)return false;
//        else if (a instanceof Long)if((Long)a==0) return false;
//        else if (a instanceof Short)if((Short)a==0) return false;
//        else if (a instanceof Byte)if((Byte)a==0) return false;
//
//        String x = a.toString();
//        if(x.equals("0.0") || x.equals("0"))return false;
//
//        int intK = 0123;
//        if(x.startsWith("0"))return false;
//
//
//
//        return true;
//    }
}
