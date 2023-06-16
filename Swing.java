package Swing213040057;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame{
    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;

    public Swing() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        textField1 = new JTextField(20);
        textField2 = new JTextField(20);

        addButton = new JButton("Jumlah");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int result = num1 + num2;
                JOptionPane.showMessageDialog(frame, "Jumlah: " + result);
            }
        });

        frame.getContentPane().add(textField1);
        frame.getContentPane().add(textField2);
        frame.getContentPane().add(addButton);

        frame.setVisible(true);
    }
}








