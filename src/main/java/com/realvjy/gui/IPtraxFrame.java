package com.realvjy.gui;

import java.awt.*;

/**
 * @author realv_000 on 7/25/2015.
 */
public class IPtraxFrame extends DefaultFrame{
    public IPtraxFrame() throws HeadlessException {
        IPtraxPanel iPtraxPanel = new IPtraxPanel();
        this.getContentPane().add(iPtraxPanel,BorderLayout.CENTER);
        IPtraxListener iPtraxListener = new IPtraxListener(iPtraxPanel);
        this.pack();
        this.setLocation(fromLocation(this.getSize()));
    }
}
