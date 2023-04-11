package Admin.SupplyOfCar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Admin.SupplyCar;

public class ModifyCar extends JFrame{
    private JTextField enterName;
    private JTextField enterDate;
    private JButton button1;
    private JTextField changeName;
    private JTextField changeDate;
    private JTextField changeNumber;
    private JPanel Modify_Car_Panel;

    private JPanel Add_Panel;
    private JPanel JPanel;

    public ModifyCar() {
        setContentPane(Modify_Car_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String changename = enterName.getText();
                String changedate = enterDate.getText();
                String name = changeName.getText();
                String date = changeDate.getText();
                String num = changeNumber.getText();
                SupplyCar supplyCar = new SupplyCar();
                supplyCar.Modify(changename, changedate, name, date, num);
            }
        });
    }
}
