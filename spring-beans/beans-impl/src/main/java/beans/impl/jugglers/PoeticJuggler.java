package beans.impl.jugglers;

import beans.api.Poem;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PoeticJuggler extends Juggler {

    private static final Logger LOG = LoggerFactory.getLogger(PoeticJuggler.class);

    @Getter
    private final Poem poem;

    @Getter @Setter
    private int age;

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        LOG.info("I am poet({}). While reciting...", age);
        poem.recite();
    }
}
