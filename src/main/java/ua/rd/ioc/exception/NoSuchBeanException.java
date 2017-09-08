package ua.rd.ioc.exception;


public class NoSuchBeanException extends RuntimeException {
    public NoSuchBeanException() {
        super("NoSuchBean");
    }
}
