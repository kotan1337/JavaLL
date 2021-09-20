package ch13.fig13_18_19;// Fig. 13.19: LinesRectsOvals.java
// Testing LinesRectsOvalsJPanel.

import javax.swing.*;
import java.awt.*;

public class LinesRectsOvals {
    // execute application
    public static void main(String[] args) {
        // create frame for LinesRectsOvalsJPanel
        JFrame frame =
                new JFrame("Drawing lines, rectangles and ovals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LinesRectsOvalsJPanel linesRectsOvalsJPanel =
                new LinesRectsOvalsJPanel();
        linesRectsOvalsJPanel.setBackground(Color.WHITE);
        frame.add(linesRectsOvalsJPanel);
        frame.setSize(400, 210);
        frame.setVisible(true);
    }
} // end class LinesRectsOvals

