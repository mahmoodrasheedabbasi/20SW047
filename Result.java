import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Result {

    JFrame f;
    JLabel name, mode, digits, level, score, status, resultLabel;
    JLabel nameOfUser, modeOfUser, digitsOfUser, levelOfUser, scoreOfUser, statusOfUser;

    String userName, userMode, userLevel;
    int userDigits, userScore;

    Result(String userName, String userMode, int userDigits, String userLevel, int userScore){

        this.userName = userName;
        this.userMode = userMode;
        this.userDigits = userDigits;
        this.userLevel = userLevel;
        this.userScore = userScore;

        f = new JFrame("Result");
        f.getContentPane().setBackground(Color.CYAN);

        resultLabel = new JLabel("Result Of Arithmetic Quiz");
        resultLabel.setBounds(50, 30, 300, 50);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 24));
        resultLabel.setForeground(Color.BLACK);
        resultLabel.setBorder(new LineBorder(Color.BLACK, 3));

        name = new JLabel("Name");
        mode = new JLabel("Mode");
        digits = new JLabel("Digits");
        level = new JLabel("Level");
        score = new JLabel("Score");
        status = new JLabel("Status");

        name.setBounds(50, 100, 100, 50);
        mode.setBounds(50, 150, 100, 50);
        digits.setBounds(50, 200, 100, 50);
        level.setBounds(50, 250, 100, 50);
        score.setBounds(50, 300, 100, 50);
        status.setBounds(50, 350, 100, 50);


        nameOfUser = new JLabel(userName);
        modeOfUser = new JLabel(userMode);
        digitsOfUser = new JLabel(""+userDigits);
        levelOfUser = new JLabel(userLevel);
        scoreOfUser = new JLabel(""+userScore);

        if (userScore >= 5)
            statusOfUser = new JLabel("Won");
        else
            statusOfUser = new JLabel("Loss");


        nameOfUser.setBounds(150, 110, 200, 30);
        modeOfUser.setBounds(150, 160, 200, 30);
        digitsOfUser.setBounds(150, 210, 200, 30);
        levelOfUser.setBounds(150, 260, 200, 30);
        scoreOfUser.setBounds(150, 310, 200, 30);
        statusOfUser.setBounds(150, 360, 200, 30);

        nameOfUser.setBorder(new LineBorder(Color.BLACK, 3));
        modeOfUser.setBorder(new LineBorder(Color.BLACK, 3));
        digitsOfUser.setBorder(new LineBorder(Color.BLACK, 3));
        levelOfUser.setBorder(new LineBorder(Color.BLACK, 3));
        scoreOfUser.setBorder(new LineBorder(Color.BLACK, 3));
        statusOfUser.setBorder(new LineBorder(Color.BLACK, 3));

        f.setLayout(null);

        f.add(resultLabel);

        f.add(name);
        f.add(mode);
        f.add(digits);
        f.add(level);
        f.add(score);
        f.add(status);

        f.add(nameOfUser);
        f.add(modeOfUser);
        f.add(digitsOfUser);
        f.add(levelOfUser);
        f.add(scoreOfUser);
        f.add(statusOfUser);

        f.setSize(400, 500);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}