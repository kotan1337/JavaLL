package ch12.fig12_45_46;// Fig. 12.46: PanelDemo.java
// Testing PanelFrame.

import javax.swing.*;

public class PanelDemo extends JFrame {
    public static void main(String[] args) {
        PanelFrame panelFrame = new PanelFrame();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(450, 200);
        panelFrame.setVisible(true);
    }
} // end class PanelDemo


