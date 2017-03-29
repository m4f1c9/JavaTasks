package task06;

import javax.swing.SwingUtilities;


public class MainClass {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NotepadKiller().showMainWindow());
    }
}
