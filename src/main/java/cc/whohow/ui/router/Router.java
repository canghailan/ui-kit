package cc.whohow.ui.router;

import cc.whohow.ui.view.View;

public interface Router<R> {
    R parse(String request);
    View createView(R request);
    default View createView(String request) {
        return createView(parse(request));
    }
}
