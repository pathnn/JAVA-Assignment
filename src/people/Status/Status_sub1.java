package people.Status;

import people.ViewStatus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Status_sub1 extends JFrame{
    private JButton viewStatusButton;
    private JButton viewStatusButton1;
    private JPanel Status_Panel;

    public Status_sub1() {
        setContentPane(Status_Panel);
        setVisible(true);
        setSize(450, 300);
        viewStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewStatus vs = new ViewStatus();
                vs.View();
            }
        });
        viewStatusButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchStatus sv = new SearchStatus();
            }
        });
    }
}
