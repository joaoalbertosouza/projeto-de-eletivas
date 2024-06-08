package eletivas.projetos2;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.notification.Notification;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        Button button = new Button("Click me", e -> Notification.show("Hello, Vaadin!"));
        add(button);
    }
}