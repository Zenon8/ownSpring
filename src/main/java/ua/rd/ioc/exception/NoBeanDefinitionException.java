package ua.rd.ioc.exception;

public class NoBeanDefinitionException extends RuntimeException {

    public NoBeanDefinitionException() {
        super("No bean definitions");
    }
}
