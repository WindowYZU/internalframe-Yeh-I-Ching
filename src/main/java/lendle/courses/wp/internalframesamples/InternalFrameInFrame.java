/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.internalframesamples;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class InternalFrameInFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        //create a JInternalFrame
        //try to make it visible
        //setVisible, setSize, setPreferredSize......
        JMenuBar jMenuBar = new JMenuBar();
        frame.setJMenuBar(jMenuBar);
        JMenu menu = new JMenu("Edit");
        jMenuBar.add(menu);
        JMenuItem item = new JMenuItem("Add");
        menu.add(item);
        item.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
            JInternalFrame jInternalFrame=new JInternalFrame();
            frame.add(jInternalFrame);
            jInternalFrame.setSize(300, 300);
            jInternalFrame.setVisible(true);
            jInternalFrame.setMaximizable(true);
            jInternalFrame.setIconifiable(true);
            jInternalFrame.setResizable(true);
            jInternalFrame.setClosable(true);
            jInternalFrame.setLocation(desktopPane.getAllFrames().length * 10, jDesktopPane.getAllFrames().length *10);
            }
        });
        ///////////////////////////
        frame.setVisible(true);
    }
    
}
