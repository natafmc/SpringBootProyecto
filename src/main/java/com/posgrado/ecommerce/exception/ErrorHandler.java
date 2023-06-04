package com.posgrado.ecommerce.exception;

import com.posgrado.ecommerce.exception.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

  @ExceptionHandler
  public ResponseEntity<ErrorResponse> handleRoleNameExists(Exception ex){
    HttpStatus code = HttpStatus.CONFLICT;
    ErrorResponse error = ErrorResponse.builder()
        .code(code.value())
        .error(code.name())
        .message(ex.getMessage())
        .build();
    return ResponseEntity.status(code).body(error);
  }

}