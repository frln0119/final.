import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class signup extends JFrame {
	JLabel sign, usernameIcon, hero, pass;
	JTextField desiredUser, desiredPassword, passwordAgain;
	JButton bckToLogInBTN, signUpBTN;
	void signupInterface() {
    sign = new JLabel("SignUp");
    sign.setBounds(210, 20, 500, 40);
    usernameIcon = new JLabel("");
    usernameIcon.setIcon(new ImageIcon(new ImageIcon("images/user-icon.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    usernameIcon.setBounds(130, 120, 190, 40);
    hero = new JLabel("");
    hero.setIcon(new ImageIcon(new ImageIcon("images/pass-confirm.jpeg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    hero.setBounds(130, 180, 190, 40);
    pass = new JLabel("");
    pass.setIcon(new ImageIcon(new ImageIcon("images/pass-icon.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    pass.setBounds(130, 240, 190, 40);

    desiredUser = new JTextField("Username");
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

    desiredPassword = new JTextField("Password");
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

  	passwordAgain = new JTextField("Confirm Password");
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

		signUpBTN = new JButton("Sign Up");
    signUpBTN.setBounds(130, 320, 210, 40);
    signUpBTN.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if((desiredPassword.getText().equals(passwordAgain.getText())) && (desiredUser.getText() != (""))) {
			 		try {
						FileWriter inputs = new FileWriter("data/dataentry.txt", true);
						inputs.write(desiredUser.getText() + "\t" + passwordAgain.getText() + "\n");
						inputs.close();
						JOptionPane.showMessageDialog(null, "Account has been created!");
						dispose();
						signin si = new signin();
						si.signinInterface();
					}
					catch (Exception  ae) {}
				}
      }
   	});
    bckToLogInBTN = new JButton("Back To LogIn");
    bckToLogInBTN.setBounds(130, 390, 210, 40);
    bckToLogInBTN.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
				signin si = new signin();
				si.signinInterface();
        dispose();
      }
    });
    setLayout(null);
		setTitle("Hospital Management System");
		add(pass);
		add(hero);
		add(usernameIcon);
    add(sign);
    add(desiredUser);
    add(desiredPassword);
    add(passwordAgain);
  	add(signUpBTN);
    add(bckToLogInBTN);
    setSize(500, 600);
    setVisible(true);
    setResizable(false);
	}
}



class appoint extends JFrame {
	JTextField hour, minutes, pmOrAm, date;
	JLabel ment, hours, min, pmam, dateicon;
	JButton cancel, submit;
	
	void appointmentInterface() {
    ment = new JLabel("Appointment");
    ment.setBounds(190, 20, 500, 40);
    hours = new JLabel("");
    hours.setIcon(new ImageIcon(new ImageIcon("images/hours.jpeg").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
    hours.setBounds(50, 90, 160, 40);
    min = new JLabel("");
    min.setIcon(new ImageIcon(new ImageIcon("images/minutes.jpeg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    min.setBounds(50, 160, 160, 40);
    pmam = new JLabel("");
    pmam.setIcon(new ImageIcon(new ImageIcon("images/ampm.jpeg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    pmam.setBounds(50, 230, 160, 40);
    dateicon = new JLabel("");
    dateicon.setIcon(new ImageIcon(new ImageIcon("images/date.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    dateicon.setBounds(50, 300, 160, 40);
    hour = new JTextField("Hour");
    hour.setBounds(130, 90, 210, 40);
    hour.setForeground(Color.GRAY);
  	hour.addFocusListener(new FocusListener() {
      public void focusGained(FocusEvent e) {
        if (hour.getText().equals("Hour")) {
          hour.setText("");
          hour.setForeground(Color.BLACK);
        }
			}
      public void focusLost(FocusEvent e) {
        if (hour.getText().isEmpty()) {
          hour.setForeground(Color.GRAY);
        	hour.setText("Hour");
        }
      }
    });
    minutes = new JTextField("Minutes");
    minutes.setBounds(130, 160, 210, 40);
		minutes.setForeground(Color.GRAY);
    minutes.addFocusListener(new FocusListener() {
    	public void focusGained(FocusEvent e) {
        if (minutes.getText().equals("Minutes")) {
        	minutes.setText("");
          minutes.setForeground(Color.BLACK);
        }
			}
      public void focusLost(FocusEvent e) {
        if (minutes.getText().isEmpty()) {
          minutes.setForeground(Color.GRAY);
          minutes.setText("Minutes");
        }
      }
		});
    pmOrAm = new JTextField("PM/AM");
    pmOrAm.setBounds(130, 230, 210, 40);
		pmOrAm.setForeground(Color.GRAY);
    pmOrAm.addFocusListener(new FocusListener() {
      public void focusGained(FocusEvent e) {
        if (pmOrAm.getText().equals("PM/AM")) {
          pmOrAm.setText("");
        	pmOrAm.setForeground(Color.BLACK);
        }
			}
      public void focusLost(FocusEvent e) {
        if (pmOrAm.getText().isEmpty()) {
          pmOrAm.setForeground(Color.GRAY);
          pmOrAm.setText("PM/AM");
        }
      }
    });

    date = new JTextField("MM/DD/YYYY");
    date.setBounds(130, 300, 210, 40);
		date.setForeground(Color.GRAY);
    date.addFocusListener(new FocusListener() {
      public void focusGained(FocusEvent e) {
        if (date.getText().equals("MM/DD/YYYY")) {
          date.setText("");
          date.setForeground(Color.BLACK);
        }
			}
      public void focusLost(FocusEvent e) {
        if (date.getText().isEmpty()) {
          date.setForeground(Color.GRAY);
          date.setText("MM/DD/YYYY");
        }
      }
    });
    submit = new JButton("Submit");
    submit.setBounds(130, 390, 210, 40);
    submit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog( null, "Appointment has been processed!" );
				dispose();
      }
    });
    cancel = new JButton("Cancel, go back");
    cancel.setBounds(130, 470, 210, 40);
    cancel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dashboard db = new dashboard();
				db.dashboardInterface();
      }
    });
    setLayout(null);
		setTitle("Hospital Management System");
    add(ment);
    add(submit);
		add(hours);
		add(dateicon);
  	add(date);
    add(hour);
    add(minutes);
    add(pmOrAm);
		add(min);
		add(pmam);
    add(cancel);
    setVisible(true);
    setResizable(false);
    setLayout(null);
    setSize(500, 600);
		setLocationRelativeTo(null);
	}
}

class dashboard extends JFrame {
	JButton patient, labs, branch, med, appoint, equipmentSupplies, doc, exit;
	
	void dashboardInterface() {
    patient = new JButton("Patient");
    patient.setBounds(60, 70, 150, 40);
    patient.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });

    labs = new JButton("laboratory");
  	labs.setBounds(260, 70, 150, 40);
    labs.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
       }
    });

    branch = new JButton("Branches");
    branch.setBounds(60, 180, 150, 40);
  	branch.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      	dispose();
      }
    });

    med = new JButton("Medicine");
	  med.setBounds(260, 180, 150, 40);
  	med.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });
		
    appoint = new JButton("Appointment");
    appoint.setBounds(60, 280, 150, 40);
		appoint.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
				appoint app = new appoint();
				app.appointmentInterface();
        }
    });

    equipmentSupplies = new JButton("Equipment & Supplies");
    equipmentSupplies.setBounds(60, 380, 150, 40);
    equipmentSupplies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        dispose();
    	 }
    });

    doc = new JButton("doctors");
    doc.setBounds(260, 380, 150, 40);
    doc.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
        dispose();
       }
    });

    exit = new JButton("Close");
    exit.setBounds(170, 500, 150, 40);
  	exit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(1);
			}
    });

    setLayout(null);
  	add(patient);
    add(labs);
    add(doc);
    add(exit);
    add(equipmentSupplies);;
    add(appoint);
    add(med);
   	add(branch);
    setSize(500, 600);
		setLocationRelativeTo(null);
		setTitle("Hospital Management System");
    setVisible(true);
    setResizable(false);
	}
}


