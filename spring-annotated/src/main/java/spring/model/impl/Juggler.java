package spring.model.impl;

import spring.model.api.Performer;
import org.springframework.stereotype.Component;

@Component
public class Juggler implements Performer {

    public void perform() {
        System.out.println("Juggling...");
    }
}
