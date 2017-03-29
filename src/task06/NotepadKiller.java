package task06;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotepadKiller {

    JTextArea mainTextArea;
    JFrame frame;

    public void showMainWindow() {
        frame = new JFrame("Notepad Killer");
        JPanel mainPanel = new JPanel(new BorderLayout(8, 8));
        frame.setContentPane(mainPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setLineWrap(true);

        JScrollPane scroll = new JScrollPane(mainTextArea);
        mainPanel.add(scroll);

        frame.setJMenuBar(createMenuBar());

        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setVisible(true);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menubar = new JMenuBar();

        JMenuItem save = new JMenuItem("Save");
        save.addActionListener(lSave);
        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(lOpen);
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(lExit);

        JMenu file = new JMenu("File");
        file.add(save);
        file.add(open);
        file.add(exit);

        menubar.add(file);

        return menubar;
    }

    private ActionListener lSave = (event) -> {
        FileDialog fileDialog = new FileDialog(frame,
                "Save", FileDialog.SAVE);
        fileDialog.setMultipleMode(false);
        fileDialog.setVisible(true);

        if (!(fileDialog.getFile() == null)) {
            File file = new File(fileDialog.getDirectory(), fileDialog.getFile());
            try (Writer writer = new BufferedWriter(new FileWriter(file))) {
                mainTextArea.write(writer);
            } catch (IOException e) {
                //TODO Error Message
            }
        }

    };

    private ActionListener lOpen = (event) -> {
        FileDialog fileDialog = new FileDialog(frame,
                "Open", FileDialog.LOAD);

        fileDialog.setMultipleMode(false);
        fileDialog.setVisible(true);

        if (!(fileDialog.getFile() == null)) {
            File file = new File(fileDialog.getDirectory(), fileDialog.getFile());
            try (Reader reader = new BufferedReader(new FileReader(file))) {
                mainTextArea.read(reader, file.getPath());
            } catch (IOException e) {
                //TODO Error Message
            }

        }

    };

    private ActionListener lExit = (event) -> {

        System.exit(0);
    };
}
