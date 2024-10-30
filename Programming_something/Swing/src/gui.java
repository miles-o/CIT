import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {
    private JPanel TempConverter;
    private JTextField txtFahrenheit;
    private JButton btnConvert;
    private JTextField txtCelsius;

    public gui() {
        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(txtFahrenheit.getText());
                double celsius = (fahrenheit - 32) * 5.0 / 9;
                txtCelsius.setText(celsius + "");
                System.out.println("clicked");
            }
        });
    }
}


