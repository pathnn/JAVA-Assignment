package Admin.ManageAppointments;

import Admin.ManageSchedules;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ManageSchedule extends JFrame{

    private JPanel ManageSchedule_Panel;
    private JButton addNewInformationButton;
    private JButton removeInformationButton;
    private JButton modifyButton;
    private JButton viewAllButton;
    private JButton searchButton;

    public ManageSchedule() {
        setContentPane(ManageSchedule_Panel);
        setVisible(true);
        setSize(450, 300);
        viewAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        addNewInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddSchedule as = new AddSchedule();
            }
        });

        removeInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RemoveSchedule rs = new RemoveSchedule();
            }
        });
        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModifySchedule ms = new ModifySchedule();
            }
        });
        viewAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageSchedules f1 = new ManageSchedules();
                try {
                    f1.ViewSchedule();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchSchedule ss = new SearchSchedule();
            }
        });
    }
}
