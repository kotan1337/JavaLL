package ch12.fig12_41_42;// Fig. 12.42: BorderLayoutDemo.java
// Testing BorderLayoutFrame.

import javax.swing.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300, 200);
        borderLayoutFrame.setVisible(true);
    }
} // end class BorderLayoutDemo

