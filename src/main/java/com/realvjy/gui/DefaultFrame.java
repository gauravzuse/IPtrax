package com.realvjy.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author realv_000 on 7/25/2015.
 */
public class DefaultFrame extends JFrame {
    public DefaultFrame() throws HeadlessException {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public DefaultFrame(int width, int height) throws HeadlessException {
        setSize(width, height);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void showIt(){
        this.setVisible(true);
    }
    public void showIt(String title){
        this.setTitle(title);
        this.setVisible(true);
    }
    public void showIt(String title, int x, int y){
        this.setLocation(x, y);
        this.setTitle(title);
        this.setVisible(true);
    }

    public void hideIt(){
        this.setVisible(false);
    }

    // Form location at center
    public Point fromLocation(Dimension size) {
        Dimension formSize = size;
        Dimension scrrenSize = Toolkit.getDefaultToolkit().getScreenSize();     //get Screen Size
        double x = (scrrenSize.getWidth() - formSize.getWidth()) / 2;
        double y = (scrrenSize.getHeight() - formSize.getHeight()) / 2;
        int xAxis = new Double(x).intValue();
        int yAxis = new Double(y).intValue();
        return new Point(xAxis,yAxis);
    }
}
