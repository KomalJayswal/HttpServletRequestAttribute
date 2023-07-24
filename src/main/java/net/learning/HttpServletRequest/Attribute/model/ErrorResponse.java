package net.learning.HttpServletRequest.Attribute.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
public class ErrorResponse{
    public List<ErrorDetails> errors;

    public ErrorResponse(){

    }
    public ErrorResponse(List<ErrorDetails> errors) {
        this();
        this.errors = errors;
    }
}
