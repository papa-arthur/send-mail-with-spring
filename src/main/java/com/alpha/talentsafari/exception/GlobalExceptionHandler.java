package com.alpha.talentsafari.exception;

import graphql.GraphQLError;
import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

    @GraphQlExceptionHandler(NotFoundException.class)
    public GraphQLError handleNotFoundExceptions(NotFoundException exception) {
        return GraphQLError.newError().errorType(ErrorType.NOT_FOUND)
                .message(exception.getMessage()).build();
    }

    @GraphQlExceptionHandler(EntityExistsException.class)
    public GraphQLError handleBadRequest(RuntimeException exception) {
        return GraphQLError.newError().errorType(ErrorType.BAD_REQUEST)
                .message(exception.getMessage()).build();
    }

}
