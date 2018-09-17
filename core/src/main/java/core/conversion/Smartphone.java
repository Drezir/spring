package core.conversion;

import java.beans.PropertyEditorSupport;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 17.09.2018
 **/
public class Smartphone {

    private final String brand;
    private final Android android;

    public Smartphone(String brand, Android android) {
        this.brand = brand;
        this.android = android;
    }

    public String getBrand() {
        return brand;
    }

    public Android getAndroid() {
        return android;
    }
}
