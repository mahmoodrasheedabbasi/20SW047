import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AritmeticQuizGame implements ActionListener {

    JFrame f;
    JButton aboutButton, playGameButton;

    AritmeticQuizGame(){

        f = new JFrame("Arthmetic Quiz Game");
        f.setLayout(null);
        f.getContentPane().setBackground(Color.CYAN);

        aboutButton = new JButton(new ImageIcon("About.jpg"));
        playGameButton = new JButton(new ImageIcon("Play.jpg"));

        aboutButton.setBounds(50, 80, 100, 100);
        playGameButton.setBounds(230, 80, 100, 100);

        aboutButton.addActionListener(this);
        playGameButton.addActionListener(this);

        aboutButton.setBackground(Color.WHITE);
        f.add(aboutButton);
        f.add(playGameButton);
        f.setSize(400, 300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new AritmeticQuizGame();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        f.setVisible(false);

        if (e.getSource() == aboutButton) {

            new Introduction();
        }
        if (e.getSource() == playGameButton){

            new SelectModeAndDigits();
        }
    }
}