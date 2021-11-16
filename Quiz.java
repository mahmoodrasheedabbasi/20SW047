import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener {

    JFrame frame;
    JLabel labels, name, mode, digits, level, quizLabel;
    JLabel nameOfUser, modeOfUser, digitsOfUser, levelOfUser;
    JLabel[] Qlabels = new JLabel[10];
    JButton submitButton;
    JRadioButton button[] = new JRadioButton[40];
    ButtonGroup group[] = new ButtonGroup[10];

    double num1[] = new double[10];
    double num2[] = new double[10];
    double num3[] = new double[10];
    double num4[] = new double[10];
    double num5[] = new double[10];
    double userOptions[] = new double[10];
    double correctOptions[] = new double[10];

    int correct = 0;

    String userName, userMode, userLevel;
    int userDigits;

    Quiz(String userName, String userMode, int userDigits, String userLevel) {

        this.userName = userName;
        this.userMode = userMode;
        this.userDigits = userDigits;
        this.userLevel = userLevel;

        frame = new JFrame("Arithmetic Quiz Game");
        frame.getContentPane().setBackground(Color.WHITE);

        quizLabel = new JLabel("   Start Quiz");
        quizLabel.setBounds(300, 10, 200, 50);
        quizLabel.setForeground(Color.RED);
        quizLabel.setBorder(new LineBorder(Color.RED, 5));
        quizLabel.setFont(new Font("Arail", Font.BOLD, 30));

        name = new JLabel("Name");
        mode = new JLabel("Mode");
        digits = new JLabel("Digits");
        level = new JLabel("Level");

        name.setBounds(50, 70, 100, 50);
        mode.setBounds(270, 70, 100, 50);
        digits.setBounds(400, 70, 100, 50);
        level.setBounds(550, 70, 100, 50);

        nameOfUser = new JLabel(userName);
        modeOfUser = new JLabel(userMode);
        digitsOfUser = new JLabel(""+userDigits);
        levelOfUser = new JLabel(userLevel);

        nameOfUser.setBounds(100, 80, 120, 30);
        modeOfUser.setBounds(320, 80, 60, 30);
        digitsOfUser.setBounds(450, 80, 50, 30);
        levelOfUser.setBounds(600, 80, 100, 30);

        nameOfUser.setBorder(new LineBorder(Color.BLACK, 3));
        modeOfUser.setBorder(new LineBorder(Color.BLACK, 3));
        digitsOfUser.setBorder(new LineBorder(Color.BLACK, 3));
        levelOfUser.setBorder(new LineBorder(Color.BLACK, 3));


        labels = new JLabel();

        labels.add(quizLabel);
        labels.add(name);
        labels.add(mode);
        labels.add(digits);
        labels.add(level);

        labels.add(nameOfUser);
        labels.add(modeOfUser);
        labels.add(digitsOfUser);
        labels.add(levelOfUser);



        for (int i = 0; i < group.length; i++)
            group[i] = new ButtonGroup();

        // Easy Mode

        // Easy Mode and Level is Addition
        if (userMode == "Easy" && userDigits == 2 && userLevel == "Addition") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] + num2[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " + " + num2[i] + " = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Easy" && userDigits == 3 && userLevel == "Addition") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                num3[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] + num2[i] + num3[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " + " + num2[i] + " + " + num3[i] + " = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Easy Mode and Level is subtraction
        if (userMode == "Easy" && userDigits == 2 && userLevel == "Subtraction") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] - num2[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " - " + num2[i] + " = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Easy" && userDigits == 3 && userLevel == "Subtraction") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                num3[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] - num2[i] - num3[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " - " + num2[i] + " - " + num3[i] + " = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Easy Mode and Level is Multiplication
        if (userMode == "Easy" && userDigits == 2 && userLevel == "Multiplication") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] * num2[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " * " + num2[i] + " = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Easy" && userDigits == 3 && userLevel == "Multiplication") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                num3[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] * num2[i] * num3[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " * " + num2[i] + " * " + num3[i] + " = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Easy Mode and Level is Division

        if (userMode == "Easy" && userDigits == 2 && userLevel == "Division") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] / num2[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " / " + num2[i] + " = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Easy" && userDigits == 3 && userLevel == "Division") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 3 + (int) (Math.random() * 2);
                num2[i] = 3 + (int) (Math.random() * 2);
                num3[i] = 3 + (int) (Math.random() * 2);
                correctOptions[i] = (num1[i] / num2[i]) / num3[i];
                Qlabels[i] = new JLabel((i + 1) + ") (" + num1[i] + " / " + num2[i] + ") / " + num3[i] + " = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Medium Mode

        // Medium Mode and Level is Addition
        if (userMode == "Medium" && userDigits == 3 && userLevel == "Addition") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 2 + (int) (Math.random() * 3);
                num2[i] = 2 + (int) (Math.random() * 3);
                num3[i] = 2 + (int) (Math.random() * 3);
                correctOptions[i] = num1[i] + num2[i] + num3[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " + " + num2[i] + " + " + num3[i] +" = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Medium" && userDigits == 4 && userLevel == "Addition") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 10);
                num2[i] = 5 + (int) (Math.random() * 10);
                num3[i] = 5 + (int) (Math.random() * 10);
                num4[i] = 5 + (int) (Math.random() * 10);
                correctOptions[i] = num1[i] + num2[i] + num3[i] + num4[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " + " + num2[i] + " + " + num3[i] + " + " + num4[i] + " = _______");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Medium Mode and Level is subtraction
        if (userMode == "Medium" && userDigits == 3 && userLevel == "Subtraction") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 10);
                num2[i] = 5 + (int) (Math.random() * 10);
                num3[i] = 5 + (int) (Math.random() * 10);
                correctOptions[i] = num1[i] - num2[i] - num3[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " - " + num2[i] + " - " + num3[i] + " = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Medium" && userDigits == 4 && userLevel == "Subtraction") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 10);
                num2[i] = 5 + (int) (Math.random() * 10);
                num3[i] = 5 + (int) (Math.random() * 10);
                num4[i] = 5 + (int) (Math.random() * 10);
                correctOptions[i] = num1[i] - num2[i] - num3[i] - num4[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " - " + num2[i] + " - " + num3[i] + " - " + num4[i] +" = _______");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Medium Mode and Level is Multiplication
        if (userMode == "Medium" && userDigits == 3 && userLevel == "Multiplication") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                num3[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] * num2[i] * num3[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " * " + num2[i] + " * " + num3[i] +" = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Medium" && userDigits == 4 && userLevel == "Multiplication") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                num3[i] = 5 + (int) (Math.random() * 5);
                num4[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] * num2[i] * num3[i] * num4[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " * " + num2[i] + " * " + num3[i] + " * " + num4[i] +" = _______");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Medium Mode and Level is Division
        if (userMode == "Medium" && userDigits == 3 && userLevel == "Division") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 2 + (int) (Math.random() * 3);
                num2[i] = 2 + (int) (Math.random() * 3);
                num3[i] = 2 + (int) (Math.random() * 3);
                correctOptions[i] = (num1[i] / num2[i]) / num3[i];
                Qlabels[i] = new JLabel((i + 1) + ") (" + num1[i] + " / " + num2[i] + ") / " + num3[i] + " = _______");
                Qlabels[i].setBounds(50, y, 200, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Medium" && userDigits == 4 && userLevel == "Division") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 2 + (int) (Math.random() * 3);
                num2[i] = 2 + (int) (Math.random() * 3);
                num3[i] = 2 + (int) (Math.random() * 3);
                num4[i] = 2 + (int) (Math.random() * 3);
                correctOptions[i] = ((num1[i] / num2[i]) / num3[i]) / num4[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " / " + num2[i] + " / " +num3[i] + " / " + num4[i] +" = _______");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Hard Mode

        // Hard Mode and Level is Addition
        if (userMode == "Hard" && userDigits == 4 && userLevel == "Addition") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 10 + (int) (Math.random() * 10);
                num2[i] = 10 + (int) (Math.random() * 10);
                num3[i] = 10 + (int) (Math.random() * 10);
                num4[i] = 10 + (int) (Math.random() * 10);
                correctOptions[i] = num1[i] + num2[i] + num3[i] + num4[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " + " + num2[i] + " + " +num3[i] + " + " + num4[i] +" = _____");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Hard" && userDigits == 5 && userLevel == "Addition") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 10 + (int) (Math.random() * 10);
                num2[i] = 10 + (int) (Math.random() * 10);
                num3[i] = 10 + (int) (Math.random() * 10);
                num4[i] = 10 + (int) (Math.random() * 10);
                num5[i] = 10 + (int) (Math.random() * 10);
                correctOptions[i] = num1[i] + num2[i] + num3[i] + num4[i] + num5[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " + " + num2[i] + " + " + num3[i] + " + " + num4[i] + " + " + num5[i]+" = _____");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Hard Mode and Level is subtraction
        if (userMode == "Hard" && userDigits == 4 && userLevel == "Subtraction") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 10 + (int) (Math.random() * 10);
                num2[i] = 10 + (int) (Math.random() * 10);
                num3[i] = 10 + (int) (Math.random() * 10);
                num4[i] = 10 + (int) (Math.random() * 10);
                correctOptions[i] = num1[i] - num2[i] - num3[i] - num4[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " - " + num2[i] + " - "  +num3[i] + " - " + num4[i] +" = _____");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Hard" && userDigits == 5 && userLevel == "Subtraction") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 10 + (int) (Math.random() * 10);
                num2[i] = 10 + (int) (Math.random() * 10);
                num3[i] = 10 + (int) (Math.random() * 10);
                num4[i] = 10 + (int) (Math.random() * 10);
                num5[i] = 10 + (int) (Math.random() * 10);
                correctOptions[i] = num1[i] - num2[i] - num3[i] - num4[i] - num5[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " - " + num2[i] + " - " + num3[i] + " - " + num4[i] + " - " + num5[i]+" = _____");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Hard Mode and Level is Multiplication
        if (userMode == "Hard" && userDigits == 4 && userLevel == "Multiplication") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                num3[i] = 5 + (int) (Math.random() * 5);
                num4[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] * num2[i] * num3[i] * num4[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " * " + num2[i] + " * "  +num3[i] + " * " + num4[i] +" = _____");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Hard" && userDigits == 5 && userLevel == "Multiplication") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 5 + (int) (Math.random() * 5);
                num2[i] = 5 + (int) (Math.random() * 5);
                num3[i] = 5 + (int) (Math.random() * 5);
                num4[i] = 5 + (int) (Math.random() * 5);
                num5[i] = 5 + (int) (Math.random() * 5);
                correctOptions[i] = num1[i] * num2[i] * num3[i] * num4[i] * num5[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " * " + num2[i] + " * " + num3[i] + " * " + num4[i] + " * " + num5[i]+" = _____");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        // Hard Mode and Level is Division
        if (userMode == "Hard" && userDigits == 4 && userLevel == "Division") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 2 + (int) (Math.random() * 3);
                num2[i] = 2 + (int) (Math.random() * 3);
                num3[i] = 2 + (int) (Math.random() * 3);
                num4[i] = 2 + (int) (Math.random() * 3);
                correctOptions[i] = num1[i] / num2[i] / num3[i] / num4[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " / " + num2[i] + " / "  +num3[i] + " / " + num4[i] +" = _____");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        if (userMode == "Hard" && userDigits == 5 && userLevel == "Division") {

            for (int i = 0, y = 100; i < Qlabels.length; i++, y += 30) {

                num1[i] = 2 + (int) (Math.random() * 3);
                num2[i] = 2 + (int) (Math.random() * 3);
                num3[i] = 2 + (int) (Math.random() * 3);
                num4[i] = 2 + (int) (Math.random() * 3);
                num5[i] = 2 + (int) (Math.random() * 3);
                correctOptions[i] = num1[i] / num2[i] / num3[i] / num4[i] / num5[i];
                Qlabels[i] = new JLabel((i + 1) + ") " + num1[i] + " / " + num2[i] + " / " + num3[i] + " / " + num4[i] + " / " + num5[i]+" = _____");
                Qlabels[i].setBounds(50, y, 250, 100);
                labels.add(Qlabels[i]);
            }
        }

        // JRadio Buttons
        for (int i = 0, x = 300; i < 4; x += 100, i++) {

            button[i] = new JRadioButton();

            if (i == 3)
                button[i].setText("" + (correctOptions[0]));
            else
                button[i].setText("" + (correctOptions[0] + i + 1));

            button[i].setBounds(x, 135, 80, 30);
            button[i].addActionListener(this);
            group[0].add(button[i]);
            labels.add(button[i]);
        }

        for (int i = 4, j = 1, x = 300; i < 8; x += 100, j++, i++) {

            button[i] = new JRadioButton();

            if (i == 5)
                button[i].setText("" + (correctOptions[1]));
            else
                button[i].setText("" + (correctOptions[1] + j));

            button[i].setBounds(x, 165, 80, 30);
            button[i].addActionListener(this);
            group[1].add(button[i]);
            labels.add(button[i]);
        }

        for (int i = 8, j = 1, x = 300; i < 12; x += 100, j++, i++) {

            button[i] = new JRadioButton();

            if (i == 10)
                button[i].setText("" + (correctOptions[2]));
            else
                button[i].setText("" + (correctOptions[2] + j));

            button[i].setBounds(x, 195, 80, 30);
            button[i].addActionListener(this);
            group[2].add(button[i]);
            labels.add(button[i]);
        }

        for (int i = 12, j = 1, x = 300; i < 16; x += 100, j++, i++) {

            button[i] = new JRadioButton();

            if (i == 12)
                button[i].setText("" + (correctOptions[3]));
            else
                button[i].setText("" + (correctOptions[3] + j));

            button[i].setBounds(x, 225, 80, 30);
            button[i].addActionListener(this);
            group[3].add(button[i]);
            labels.add(button[i]);
        }

        for (int i = 16, j = 1, x = 300; i < 20; x += 100, j++, i++) {

            button[i] = new JRadioButton();

            if (i == 17)
                button[i].setText("" + (correctOptions[4]));
            else
                button[i].setText("" + (correctOptions[4] + j));

            button[i].setBounds(x, 255, 80, 30);
            button[i].addActionListener(this);
            group[4].add(button[i]);
            labels.add(button[i]);
        }

        for (int i = 20, j = 1, x = 300; i < 24; x += 100, j++, i++) {

            button[i] = new JRadioButton();

            if (i == 22)
                button[i].setText("" + (correctOptions[5]));
            else
                button[i].setText("" + (correctOptions[5] + j));

            button[i].setBounds(x, 285, 80, 30);
            button[i].addActionListener(this);
            group[5].add(button[i]);
            labels.add(button[i]);
        }

        for (int i = 24, j = 1, x = 300; i < 28; x += 100, j++, i++) {

            button[i] = new JRadioButton();

            if (i == 27)
                button[i].setText("" + (correctOptions[6]));
            else
                button[i].setText("" + (correctOptions[6] + j));

            button[i].setBounds(x, 315, 80, 30);
            button[i].addActionListener(this);
            group[6].add(button[i]);
            labels.add(button[i]);
        }

        for (int i = 28, j = 1, x = 300; i < 32; x += 100, j++, i++) {

            button[i] = new JRadioButton();

            if (i == 30)
                button[i].setText("" + (correctOptions[7]));
            else
                button[i].setText("" + (correctOptions[7] + j));

            button[i].setBounds(x, 345, 80, 30);
            button[i].addActionListener(this);
            group[7].add(button[i]);
            labels.add(button[i]);
        }

        for (int i = 32, j = 1, x = 300; i < 36; x += 100, j++, i++) {

            button[i] = new JRadioButton();

            if (i == 35)
                button[i].setText("" + (correctOptions[8]));
            else
                button[i].setText("" + (correctOptions[8] + j));

            button[i].setBounds(x, 375, 80, 30);
            button[i].addActionListener(this);
            group[8].add(button[i]);
            labels.add(button[i]);
        }

        for (int i = 36, j = 1, x = 300; i < 40; x += 100, j++, i++) {

            button[i] = new JRadioButton();

            if (i == 39)
                button[i].setText("" + (correctOptions[9]));
            else
                button[i].setText("" + (correctOptions[9] + j));

            button[i].setBounds(x, 405, 80, 30);
            button[i].addActionListener(this);
            group[9].add(button[i]);
            labels.add(button[i]);
        }

        for (int i = 0; i < button.length; i++)
            button[i].setOpaque(false);

        submitButton = new JButton(new ImageIcon("Submit.jpg"));
        submitButton.setBounds(350, 500, 100, 50);
        submitButton.addActionListener(this);

        labels.add(submitButton);
        frame.add(labels);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 4; i++) {

            if (e.getSource() == button[i]) {
                userOptions[0] = Double.parseDouble(button[i].getText());
            }
        }

        for (int i = 4; i < 8; i++) {

            if (e.getSource() == button[i]) {
                userOptions[1] = Double.parseDouble(button[i].getText());
            }
        }

        for (int i = 8; i < 12; i++) {

            if (e.getSource() == button[i]) {
                userOptions[2] = Double.parseDouble(button[i].getText());
            }
        }

        for (int i = 12; i < 16; i++) {

            if (e.getSource() == button[i]) {
                userOptions[3] = Double.parseDouble(button[i].getText());
            }
        }

        for (int i = 16; i < 20; i++) {

            if (e.getSource() == button[i]) {
                userOptions[4] = Double.parseDouble(button[i].getText());
            }
        }

        for (int i = 20; i < 24; i++) {

            if (e.getSource() == button[i]) {
                userOptions[5] = Double.parseDouble(button[i].getText());
            }
        }

        for (int i = 24; i < 28; i++) {

            if (e.getSource() == button[i]) {
                userOptions[6] = Double.parseDouble(button[i].getText());
            }
        }

        for (int i = 28; i < 32; i++) {

            if (e.getSource() == button[i]) {
                userOptions[7] = Double.parseDouble(button[i].getText());
            }
        }

        for (int i = 32; i < 36; i++) {

            if (e.getSource() == button[i]) {
                userOptions[8] = Double.parseDouble(button[i].getText());
            }
        }

        for (int i = 36; i < 40; i++) {

            if (e.getSource() == button[i]) {
                userOptions[9] = Double.parseDouble(button[i].getText());
            }
        }

        if (e.getSource() == submitButton) {

            frame.setVisible(false);

            for (int i = 0; i < correctOptions.length; i++) {

                if (userOptions[i] == correctOptions[i]) {

                    correct++;
                }
            }

            new Result(userName, userMode, userDigits, userLevel, correct);
        }
    }
}