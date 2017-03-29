package task07;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class MyFrame {

    JProgressBar pbar1;
    JProgressBar pbar2;
    JProgressBar pbar3;
    JFrame frame;
    JButton button;

    public void showFrame() {
        frame = new JFrame("Демонстрация JProgressBar");
        JPanel mainPanel = new JPanel(new FlowLayout());
        frame.setContentPane(mainPanel);

        button = new JButton("Старт");
        mainPanel.add(button);
        button.addActionListener(alistener);

        pbar1 = new JProgressBar(0, 400);
        pbar2 = new JProgressBar(0, 400);
        pbar3 = new JProgressBar(0, 400);

        mainPanel.add(pbar1);
        mainPanel.add(pbar2);
        mainPanel.add(pbar3);

        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setVisible(true);
    }

    private ActionListener alistener = (event) -> {
        new Thread(new Worker(pbar1, 100)).start();
        new Thread(new Worker(pbar2, 150)).start();
        new Thread(new Worker(pbar3, 200)).start();
        button.setEnabled(false);
    };
}
