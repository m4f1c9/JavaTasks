package task05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public class MyFrame {

    private JPanel firstPanel;
    private JPanel secondPanel;
    JFrame frame;
    int count;
    JButton button;
    JLabel countLebel;

    public void showFrame() {
        frame = new JFrame("Простой графический интерфейс");

        firstPanel = new JPanel();

        secondPanel = new JPanel();
        secondPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

        button = new JButton("Push me");
        countLebel = new JLabel(String.valueOf(count));
        button.addActionListener(new Listener());
        countLebel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JScrollPane scroll = new JScrollPane(new JTextArea(getSTrace(), 5, 30));

        JSlider slider = new JSlider(0, 100);
        slider.setPaintLabels(true);

        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton button1 = new JRadioButton("button 1", true);
        JRadioButton button2 = new JRadioButton("button 2");
        JRadioButton button3 = new JRadioButton("button 3");

        JPanel thirdPanel = new JPanel();

        frame.add(firstPanel);

        firstPanel.add(secondPanel);
        firstPanel.add(scroll);
        firstPanel.add(slider);

        secondPanel.add(button);
        secondPanel.add(countLebel);

        buttonGroup.add(button1);
        buttonGroup.add(button2);
        buttonGroup.add(button3);

        thirdPanel.add(button1);
        thirdPanel.add(button2);
        thirdPanel.add(button3);
        firstPanel.add(thirdPanel);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        //frame.pack();
        frame.setVisible(true);

    }

    private String getSTrace() {
        StackTraceElement[] el = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : el) {
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        return sb.toString();
    }

    private class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            countLebel.setText(String.valueOf(++count));
        }

    }

}
