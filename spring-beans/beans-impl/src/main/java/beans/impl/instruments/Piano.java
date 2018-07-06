package beans.impl.instruments;

import beans.api.Instrument;

import javax.xml.bind.SchemaOutputResolver;

public class Piano implements Instrument {
    public void play() {
        System.out.println("piano piano piano");
    }
}
