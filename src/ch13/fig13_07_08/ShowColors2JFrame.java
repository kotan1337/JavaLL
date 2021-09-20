package ch13.fig13_07_08;// Fig. 13.7: ShowColors2JFrame.java
// Choosing colors with JColorChooser.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowColors2JFrame extends JFrame {
    private final JButton changeColorJButton;
    private final JPanel colorJPanel;
    private Color color = Color.LIGHT_GRAY;

    // set up GUI
    public ShowColors2JFrame() {
        super("Using JColorChooser");

        // create JPanel for display color
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);

        // set up changeColorJButton and register its event handler
        changeColorJButton = new JButton("Change Color");
        changeColorJButton.addActionListener(
                new ActionListener() // anonymous inner class
                {
                    // display JColorChooser when user clicks button
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        color = JColorChooser.showDialog(
                                ShowColors2JFrame.this, "Choose a color", color);

                        // set default color, if no color is returned
                        if (color == null)
                            color = Color.LIGHT_GRAY;

                        // change content pane's background color
                        colorJPanel.setBackground(color);
                    }
                } // end anonymous inner class
        ); // end call to addActionListener

        add(colorJPanel, BorderLayout.CENTER);
        add(changeColorJButton, BorderLayout.SOUTH);

        setSize(400, 130);
        setVisible(true);
    } // end ShowColor2JFrame constructor
} // end class ShowColors2JFrame

