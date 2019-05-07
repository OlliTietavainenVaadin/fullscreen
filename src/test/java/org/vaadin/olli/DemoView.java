package org.vaadin.olli;

import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@Route("")
@JavaScript("fullscreen.js")
public class DemoView extends Div {

    public DemoView() {
        add(new FullscreenButton("open fullscreen", false));
        add(new FullscreenButton("close fullscreen", true));
    }

    @WebServlet(urlPatterns = "/*", name = "myservlet", asyncSupported = true, initParams = {
            @WebInitParam(name = "frontend.url.es6", value = "http://mydomain.com/es6/"),
            @WebInitParam(name = "frontend.url.es5", value = "http://mydomain.com/es5/"),
            @WebInitParam(name = "bowerMode", value = "true")}
    )
    public static class MyServlet extends VaadinServlet {
    }
}
