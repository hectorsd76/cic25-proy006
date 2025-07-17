package es.cic.curso25.proy005.controller;

public class MotorException extends RuntimeException {

    public MotorException() {

    }


    public MotorException(String message) {
        super(message);        
    }

    public MotorException(String message, Throwable throwable) {
        super(message, throwable);        
    }

}
