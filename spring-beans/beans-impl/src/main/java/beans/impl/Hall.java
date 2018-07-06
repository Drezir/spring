package beans.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hall {

    private static final Logger LOG = LoggerFactory.getLogger(Hall.class);

    public void turnLightsOn() {
        LOG.info(">>>> Turning lights on");
    }

    public void turnLightsOff() {
        LOG.info(">>>> Turning lights off");
    }

}
