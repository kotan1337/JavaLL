package ch12.fig12_25_26;// Fig. 12.26: MultipleSelectionTest.java
// Testing MultipleSelectionFrame.

import javax.swing.*;

public class MultipleSelectionTest {
    public static void main(String[] args) {
        MultipleSelectionFrame multipleSelectionFrame =
                new MultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        multipleSelectionFrame.setSize(350, 150);
        multipleSelectionFrame.setVisible(true);
    }
} // end class MultipleSelectionTest


