import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectLevel implements ActionListener {

    JFrame frame;
    JButton add, sub, mul, divide;
    String name, mode, level;
    int digits;

    SelectLevel(String name, String mode, int digits) {

        this.name = name;
        this.mode = mode;
        this.digits = digits;
        this.level = level;

        frame = new JFrame("Select Level");
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.WHITE);

        add = new JButton(new ImageIcon("Addition.jpg"));
        sub = new JButton(new ImageIcon("Subtraction.jpg"));
        mul = new JButton(new ImageIcon("Multiplication.jpg"));
        divide = new JButton(new ImageIcon("Division.jpg"));

        add.setBounds(50, 50, 100, 100);
        sub.setBounds(200, 50, 100, 100);
        mul.setBounds(50, 200, 100, 100);
        divide.setBounds(200, 200, 100, 100);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        divide.addActionListener(this);

        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(divide);
        frame.setSize(370, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        frame.setVisible(false);

        if (e.getSource() == add)
            level = "Addition";

        if (e.getSource() == sub)
            level = "Subtraction";

        if (e.getSource() == mul)
            level = "Multiplication";

        if (e.getSource() == divide)
            level = "Division";

        new Quiz(name, mode, digits, level);
    }
}