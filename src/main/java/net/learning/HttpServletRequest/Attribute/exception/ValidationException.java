package net.learning.HttpServletRequest.Attribute.exception;

import net.learning.HttpServletRequest.Attribute.model.ErrorDetails;
import lombok.Getter;

import java.util.List;

@Getter
public class ValidationException extends RuntimeException {

    public List<ErrorDetails> multipleErrors;
    public ValidationException(List<ErrorDetails> errors) {
        this.multipleErrors = errors;
    }
}
