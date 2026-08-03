package com.example.testproject.common.exception;

import com.example.testproject.common.Constants;
import org.springframework.http.HttpStatus;

public class AroundHubException extends Exception {

    private static final long serialVersionUID = 4663380430591151694L;

    private Constants.ExceptionClass exptionClass;
    private HttpStatus httpStatus;

    public AroundHubException(Constants.ExceptionClass exceptionClass, HttpStatus httpStatus, String message){
        super(exceptionClass.toString() + message);
        this.exptionClass = exceptionClass;
        this.httpStatus = httpStatus;
    }

    public Constants.ExceptionClass getExptionClass(){
        return exptionClass;
    }

    public int getHttpStatusCode(){
        return httpStatus.value();
    }

    public String getHttpStatusType(){
        return httpStatus.getReasonPhrase();
    }

    public HttpStatus getHttpStatus(){
        return httpStatus;
    }
}
