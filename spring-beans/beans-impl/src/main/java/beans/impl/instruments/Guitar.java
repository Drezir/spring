package beans.impl.instruments;

import beans.api.Instrument;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing on guitar");
    }
}
