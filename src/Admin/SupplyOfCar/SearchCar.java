package Admin.SupplyOfCar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Admin.SupplyCar;


public class SearchCar extends JFrame{
    private JTextField something;
    private JButton button1;
    private JPanel Search_Car_Panel;

    public SearchCar() {
        setContentPane(Search_Car_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SupplyCar sv = new SupplyCar();
                String someValue = something.getText();
                sv.Search(someValue);
            }
        });
    }
}
