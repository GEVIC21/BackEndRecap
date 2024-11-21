package com.daillycodebuffer.springbootdemo.error;

import com.daillycodebuffer.springbootdemo.model.Employee;

public class EmployeeNotFoundException extends  RuntimeException{
    public EmployeeNotFoundException(String message){
        super(message);
    }
}
