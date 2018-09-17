package core.beans;

import org.springframework.core.io.Resource;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 17.09.2018
 **/
public class ResourceBean {

    private final Resource resource;

    public ResourceBean(Resource resource) {
        this.resource = resource;
    }

    public Resource getResource() {
        return resource;
    }
}
