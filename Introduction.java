import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Introduction implements ActionListener{

    JFrame frame;
    JLabel[] l = new JLabel[7];
    JButton homeButton;
    Font font;

    String[] s = new String[6];

    Introduction(){

        font = new Font("Arial", Font.BOLD, 20);
        frame = new JFrame("About the Game");
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setLayout(null);

        s[0] = "Arthmetic Quiz Game";
        s[1] = "Project name:    Arithmetic Quiz Game";
        s[2] = "Developed By:   Mahmood Rasheed";
        s[3] = "Department:      Software";
        s[4] = "Roll Number:     20SW047";
        s[5] = "Section:            1";

        for (int i = 0; i < l.length-1; i++)
            l[i] = new JLabel(s[i]);

        int y = 100;
        for (int i = 1; i < l.length-1; i++, y+=50) {

            l[i].setForeground(new Color(10, 10, 100));
            l[i].setFont(font);
            l[i].setBounds(50, y, 400, 50);
        }

        l[0].setFont(new Font("Algerian", Font.BOLD, 40));
        l[0].setBounds(100, 30, 500, 50);
        l[0].setForeground(new Color(250, 10,0));

        l[6]  = new JLabel(new ImageIcon("Developer.jpg"));
        l[6].setBounds(450, 90, 200, 300);

        homeButton = new JButton(new ImageIcon("Home.jpg"));
        homeButton.setBounds(300, 400, 50, 50);
        homeButton.addActionListener(this);

        for (int i = 0; i < l.length; i++)
            frame.add(l[i]);

        frame.add(homeButton);
        frame.setSize(700, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        frame.setVisible(false);
        new AritmeticQuizGame();
    }
}