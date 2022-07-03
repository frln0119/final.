import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
class signup extends JFrame {
	signUpInterface() {
		JLabel sign = new JLabel("SignUp");
  	sign.setBounds(210, 20, 500, 40);
		JLabel note = new JLabel("the password doesn't match correctly, please try again.");
	note.setBounds(1, 1, 250, 100);
	note.setVisible(false);
  JTextField desiredUser = new JTextField("Username");
  desiredUser.setBounds(180, 120, 160, 40);
  desiredUser.setForeground(Color.GRAY);
  desiredUser.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
      if (desiredUser.getText().equals("Username")) {
          desiredUser.setText("");
          desiredUser.setForeground(Color.BLACK);
      }
    }        
    public void focusLost(FocusEvent e) {
      if (desiredUser.getText().isEmpty()) {
        desiredUser.setForeground(Color.GRAY);
        desiredUser.setText("Username");
      }
		}
  });
  JTextField desiredPassword = new JTextField("Password");
  desiredPassword.setBounds(180, 180, 160, 40);
  desiredPassword.setForeground(Color.GRAY);
  desiredPassword.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
      if (desiredPassword.getText().equals("Password")) {
        desiredPassword.setText("");
        desiredPassword.setForeground(Color.BLACK);
      }
  }
    public void focusLost(FocusEvent e) {
      if (desiredPassword.getText().isEmpty()) {
          desiredPassword.setForeground(Color.GRAY);
          desiredPassword.setText("Password");
			}
    }
  });
  JTextField passwordAgain = new JTextField("Confirm Password");
  passwordAgain.setBounds(180, 240, 160, 40);
  passwordAgain.setForeground(Color.GRAY);
  passwordAgain.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
      if (passwordAgain.getText().equals("Confirm Password")) {
        passwordAgain.setText("");
        passwordAgain.setForeground(Color.BLACK);
       }
    }
    public void focusLost(FocusEvent e) {
      if (passwordAgain.getText().isEmpty()) {
        passwordAgain.setForeground(Color.GRAY);
        passwordAgain.setText("Confirm Password");
      }
    }
	});

  JButton signUp = new JButton("Sign Up");
  signUp.setBounds(130, 320, 210, 40);
  signUp.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
			if((desiredPassword.getText().equals(passwordAgain.getText())) && desiredUser.getText() != ("")) {
			  try {
									FileWriter inputs = new FileWriter("dataentry.txt");
									inputs.write(desiredUser.getText() + "\t" + passwordAgain.getText() + "\n");
									inputs.close();
									dispose();
									Main.main(null);
								}
								catch (Exception  ae) {}
							}
            }
        });
        JButton bckToLogIn = new JButton("Back To LogIn");
        bckToLogIn.setBounds(130, 390, 210, 40);
        bckToLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.main(null);
                dispose();
            }
        });
        setLayout(null);
        add(sign);
        add(desiredUser);
        add(desiredPassword);
        add(passwordAgain);
        add(signUp);
        add(bckToLogIn);
        setSize(500, 600);
				setTitle("Hospital Management System");
				setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
	}
  JLabel sign = new JLabel("SignUp");
  sign.setBounds(210, 20, 500, 40);
	JLabel note = new JLabel("the password doesn't match correctly, please try again.");
	note.setBounds(1, 1, 250, 100);
	note.setVisible(false);
  JTextField desiredUser = new JTextField("Username");
  desiredUser.setBounds(180, 120, 160, 40);
  desiredUser.setForeground(Color.GRAY);
  desiredUser.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
      if (desiredUser.getText().equals("Username")) {
          desiredUser.setText("");
          desiredUser.setForeground(Color.BLACK);
      }
    }        
    public void focusLost(FocusEvent e) {
      if (desiredUser.getText().isEmpty()) {
        desiredUser.setForeground(Color.GRAY);
        desiredUser.setText("Username");
      }
		}
  });
  JTextField desiredPassword = new JTextField("Password");
  desiredPassword.setBounds(180, 180, 160, 40);
  desiredPassword.setForeground(Color.GRAY);
  desiredPassword.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
      if (desiredPassword.getText().equals("Password")) {
        desiredPassword.setText("");
        desiredPassword.setForeground(Color.BLACK);
      }
  }
    public void focusLost(FocusEvent e) {
      if (desiredPassword.getText().isEmpty()) {
          desiredPassword.setForeground(Color.GRAY);
          desiredPassword.setText("Password");
			}
    }
  });
  JTextField passwordAgain = new JTextField("Confirm Password");
  passwordAgain.setBounds(180, 240, 160, 40);
  passwordAgain.setForeground(Color.GRAY);
  passwordAgain.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
      if (passwordAgain.getText().equals("Confirm Password")) {
        passwordAgain.setText("");
        passwordAgain.setForeground(Color.BLACK);
       }
    }
    public void focusLost(FocusEvent e) {
      if (passwordAgain.getText().isEmpty()) {
        passwordAgain.setForeground(Color.GRAY);
        passwordAgain.setText("Confirm Password");
      }
    }
	});

  JButton signUp = new JButton("Sign Up");
  signUp.setBounds(130, 320, 210, 40);
  signUp.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
			if((desiredPassword.getText().equals(passwordAgain.getText())) && desiredUser.getText() != ("")) {
			  try {
									FileWriter inputs = new FileWriter("dataentry.txt");
									inputs.write(desiredUser.getText() + "\t" + passwordAgain.getText() + "\n");
									inputs.close();
									dispose();
									Main.main(null);
								}
								catch (Exception  ae) {}
							}
            }
        });
        JButton bckToLogIn = new JButton("Back To LogIn");
        bckToLogIn.setBounds(130, 390, 210, 40);
        bckToLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.main(null);
                dispose();
            }
        });
        setLayout(null);
        add(sign);
        add(desiredUser);
        add(desiredPassword);
        add(passwordAgain);
        add(signUp);
        add(bckToLogIn);
        setSize(500, 600);
				setTitle("Hospital Management System");
				setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

}

class login extends JFrame {
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
}
class system {
	public static void main(String args[]) {
    system s = new system();
    s.signUpInterface();
	}
}