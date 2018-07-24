package beans.annotated;

import beans.api.Instrument;
import org.springframework.stereotype.Component;

@Component
public class AGuitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing guitar...");
    }
}
