package ch12.fig12_45_46;// Fig. 12.45: PanelFrame.java
// Using a JPanel to help lay out components.

import javax.swing.*;
import java.awt.*;

public class PanelFrame extends JFrame {
    private final JPanel buttonJPanel; // panel to hold buttons
    private final JButton[] buttons;

    // no-argument constructor
    public PanelFrame() {
        super("Panel Demo");
        buttons = new JButton[5];
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1, buttons.length));

        // create and add buttons
        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            buttonJPanel.add(buttons[count]); // add button to panel
        }

        add(buttonJPanel, BorderLayout.SOUTH); // add panel to JFrame
    }
} // end class PanelFrame


