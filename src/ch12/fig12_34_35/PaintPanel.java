package ch12.fig12_34_35;// Fig. 12.34: PaintPanel.java
// Adapter class used to implement event handlers.

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class PaintPanel extends JPanel {
    // list Point references
    private final ArrayList<Point> points = new ArrayList<>();

    // set up GUI and register mouse event handler
    public PaintPanel() {
        // handle frame mouse motion event
        addMouseMotionListener(
                new MouseMotionAdapter() // anonymous inner class
                {
                    // store drag coordinates and repaint
                    @Override
                    public void mouseDragged(MouseEvent event) {
                        points.add(event.getPoint());
                        repaint(); // repaint JFrame
                    }
                }
        );
    }

    // draw ovals in a 4-by-4 bounding box at specified locations on window
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // clears drawing area

        // draw all
        for (Point point : points)
            g.fillOval(point.x, point.y, 4, 4);
    }
} // end class PaintPanel

