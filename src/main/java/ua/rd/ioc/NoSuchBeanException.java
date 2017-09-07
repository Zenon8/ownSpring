package ua.rd.ioc;

/**
 * Created by Maksym_Petrenko on 9/7/2017.
 */
public class NoSuchBeanException extends RuntimeException {
    public NoSuchBeanException() {
        super("NoSuchBean");
    }
}
