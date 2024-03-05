package com.bricks.challanger.api.handlers;
import com.bricks.challanger.api.handlers.responses.BaseErrorResponse;
import com.bricks.challanger.api.handlers.responses.ErrorResponse;
import com.bricks.challanger.api.handlers.responses.ErrorsResponse;
import com.bricks.challanger.utils.exceptions.CategoryNotFoundException;
import com.bricks.challanger.utils.exceptions.IdNotFoundException;
import org.springframework.http.HttpStatus;


import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;

@RestControllerAdvice
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ErrorHandler {

    @ExceptionHandler({IdNotFoundException.class, CategoryNotFoundException.class})
    public BaseErrorResponse notFoundExceptions(RuntimeException exception){
        return  ErrorResponse.builder()
                .message(exception.getMessage())
                .code(HttpStatus.NOT_FOUND.value())
                .status(HttpStatus.NOT_FOUND.name())
                .build();
    }


    @ExceptionHandler({Exception.class})
    public BaseErrorResponse geneticExceptions(RuntimeException exception){
        return  ErrorResponse.builder()
                .message(exception.getMessage())
                .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.name())
                .build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseErrorResponse handleIdNotFound(MethodArgumentNotValidException exception) {
        var errors = new ArrayList<String>();
        exception.getAllErrors()
                .forEach(error -> errors.add(error.getDefaultMessage()));

        return ErrorsResponse.builder()
                .errors(errors)
                .status(HttpStatus.BAD_REQUEST.name())
                .code(HttpStatus.BAD_REQUEST.value())
                .build();
    }


}