package net.learning.HttpServletRequest.Attribute.exception;

import net.learning.HttpServletRequest.Attribute.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;

@RestControllerAdvice
public class ErrorHandler{

    @ExceptionHandler({ValidationException.class})
    public ResponseEntity<ErrorResponse> handleValidationException(ValidationException validationException,
                                                                   ServletWebRequest servletWebRequest) {
        ErrorResponse errorResponse =  new ErrorResponse(validationException.getMultipleErrors());

       return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
}
