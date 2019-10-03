package org.vaadin.olli;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A vaadin-button wrapper that can open or close fullscreen mode.
 */
@Tag("fullscreen-button")
@JsModule("./fullscreen-button.js")
@HtmlImport("fullscreen-button.html")
public class FullscreenButton extends PolymerTemplate<FullscreenButton.FullscreenButtonModel> {

    @Id("fullscreen-vaadin-button")
    private Button fullscreenVaadinButton;

    /**
     * Creates a new FullscreenButton.
     */
    protected FullscreenButton() {
    }

    /**
     * Creates a new FullscreenButton with a custom caption
     * @param buttonText caption for the button
     * @param close button should close fullscreen
     */
    public FullscreenButton(String buttonText, boolean close) {
        setButtonText(buttonText);
        getModel().setClose(close);
    }

    /**
     * This model binds properties between FullscreenButton and fullscreen-button.html
     */
    public interface FullscreenButtonModel extends TemplateModel {
        void setClose(boolean close);
        boolean getClose();
    }

    public void setButtonText(String buttonText) {
        fullscreenVaadinButton.setText(buttonText);
    }
}
