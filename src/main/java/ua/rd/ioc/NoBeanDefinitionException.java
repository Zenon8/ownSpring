package ua.rd.ioc;

public class NoBeanDefinitionException extends RuntimeException {

    public NoBeanDefinitionException() {
        super("No bean definitions");
    }
}
