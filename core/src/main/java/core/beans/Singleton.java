package core.beans;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 11.09.2018
 **/
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void sayHello() {

    }

}
