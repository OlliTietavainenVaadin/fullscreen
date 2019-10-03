package org.vaadin.olli;

import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        add(new FullscreenButton("open fullscreen", false));
        add(new FullscreenButton("close fullscreen", true));
    }
}
