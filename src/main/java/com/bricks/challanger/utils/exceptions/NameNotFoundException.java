package com.bricks.challanger.utils.exceptions;

public class NameNotFoundException extends RuntimeException{
    private final static String ERROR_MESSAGE = "Record no exist in %s";
    public NameNotFoundException(String tableName){
        super(String.format(ERROR_MESSAGE,tableName));
    }
}