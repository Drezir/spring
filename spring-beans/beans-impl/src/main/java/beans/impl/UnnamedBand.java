package beans.impl;

import beans.api.Instrument;
import beans.api.Performer;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

public class UnnamedBand implements Performer {

    @Setter
    @Getter
    private Collection<Instrument> instruments;

    public void perform() {
        instruments.forEach(Instrument::play);
    }
}
