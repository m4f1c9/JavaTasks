package task08;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    int x[];
    int y[];
    int z;

    @Override
    protected void paintComponent(Graphics gh) {
        Graphics2D drp = (Graphics2D) gh;
        //drp.drawLine(20, 340, 20, 20);
        //drp.drawLine(20, getHeight()-30, 460, getHeight()-30);

        drp.drawPolyline(x, y, z);
    }

    public MyPanel(int[] x, int[] y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
