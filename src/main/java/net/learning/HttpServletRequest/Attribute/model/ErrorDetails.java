package net.learning.HttpServletRequest.Attribute.model;

import lombok.*;

@Builder
@Getter
@Setter
public class ErrorDetails {

    private String errorCode;
    private String errorMessage;
}
