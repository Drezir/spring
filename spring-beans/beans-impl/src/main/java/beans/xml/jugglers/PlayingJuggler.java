package beans.xml.jugglers;

import beans.api.Instrument;
import beans.api.Performer;
import lombok.Data;

@Data
public class PlayingJuggler implements Performer {

    private final Instrument instrument;

    public void perform() {
        System.out.println("Playing on ...");
        instrument.play();
    }
}
