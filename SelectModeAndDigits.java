import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectModeAndDigits extends JPanel{

    JFrame[] frames = new JFrame[2];
    JButton b[] = new JButton[7];
    JLabel lbl, label;

    String mode;
    int digits;
    String name = "";

    LevelListener l = new LevelListener();
    DigitListerner d = new DigitListerner();

    SelectModeAndDigits(){

        label = new JLabel(new ImageIcon("Select digits.png"));
        label.setBounds(0, 0, 400,300);
        name = JOptionPane.showInputDialog(null, "Enter Your Name: ");

        frames[0] = new JFrame("Select Your Mode");
        frames[1] = new JFrame("Select Your Digits");

        frames[0].setSize(750, 400);
        frames[1].setSize(400, 300);

        frames[0].setResizable(false);
        frames[1].setResizable(false);

        frames[0].getContentPane().setBackground(Color.WHITE);

        for (int i = 0; i < frames.length; i++) {

            frames[0].setLayout(null);
            frames[i].setLocationRelativeTo(null);
            frames[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        mode = "";
        digits = 0;

        lbl = new JLabel("Select  Your  Mode");
        lbl.setBounds(150, 30, 450, 80);
        lbl.setForeground(Color.RED);
        lbl.setFont(new Font("Algerian", Font.BOLD, 40));

        b[0] = new JButton(new ImageIcon("Easy.jpg"));
        b[1] = new JButton(new ImageIcon("Medium.jpg"));
        b[2] = new JButton(new ImageIcon("Hard.jpg"));

        b[0].setBackground(new Color(0, 255, 0));
        b[1].setBackground(Color.BLUE);
        b[2].setBackground(Color.RED);

        for (int i = 0, x = 100; i < b.length-4; i++) {

            if (i<3){

                b[i].setBounds(x, 150, 100, 100);
                b[i].addActionListener(l);
                b[i].setFont(new Font("Arial", Font.BOLD, 15));
                b[i].setForeground(Color.WHITE);
                frames[0].add(b[i]);
                x+= 200;
            }
        }
        frames[0].add(lbl);

        frames[0].setVisible(true);
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public int getDigits() {
        return digits;
    }


    class LevelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            frames[0].setVisible(false);

            if (e.getSource() == b[0])
                setMode("Easy");

            if (e.getSource() == b[1])
                setMode("Medium");

            if (e.getSource() == b[2])
                setMode("Hard");


            int x = 50;

            if (getMode() == "Easy"){

                for (int i = 3, j = 2; i < b.length-2; i++, j++, x+= 200) {

                    b[i] = new JButton(""+j);

                    if (i%2 != 0)
                        b[i].setBackground(Color.GREEN);
                    else
                        b[i].setBackground(Color.CYAN);

                    b[i].setBounds(x, 100, 100, 50);
                    b[i].addActionListener(d);
                    label.add(b[i]);
                }
            }
            if (getMode() == "Medium"){

                for (int i = 4, j = 3; i < b.length-1; i++, j++, x+= 200) {

                    b[i] = new JButton(""+j);

                    if (i%2 != 0)
                        b[i].setBackground(Color.GREEN);
                    else
                        b[i].setBackground(Color.CYAN);

                    b[i].setBounds(x, 100, 100, 50);
                    b[i].addActionListener(d);
                    label.add(b[i]);
                }
            }

            if (getMode() == "Hard"){

                for (int i = 5, j = 4; i < b.length; i++, j++, x+= 200) {

                    b[i] = new JButton(""+j);

                    if (i%2 != 0)
                        b[i].setBackground(Color.GREEN);
                    else
                        b[i].setBackground(Color.CYAN);

                    b[i].setBounds(x, 100, 100, 50);
                    b[i].addActionListener(d);
                    label.add(b[i]);
                }
            }

            frames[1].add(label);
            frames[1].setVisible(true);
        }
    }

    class DigitListerner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            frames[1].setVisible(false);

            for (int i = 3; i < b.length; i++) {

                if (e.getSource() == b[i]){

                    setDigits(Integer.parseInt(b[i].getText()));

                    new SelectLevel(name, mode, digits);
                }
            }
        }
    }
}