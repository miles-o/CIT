import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame{
    private JTextField tfMiles;
    private JTextField tfKilometers;
    private JLabel labelMiles;
    private JLabel labelKilometers;
    private JButton btnConvert;
    private JPanel panel1;


    public GUI() {
        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    double miles = Double.parseDouble(tfMiles.getText());
                    double kilometres = miles * 1.61;
                    tfKilometers.setText(kilometres + "");
                }
                catch (Exception ex)
                {
                    tfKilometers.setText("You must enter a number for the miles");
                }
            }
        });
        setContentPane(panel1);
        //x , y, width, height
        setBounds(300,300,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
