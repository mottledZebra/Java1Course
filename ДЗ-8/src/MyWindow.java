import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    static int n;

    public MyWindow() {
        setLocation(600, 300);
        setSize(500, 500);
        setTitle("Просто окно");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        JLabel myLabel = new JLabel();
        myLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton btnClose = new JButton("Выход");
        ActionListener btnCloseListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        btnClose.addActionListener(btnCloseListener);

        JButton btnPlay = new JButton("Нажми меня");
        ActionListener btnPlayListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                myLabel.setText("Кнопка нажата " + n + " раз");
                myLabel.setVisible(true);
            }
        };
        btnPlay.addActionListener(btnPlayListener);

        JPanel myPanel = new JPanel(new GridLayout(1, 2));
        myPanel.add(btnPlay);
        myPanel.add(btnClose);

        add(myLabel, BorderLayout.CENTER);
        add(myPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
