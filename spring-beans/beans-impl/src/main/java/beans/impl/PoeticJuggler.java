package beans.impl;

import beans.api.Poem;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PoeticJuggler extends Juggler {

    private static final Logger LOG = LoggerFactory.getLogger(PoeticJuggler.class);

    @Getter
    private final Poem poem;

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        LOG.info("While reciting...");
        poem.recite();
    }
}
