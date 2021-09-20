package ch12.fig12_31_32;// Fig. 12.32: MouseDetails.java
// Testing MouseDetailsFrame.

import javax.swing.*;

public class MouseDetails {
    public static void main(String[] args) {
        MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
        mouseDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseDetailsFrame.setSize(400, 150);
        mouseDetailsFrame.setVisible(true);
    }
} // end class MouseDetails


