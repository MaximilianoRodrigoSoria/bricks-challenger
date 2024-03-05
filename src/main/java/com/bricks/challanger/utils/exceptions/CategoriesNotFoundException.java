package com.bricks.challanger.utils.exceptions;

public class CategoriesNotFoundException extends RuntimeException{
    public CategoriesNotFoundException(String msg){
        super(msg);
    }
}