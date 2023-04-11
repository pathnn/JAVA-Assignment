package Admin.ManageAppointments;

import Admin.ManageSchedules;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SearchSchedule extends JFrame{
    private JButton button1;
    private JPanel Search_Panel;
    private JTextField Mail;

    public SearchSchedule() {
        setContentPane(Search_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mail = Mail.getText();
                ManageSchedules f1 = new ManageSchedules();
                try {
                    f1.SearchSchedule(mail);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
