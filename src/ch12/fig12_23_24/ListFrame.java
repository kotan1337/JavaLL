package ch12.fig12_23_24;// Fig. 12.23: ListFrame.java
// JList that displays a list of colors.

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListFrame extends JFrame {
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] colors = {Color.BLACK, Color.BLUE,
            Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
            Color.RED, Color.WHITE, Color.YELLOW};
    private final JList<String> colorJList; // list to display colors

    // ListFrame constructor add JScrollPane containing JList to JFrame
    public ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames); // list of colorNames
        colorJList.setVisibleRowCount(5); // display five rows at once

        // do not allow multiple selections
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // add a JScrollPane containing JList to frame
        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener(
                new ListSelectionListener() // anonymous inner class
                {
                    // handle list selection events
                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(
                                colors[colorJList.getSelectedIndex()]);
                    }
                }
        );
    }
} // end class ListFrame

