package com.bricks.challanger.utils.exceptions;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException(String msg){
        super(msg);
    }
}