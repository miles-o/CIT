import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PostageCalculator {
    private JTextField priceTextField1;
    private JTextField weightTextField;
    private JButton calculateButton;
    private JPanel panel;

    public PostageCalculator() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double postage;
                String output;
                try {
                    double weight = Double.parseDouble(weightTextField.getText());

                    if (weight > 0) {

                        if (weight <= 5) {
                            postage = weight * 3;
                        } else {
                            if (weight <= 10) {
                                postage = 15 + (weight - 5) * 2;
                            } else {
                                postage = 25 + (weight - 10) * 1.5;
                            }
                        }

                        output = String.valueOf(postage);
                    } else {
                        output = "Weight must be greater than 0";
                    }
                } catch (Exception ex) {
                    output = "Please enter a valid number";
                }
                priceTextField1.setText(output);
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}
