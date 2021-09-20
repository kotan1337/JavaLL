package ch12.fig12_15_16;// Fig. 12.16: ButtonTest.java
// Testing ButtonFrame.

import javax.swing.*;

public class ButtonTest {
    public static void main(String[] args) {
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275, 110);
        buttonFrame.setVisible(true);
    }
} // end class ButtonTest

