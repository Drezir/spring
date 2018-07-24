package beans.xml.instruments;

import beans.api.Instrument;
import beans.xml.annotations.SaxophoneInstrument;

@SaxophoneInstrument
public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing saxophone...");
    }
}
