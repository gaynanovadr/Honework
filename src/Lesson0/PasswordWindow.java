package Lesson0;

import javax.swing.*;
import java.awt.*;

public class PasswordWindow extends JFrame {

    private int winWidth = 800;
    private int winHeight = 500;
    private int winPosX = 150;
    private int winPosY = 150;

    private JPanel firstPanel;
    private JPanel secondPanel;
    private JPanel thirdPanel;
    private JPanel diffLevel;
    private JPanel options;

    private JButton btnGenerate;
    private JButton btnCopy;

    private JRadioButton easy;
    private JRadioButton medium;
    private JRadioButton hard;

    private JCheckBox lowerCase;
    private JCheckBox upperCase;
    private JCheckBox numbers;
    private JCheckBox symbols;

    private JLabel welcome;
    private JButton result;

    PasswordWindow() {
        setUpWindow();
        setLayout(new GridLayout(3,1));
        setBackground(Color.pink);

        firstPanel();
        add(firstPanel);
        secondPanel();
        add(secondPanel);
        thirdPanel ();
        add(thirdPanel);

    }
    private void firstPanel (){
        firstPanel = new JPanel();
        result = new JButton("Here is result");
        firstPanel.setLayout(new FlowLayout());

        welcome= new JLabel("Customize your own Password! ");
        welcome.setFont(new Font("Serif", Font.BOLD, 15));
        firstPanel.add(welcome);
        firstPanel.add(result);
        
    }
    private void secondPanel () {
        secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(1,2));
        setOptions();
        secondPanel.add(options);
        setLevels();
        secondPanel.add(diffLevel);

    }
    private void setOptions () {
        options = new JPanel();
        options.setLayout(new GridLayout(4,2));
        lowerCase = new JCheckBox();
        upperCase = new JCheckBox();
        numbers = new JCheckBox();
        symbols = new JCheckBox();
        options.add(lowerCase);
        options.add(new JLabel("add Lower Case"));
        options.add(upperCase);
        options.add(new JLabel("add Upper Case"));
        options.add(numbers);
        options.add(new JLabel("add Numbers"));
        options.add(symbols);
        options.add(new JLabel("add Symbols"));

    }
    private void setLevels () {
        diffLevel = new JPanel();
        diffLevel.setLayout(new GridLayout(3,2));
        easy = new JRadioButton();
        medium = new JRadioButton();
        hard = new JRadioButton();
        diffLevel.add(easy);
        diffLevel.add(new JLabel("easy to remember"));
        diffLevel.add(medium);
        diffLevel.add(new JLabel("medium"));
        diffLevel.add(hard);
        diffLevel.add(new JLabel("hard"));
    }
    private void thirdPanel () {
        thirdPanel = new JPanel();
        thirdPanel.setLayout(new GridLayout(1,2));

        btnGenerate = new JButton("Generate");
        btnCopy = new JButton("Copy Password");
        thirdPanel.add(btnGenerate);
        thirdPanel.add(btnCopy);

        btnCopy.setBorderPainted(true);
        btnCopy.setOpaque(false);

    }


    private void setUpWindow() {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(winWidth, winHeight);
        setLocation(winPosX, winPosY);
        setResizable(false);
        setTitle("Password Generator");
        setBackground(Color.pink);

    }
}
