package ch12.fig12_09_10;// Fig. 12.10: TextFieldTest.java
// Testing TextFieldFrame.

import javax.swing.*;

public class TextFieldTest {
    public static void main(String[] args) {
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350, 100);
        textFieldFrame.setVisible(true);
    }
} // end class TextFieldTest

