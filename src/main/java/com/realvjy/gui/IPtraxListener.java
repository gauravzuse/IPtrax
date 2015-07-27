package com.realvjy.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author realv_000 on 7/25/2015.
 */
public class IPtraxListener implements ActionListener{
    private IPtraxPanel iPtraxPanel;
    private static int i = 0;
    public IPtraxListener(IPtraxPanel iPtraxPanel) {
        this.iPtraxPanel = iPtraxPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("IP")){
            i = 11;
        } else if (actionCommand.equals("URL")){
            i = 12;
        }
        if (actionCommand.equals("Search")) {
            switch (i){
                case 11:
                    iPtraxPanel.getInfo(11);
                    break;
                case 12:
                    iPtraxPanel.getInfo(12);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Select IP or URL", "Select Radio", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
    }
}
