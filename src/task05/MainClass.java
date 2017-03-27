package task05;

import javax.swing.SwingUtilities;

public class MainClass {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyFrame().showFrame());
    }

}
