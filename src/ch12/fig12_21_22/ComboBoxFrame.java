package ch12.fig12_21_22;// Fig. 12.21: ComboBoxFrame.java
// JComboBox that displays a list of image names.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxFrame extends JFrame {
    private static final String[] names =
            {"bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"};
    private final JComboBox<String> imagesJComboBox; // hold icon names
    private final JLabel label; // displays selected icon
    private final Icon[] icons = {
            new ImageIcon(getClass().getResource(names[0])),
            new ImageIcon(getClass().getResource(names[1])),
            new ImageIcon(getClass().getResource(names[2])),
            new ImageIcon(getClass().getResource(names[3]))};

    // ComboBoxFrame constructor adds JComboBox to JFrame
    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout()); // set frame layout

        imagesJComboBox = new JComboBox<String>(names); // set up JComboBox
        imagesJComboBox.setMaximumRowCount(3); // display three rows

        imagesJComboBox.addItemListener(
                new ItemListener() // anonymous inner class
                {
                    // handle JComboBox event
                    @Override
                    public void itemStateChanged(ItemEvent event) {
                        // determine whether item selected
                        if (event.getStateChange() == ItemEvent.SELECTED)
                            label.setIcon(icons[
                                    imagesJComboBox.getSelectedIndex()]);
                    }
                } // end anonymous inner class
        ); // end call to addItemListener

        add(imagesJComboBox); // add combobox to JFrame
        label = new JLabel(icons[0]); // display first icon
        add(label); // add label to JFrame
    }
} // end class ComboBoxFrame


