package com.demo.springboot.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exc, WebRequest webRequest){
        return new ResponseEntity<>(new ErrorDetails(LocalDateTime.now(), exc.getMessage(), webRequest.getDescription(false),"USER_NOT_FOUND" ), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(EmailAlreadyExistsException.class)

    public ResponseEntity<ErrorDetails> handleEmailAlreadyExistsException(EmailAlreadyExistsException exc, WebRequest webRequest){
        return new ResponseEntity<>(new ErrorDetails(LocalDateTime.now(), exc.getMessage(), webRequest.getDescription(false),"EMAIL_EXISTS" ), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGeneralException(Exception exc, WebRequest webRequest){
        return new ResponseEntity<>(new ErrorDetails(LocalDateTime.now(), exc.getMessage(), webRequest.getDescription(false),"INTERNAL_SERVER_ERROR" ), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        //return super.handleMethodArgumentNotValid(ex,headers,status,request);
        Map<String,String> errorMap=new HashMap<>();
        List<ObjectError> errorList =new ArrayList<>();
        errorList=ex.getAllErrors();
        errorList.forEach((error)->{
            String fieldName=((FieldError)error).getField();
            String message=error.getDefaultMessage();
            errorMap.put(fieldName,message);
        });
        return new ResponseEntity<>(errorMap,HttpStatus.BAD_REQUEST);

    }
}
