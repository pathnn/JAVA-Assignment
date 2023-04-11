package people.Status;


import people.ViewStatus;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchStatus extends JFrame{
    private JTextField something;
    private JButton button1;
    private JPanel Search_Panel;

    public SearchStatus() {
        setContentPane(Search_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewStatus vs = new ViewStatus();
                String somethings = something.getText();
                vs.Search(somethings);
            }
        });
    }
}
