/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task08;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author sf2016
 */
public class GR {

    int z = 50;
    int x[] = new int[z];
    int y[] = new int[z];

    public void showFrame() {
        JFrame frame = new JFrame();
        frame.setSize(500, 1000);
        
        for (int i = 0; i < z; i++) {
            x[i] = i * 10;
            y[i] = (frame.getHeight()-35) - (i * i);

        }
       

        JPanel panel = new MyPanel(x, y, z);
        frame.setContentPane(panel);

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
;

}
