package ch12.fig12_28_29;// Fig. 12.29: MouseTrackerFrame.java
// Testing MouseTrackerFrame.

import javax.swing.*;

public class MouseTracker {
    public static void main(String[] args) {
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(300, 100);
        mouseTrackerFrame.setVisible(true);
    }
} // end class MouseTracker

