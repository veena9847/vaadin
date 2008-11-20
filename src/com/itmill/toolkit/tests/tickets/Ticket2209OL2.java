package com.itmill.toolkit.tests.tickets;

import com.itmill.toolkit.Application;
import com.itmill.toolkit.ui.Button;
import com.itmill.toolkit.ui.ComboBox;
import com.itmill.toolkit.ui.Label;
import com.itmill.toolkit.ui.OrderedLayout;
import com.itmill.toolkit.ui.Window;
import com.itmill.toolkit.ui.Button.ClickEvent;
import com.itmill.toolkit.ui.Button.ClickListener;

public class Ticket2209OL2 extends Application {

    private OrderedLayout gl;
    private ComboBox combo;
    private Label labelLong;

    @Override
    public void init() {
        setMainWindow(new Window());
        getMainWindow().getLayout().setWidth("250px");
        gl = new OrderedLayout();
        gl.setSizeUndefined();
        gl.setStyleName("borders");
        getMainWindow().addComponent(gl);
        setTheme("tests-tickets");
        combo = new ComboBox("Combo caption");
        labelLong = new Label(
                "This should stay on one line or to wrap to multiple lines? At leas it should display all the text?. "
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?"
                        + "A long label, longer than the combo box. Why doesn't it affect the width? And why is the gridlayout so high?");
        gl.addComponent(combo);
        gl.addComponent(labelLong);

        Button b = new Button("Add label text", new ClickListener() {

            public void buttonClick(ClickEvent event) {
                labelLong.setValue(labelLong.getValue() + "-12345");
            }

        });
        getMainWindow().addComponent(b);
    }

}
