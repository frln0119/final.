import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JFrame {

  public JPasswordField pwField;

  public void logInFrame() {

    JTextField userField = new JTextField("Username: ");
    userField.setBounds(180, 90, 160, 40);
    userField.addFocusListener(new FocusListener() {

      @Override
      public void focusGained(FocusEvent e) {
        if (userField.getText().equals("Username: ")) {
          userField.setText("");
          userField.setForeground(Color.BLACK);
        }
      }

      @Override
      public void focusLost(FocusEvent e) {
        if (userField.getText().isEmpty()) {
          userField.setForeground(Color.GRAY);
          userField.setText("Username:");
        }
      }
    });

    pwField = new JPasswordField("");
    pwField.setBounds(180, 170, 160, 40);
    pwField.setForeground(Color.BLACK);

    JButton logInBTN = new JButton("Login");
    logInBTN.setBounds(130, 250, 210, 40);
    logInBTN.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });

    JButton registerBTN = new JButton("Create new account");
    registerBTN.setBounds(130, 320, 210, 40);
    registerBTN.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        dispose();
        signUp.main(null);
      }
    });

    JButton clearBTN = new JButton("Clear");
    clearBTN.setBounds(130, 390, 210, 40);
    clearBTN.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        userField.setText("");
        pwField.setText("");
      }
    });

    setLayout(null);
    add(userField);
    add(pwField);
    add(registerBTN);
    add(logInBTN);
    add(clearBTN);
    setSize(500, 600);
    setLocationRelativeTo(null);
    setResizable(false);
    setVisible(true);
		setTitle("Hospital Management System");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    Main Main = new Main();
    Main.logInFrame();
  }
}