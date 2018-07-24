package beans.xml.jugglers;

import beans.api.Performer;
import lombok.Data;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class Juggler implements Performer {

    private static final Logger LOG = LoggerFactory.getLogger(Juggler.class);

    @Getter
    private final int beanBags;

    public void perform() {
        LOG.info("JUGGLING {} BEANBAGS", beanBags);
    }
}
