package beans.impl;

public class Stage {

    public static Stage INSTANCE;

    private Stage() {}

    public static Stage getInstance() {
        return INSTANCE == null ? new Stage() : INSTANCE;
    }
}
