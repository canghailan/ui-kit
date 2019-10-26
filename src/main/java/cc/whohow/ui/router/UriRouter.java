package cc.whohow.ui.router;

import java.net.URI;

public interface UriRouter extends Router<URI> {
    @Override
    default URI parse(String request) {
        return URI.create(request);
    }
}
