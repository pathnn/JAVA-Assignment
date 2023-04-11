package people;

import people.SubmitAppointment.Citizen_Appoint_sub;
import people.Status.Status_sub1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import people.RegisterProgramme.Citizen_Register_sub;

public class Citizen_main extends JFrame{
    private JPanel Citizen_main_Panel;
    public String mailaddress;
    private JButton registerPeopleButton;
    private JButton submitButton;
    private JButton registerInfromaionButton;


    public Citizen_main(String mail) {
        setContentPane(Citizen_main_Panel);
        setVisible(true);
        setSize(450, 300);
        this.mailaddress = mail;
        registerPeopleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Citizen_Register_sub crs = new Citizen_Register_sub(mailaddress);
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Citizen_Appoint_sub cas = new Citizen_Appoint_sub(mailaddress);
            }
        });
        registerInfromaionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Status_sub1 vs = new Status_sub1();
            }
        });

    }
}
