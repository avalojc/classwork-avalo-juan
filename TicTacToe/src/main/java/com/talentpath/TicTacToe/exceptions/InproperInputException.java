package com.talentpath.TicTacToe.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( code= HttpStatus.NOT_ACCEPTABLE, reason="Cannot add selection to gameboard.")
public class InproperInputException extends Exception {
    public InproperInputException( String message ) { super( message ); }

    public InproperInputException( String message, Throwable inner ){
        super (message, inner);
    }
}
