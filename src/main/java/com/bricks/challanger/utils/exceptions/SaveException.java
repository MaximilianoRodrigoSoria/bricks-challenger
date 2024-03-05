package com.bricks.challanger.utils.exceptions;

public class SaveException extends RuntimeException{
    private final static String ERROR_MESSAGE = "Registration could not be saved in  %s table";
    public SaveException(String tableName){
        super(String.format(ERROR_MESSAGE,tableName));
    }
}