class signin extends JFrame {
	JTextField logInF, pass;
	JButton signInBTN, signUpBTN, clear;
	JLabel note, usericon, passicon;
	
	void signinInterface() {
		note = new JLabel("");
		note.setBounds(0, 0, 0, 0);
    usericon = new JLabel("");
    usericon.setIcon(
        new ImageIcon(new ImageIcon("images/iconuser.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    usericon.setBounds(130, 90, 190, 40);
    

    passicon = new JLabel("");
    passicon.setIcon(new ImageIcon(
        new ImageIcon("images/login-pass.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    passicon.setBounds(130, 170, 190, 40);
    

    logInF = new JTextField("Username: ");
    logInF.setBounds(180, 90, 160, 40);
    logInF.addFocusListener(new FocusListener() {
      public void focusGained(FocusEvent e) {
        if (logInF.getText().equals("Username: ")) {
          logInF.setText("");
          logInF.setForeground(Color.BLACK);
        }
			}
      public void focusLost(FocusEvent e) {
        if (logInF.getText().isEmpty()) {
          logInF.setForeground(Color.GRAY);
          logInF.setText("Username:");
        }
      }
    });

    pass = new JTextField("Password");
    pass.setBounds(180, 170, 160, 40);
    pass.setForeground(Color.BLACK);

    signInBTN = new JButton("Login");
    signInBTN.setBounds(130, 250, 210, 40);
    signInBTN.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
				boolean isRegistered = false;
				String uname = logInF.getText().toString();
				String pw = pass.getText().toString();
				String line;
				dashboard db = new dashboard();
				try {
					FileReader inputread = new FileReader("data/dataentry.txt");
					BufferedReader br = new BufferedReader(inputread);
					while ((line = br.readLine()) != null) {
						if(line.equals(uname + "/t" + pw)) {
							isRegistered = true;
							break;
						}
						inputread.close();
						if (isRegistered) {
							db.dashboardInterface();
							dispose();
						}
						else {
							note.setText("Incorrect usrname or password");
						}
					}
				}
				catch (Exception ex) {}
      }
    });

    signUpBTN = new JButton("Create new account");
    signUpBTN.setBounds(130, 320, 210, 40);
    signUpBTN.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
				signup su = new signup();
				su.signupInterface();
        dispose();
      }
    });

    clear = new JButton("Clear");
    clear.setBounds(130, 390, 210, 40);
    clear.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        logInF.setText(null);
        pass.setText("");
      }
    });

    setLayout(null);
    add(logInF);
    add(pass);
		add(usericon);
		setTitle("Hospital Management System");
    add(signUpBTN);
		add(passicon);
    add(signInBTN);
    add(clear);
    setSize(500, 600);
    setLocationRelativeTo(null);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}



class system {
	public static void main(String[] args) {
		signin si = new signin();
		si.signinInterface();
		si.setVisible(true);
	}
}