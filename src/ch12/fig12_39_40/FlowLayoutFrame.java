package ch12.fig12_39_40;// Fig. 12.39: FlowLayoutFrame.java
// FlowLayout allows components to flow over multiple lines.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutFrame extends JFrame {
    private final JButton leftJButton; // button to set alignment left
    private final JButton centerJButton; // button to set alignment center
    private final JButton rightJButton; // button to set alignment right
    private final FlowLayout layout; // layout object
    private final Container container; // container to set layout

    // set up GUI and register button listeners
    public FlowLayoutFrame() {
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane(); // get container to layout
        setLayout(layout);

        // set up leftJButton and register listener
        leftJButton = new JButton("Left");
        add(leftJButton); // add Left button to frame
        leftJButton.addActionListener(
                new ActionListener() // anonymous inner class
                {
                    // process leftJButton event
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.LEFT);

                        // realign attached components
                        layout.layoutContainer(container);
                    }
                }
        );

        // set up centerJButton and register listener
        centerJButton = new JButton("Center");
        add(centerJButton); // add Center button to frame
        centerJButton.addActionListener(
                new ActionListener() // anonymous inner class
                {
                    // process centerJButton event
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.CENTER);

                        // realign attached components
                        layout.layoutContainer(container);
                    }
                }
        );

        // set up rightJButton and register listener
        rightJButton = new JButton("Right"); // create Right button
        add(rightJButton); // add Right button to frame
        rightJButton.addActionListener(
                new ActionListener() // anonymous inner class
                {
                    // process rightJButton event
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.RIGHT);

                        // realign attached components
                        layout.layoutContainer(container);
                    }
                }
        );
    } // end FlowLayoutFrame constructor
} // end class FlowLayoutFrame


