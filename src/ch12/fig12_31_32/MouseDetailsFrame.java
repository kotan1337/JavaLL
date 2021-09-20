package ch12.fig12_31_32;// Fig. 12.31: MouseDetailsFrame.java
// Demonstrating mouse clicks and distinguishing between mouse buttons.

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDetailsFrame extends JFrame {
    private final JLabel statusBar; // JLabel at bottom of window
    private String details; // String displayed in the statusBar

    // constructor sets title bar String and register mouse listener
    public MouseDetailsFrame() {
        super("Mouse Clicks and Buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler()); // add handler
    }

    // inner class to handle mouse events
    private class MouseClickHandler extends MouseAdapter {
        // handle mouse-click event and determine which button was pressed
        @Override
        public void mouseClicked(MouseEvent event) {
            int xPos = event.getX(); // get x-position of mouse
            int yPos = event.getY(); // get y-position of mouse

            details = String.format("Clicked %d time(s)",
                    event.getClickCount());

            if (event.isMetaDown()) // right mouse button
                details += " with right mouse button";
            else if (event.isAltDown()) // middle mouse button
                details += " with center mouse button";
            else // left mouse button
                details += " with left mouse button";

            statusBar.setText(details);
        }
    }
} // end class MouseDetailsFrame


