import java.awt.Desktop;
import java.net.URL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
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
        patient p = new patient();
				p.patientInterface();
      }
    });

    labs = new JButton("Laboratory");
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
				branches b = new branches();
				b.brInterface();
				dispose();
      }
    });

    med = new JButton("Medicine");
	  med.setBounds(260, 180, 150, 40);
  	med.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
				meds md = new meds();
				md.medsInterface();
        dispose();
      }
    });
		
    appoint = new JButton("Appointment");
    appoint.setBounds(60, 280, 150, 40);
		appoint.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
				appoint app = new appoint();
				app.appointmentInterface();
				dispose();
        }
    });

    equipmentSupplies = new JButton("Equipment & Supplies");
    equipmentSupplies.setBounds(60, 380, 150, 40);
    equipmentSupplies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equipmentSupplies es = new equipmentSupplies();
				es.equipmentSuppliesInterface();
        dispose();
    	 }
    });

    doc = new JButton("Doctors");
    doc.setBounds(260, 380, 150, 40);
    doc.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
				doc d = new doc();
				d.docInterface();
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
    usericon.setIcon(new ImageIcon(new ImageIcon("images/login-user.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    usericon.setBounds(130, 90, 190, 40);
    
    passicon = new JLabel("");
    passicon.setIcon(new ImageIcon(new ImageIcon("images/login-pass.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
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

class branches extends JFrame {
	JButton firstLocBtnRedirection, secondLocBtnRedirection, thirdLocBtnRedirection, fourthLocBtnRedirection, fifthLocBtnRedirection, sixthLocBtnRedirection, seventhLocBtnRedirection, eightLocBtnRedirection, ninthLocBtnRedirection, tenthLocBtnRedirection, eleventhLocBtnRedirection, backToDashboard;
	JLabel hero, title, firstLocation, secondLocation, thirdLocation, fourthLocation, fifthLocation, sixthLocation, seventhLocation, eigthLocation, ninthLocation, tenthLocation, eleventhLocation;
	void brInterface() {
		   title = new JLabel("Available Branches");
    title.setBounds(470, 10, 150, 40);
    hero = new JLabel("");
    hero.setIcon(new ImageIcon(new ImageIcon("images/branch-icon.jpeg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    hero.setBounds(400, 10, 190, 40);
    firstLocation = new JLabel("CALOOCAN CITY BRANCH");
    firstLocation.setBounds(20, 70, 210, 40);
    firstLocBtnRedirection = new JButton("Visit Caloocan City Branch");
    firstLocBtnRedirection.setBounds(230, 70, 210, 40);
    firstLocBtnRedirection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/14.747312,+121.034181/@14.7472458,121.034288,20z").toURI());
      	} catch (Exception aee) {}
			}
		});
    firstLocBtnRedirection.setForeground(Color.green.darker());

    secondLocation = new JLabel("QUEZON CITY BRANCH");
    secondLocation.setBounds(20, 120, 210, 40);
    secondLocBtnRedirection = new JButton("Visit Quezon City Branch");
    secondLocBtnRedirection.setBounds(230, 120, 210, 40);
    secondLocBtnRedirection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/14.677152,+121.045996/@14.677054,121.0459936,20z").toURI());
      	} catch (Exception exc) {}
			}
		});
    secondLocBtnRedirection.setForeground(Color.green.darker());
		
   	thirdLocation = new JLabel("MAKATI CITY BRANCH");
    thirdLocation.setBounds(20, 170, 210, 40);
    thirdLocBtnRedirection = new JButton("Visit Makati City Branch");
    thirdLocBtnRedirection.setBounds(230, 170, 210, 40);
    thirdLocBtnRedirection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL(           "https://www.google.com/maps/place/399+Jupiter,+Makati,+Metro+Manila/@14.5573011,121.0337739,20z/data=!4m2!3m1!1s0x3397c8fe1e820ba7:0x94e041877fc65f5d").toURI());
      	} catch (Exception exc) {}
			}
		});
    thirdLocBtnRedirection.setForeground(Color.green.darker());

    fourthLocation = new JLabel("PASIG CITY BRANCH");
    fourthLocation.setBounds(20, 220, 210, 40);
    fourthLocBtnRedirection = new JButton("Visit Pasig City Branch");
    fourthLocBtnRedirection.setBounds(230, 220, 210, 40);
		fourthLocBtnRedirection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/14.550143,+121.087664/@14.5500648,121.0877502,20z").toURI());
      	} catch (Exception exc) {}
			}
		});
    fourthLocBtnRedirection.setForeground(Color.green.darker());

    fifthLocation = new JLabel("MANILA BRANCH");
    fifthLocation.setBounds(20, 270, 210, 40);
    fifthLocBtnRedirection = new JButton("Visit Manila City Branch");
    fifthLocBtnRedirection.setBounds(230, 270, 210, 40);
    fifthLocBtnRedirection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL(
"https://www.google.com/maps/place/201+Carlos+Palanca,+Quiapo,+Manila,+1001+Metro+Manila/@14.5966725,120.9834505,20z/data=!4m2!3m1!1s0x3397ca1c67e06f45:0x744e9b05832bfd00").toURI());
      	} catch (Exception exc) {}
			}
		});
    fifthLocBtnRedirection.setForeground(Color.green.darker());

   	sixthLocation = new JLabel("TAGUIG CITY BRANCH");
    sixthLocation.setBounds(290, 330, 210, 40);
    sixthLocBtnRedirection = new JButton("Visit Taguig City Branch");
    sixthLocBtnRedirection.setBounds(490, 330, 210, 40);
    sixthLocBtnRedirection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/14.515877,+121.044167/@14.5159642,121.0444218,19z").toURI());
      	} catch (Exception exc) {}
			}
		});
    sixthLocBtnRedirection.setForeground(Color.green.darker());

    seventhLocation = new JLabel("VALENZUELA BRANCH");
    seventhLocation.setBounds(530, 70, 210, 40);
    seventhLocBtnRedirection = new JButton("Visit Valenzuela City Branch");
    seventhLocBtnRedirection.setBounds(700, 70, 210, 40);
    seventhLocBtnRedirection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL(
            "https://www.google.com/maps/place/909+G.+Angeles,+Valenzuela,+Metro+Manila/@14.703805,120.9956204,19z/data=!4m2!3m1!1s0x3397b15a56ccaab1:0x7913598d2d486850").toURI());
      	} catch (Exception exc) {}
			}
		});
    seventhLocBtnRedirection.setForeground(Color.green.darker());

    eigthLocation = new JLabel("MANDALUYONG BRANCH");
    eigthLocation.setBounds(530, 120, 210, 40);
    eightLocBtnRedirection = new JButton("Visit Mandaluyong City Branch");
    eightLocBtnRedirection.setBounds(700, 120, 210, 40);
    eightLocBtnRedirection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/155+Primo+Cruz,+Mandaluyong,+Metro+Manila/@14.5850067,121.0313964,20z/data=!4m2!3m1!1s0x3397c9cafc8d0b95:0xdcd3b6a2e7ffa0b4").toURI());
      	} catch (Exception exc) {}
			}
		});
    eightLocBtnRedirection.setForeground(Color.green.darker());

    ninthLocation = new JLabel("ANTIPOLO BRANCH");
    ninthLocation.setBounds(530, 170, 210, 40);
    ninthLocBtnRedirection = new JButton("Visit Antipolo City Branch");
    ninthLocBtnRedirection.setBounds(700, 170, 210, 40);
    ninthLocBtnRedirection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/14.624865,+121.127827/@14.6248217,121.127796,20z").toURI());
      	} catch (Exception exc) {}
			}
		});
    ninthLocBtnRedirection.setForeground(Color.green.darker());

    tenthLocation = new JLabel("PASAY BRANCH");
    tenthLocation.setBounds(530, 220, 210, 40);
    tenthLocBtnRedirection = new JButton("Visit Pasay City Branch");
    tenthLocBtnRedirection.setBounds(700, 220, 210, 40);
    tenthLocBtnRedirection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/14.538018,+120.996989/@14.5379958,120.9971149,20z").toURI());
      	} catch (Exception exc) {}
			}
		});
    tenthLocBtnRedirection.setForeground(Color.green.darker());
		
		eleventhLocation = new JLabel("MARIKINA CITY BRANCH");
    eleventhLocation.setBounds(530, 270, 210, 40);
    eleventhLocBtnRedirection = new JButton("Visit Antipolo City Branch");
    eleventhLocBtnRedirection.setBounds(700, 270, 210, 40);
    eleventhLocBtnRedirection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
        	Desktop.getDesktop().browse(new URL(
"https://www.google.com/maps/place/865+J.+P.+Rizal+St,+Marikina,+1800+Metro+Manila/@14.6537683,121.1031279,20z/data=!4m2!3m1!1s0x3397b9bfee0a683b:0x684b3893baa4f78d").toURI());
      	} catch (Exception exc) {}
			}
		});
    eleventhLocBtnRedirection.setForeground(Color.green.darker());

    backToDashboard = new JButton("Back");
    backToDashboard.setBounds(380, 400, 210, 40);
    backToDashboard.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        dispose();
				dashboard db = new dashboard();
				db.dashboardInterface();
      }
    });
		
    setLayout(null);
    add(backToDashboard);
    add(title);
    add(firstLocation);
    add(firstLocBtnRedirection);
    add(secondLocation);
    add(secondLocBtnRedirection);
    add(thirdLocation);
    add(thirdLocBtnRedirection);
    add(fourthLocation);
    add(fourthLocBtnRedirection);
    add(fifthLocation);
    add(fifthLocBtnRedirection);
    add(sixthLocation);
    add(sixthLocBtnRedirection);
    add(seventhLocation);
    add(seventhLocBtnRedirection);
    add(eightLocBtnRedirection);
    add(eigthLocation);
    add(ninthLocation);
    add(ninthLocBtnRedirection);
    add(tenthLocation);
    add(tenthLocBtnRedirection);
    add(eleventhLocation);
    add(eleventhLocBtnRedirection);
		add(hero);
    setSize(1000, 500);
		setTitle("Hospital Management System");
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}


class equipmentSupplies extends JFrame {
	JLabel title, hospital, defibrillators, ecgMach, wheelchairs, beds, xray;
	JButton back;
	Random rndm = new Random();
	int stretchersCount = rndm.nextInt(100);
	int defibrillatorsCount = rndm.nextInt(10);
	int ecgMachines = rndm.nextInt(15);
	int wheelchairsCount = rndm.nextInt(30);
	int hospitalBedsCount = rndm.nextInt(1300);
	int xrayStationsCount = rndm.nextInt(5);

	void equipmentSuppliesInterface() {
		title = new JLabel("Equipment & Supplies");
		title.setBounds(170, 20, 500, 40);

		hospital = new JLabel("Available Hospital Stretcher(s): " + stretchersCount);
		hospital.setBounds(130, 65, 400, 40);

		defibrillators = new JLabel("Available Hospital Defibrillator(s) : " + defibrillatorsCount);
		defibrillators.setBounds(130, 100, 500, 40);

		ecgMach = new JLabel("Available Hospital ECGMachine(s) : " + ecgMachines);
		ecgMach.setBounds(130, 140, 225, 40);

		wheelchairs = new JLabel("Available Hospital Wheelchair(s) : " + wheelchairsCount);
		wheelchairs.setBounds(130, 180, 225, 40);

		beds = new JLabel("Available Hospital Bed(s) : " + hospitalBedsCount);
		beds.setBounds(130, 220, 225, 40);

		xray = new JLabel("Available Hospital Xray(s) : " + xrayStationsCount);
		xray.setBounds(130, 260, 225, 40);

		back = new JButton("Back");
		back.setBounds(90, 330, 100, 40);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				dashboard db = new dashboard();
				db.dashboardInterface();
			}
		});
		
		add(xray);
		add(beds);
		add(wheelchairs);
		add(ecgMach);
		add(defibrillators);
		add(title);
		add(hospital);
		add(back);
		setTitle("Hospital Management System");
		setSize(500, 450);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}


class doc extends JFrame {
	
	JLabel doctor, no, license, name, email, contactNo, specialization, room, docOneNo, docOneLicense, docOneName, docOneEmail, docOneContact, docOneSpec, docOneRoom, docTwoNo, docTwoName, docTwoLicense, docTwoEmail, docTwoContact, docTwoSpec, docTwoRoom, docThreeNo, docThreeLicense, docThreeName, docThreeEmail, docThreeContact, docThreeSpec, docThreeRoom, docFourNo, docFourLicense, docFourName, docFourEmail, docFourContact, docFourSpec, docFourRoom, docFiveNo, docFiveLicense, docFiveName, docFiveEmail, docFiveContact, docFivespec, docFiveRoom;
	JButton ok, back;
	
	void docInterface() {
		
		doctor = new JLabel("Doctors");
    doctor.setBounds(450, 20, 500, 40);

    no = new JLabel("No.: ");
    no.setBounds(20, 65, 390, 40);
    license = new JLabel("Lic No.: ");
    license.setBounds(90, 65, 390, 40);
    name = new JLabel("Name: ");
    name.setBounds(190, 65, 390, 40);
    email = new JLabel("E-Mail: ");
    email.setBounds(360, 65, 390, 40);
    contactNo = new JLabel("Contact No.: ");
    contactNo.setBounds(550, 65, 390, 40);
    specialization = new JLabel("Specialization");
    specialization.setBounds(700, 65, 390, 40);
    room = new JLabel("Room No.: ");
    room.setBounds(860, 65, 390, 40);

    docOneNo = new JLabel("1. ");
    docOneNo.setBounds(20, 100, 390, 40);
    docOneLicense = new JLabel("068543");
    docOneLicense.setBounds(90, 100, 390, 40);
    docOneName = new JLabel("Dr. abraham L. Reyes");
    docOneName.setBounds(190, 100, 390, 40);
    docOneEmail = new JLabel("abraha1901@gmail.com");
    docOneEmail.setBounds(360, 100, 390, 40);
    docOneEmail.setForeground(Color.red);
    docOneContact = new JLabel("09674927462");
    docOneContact.setBounds(550, 100, 390, 40);
    docOneSpec = new JLabel("Opthalmology");
    docOneSpec.setBounds(700, 100, 390, 40);
    docOneRoom = new JLabel("Room 5");
    docOneRoom.setBounds(860, 100, 390, 40);

    docTwoNo = new JLabel("2. ");
    docTwoNo.setBounds(20, 170, 390, 40);
    docTwoLicense = new JLabel("017362");
    docTwoLicense.setBounds(90, 170, 390, 40);
    docTwoName = new JLabel("Dr. Gill P. Gomez");
    docTwoName.setBounds(190, 170, 390, 40);
    docTwoEmail = new JLabel("gill.gomez@gmail.com");
    docTwoEmail.setBounds(360, 170, 390, 40);
    docTwoEmail.setForeground(Color.red);
    docTwoContact = new JLabel("09627264738");
    docTwoContact.setBounds(550, 170, 390, 40);
    docTwoSpec = new JLabel("Pediatrics");
    docTwoSpec.setBounds(700, 170, 390, 40);
    docTwoRoom = new JLabel("Room 2");
    docTwoRoom.setBounds(860, 170, 390, 40);
		
    docThreeNo = new JLabel("3. ");
    docThreeNo.setBounds(20, 240, 390, 40);
    docThreeLicense = new JLabel("084672");
    docThreeLicense.setBounds(90, 240, 390, 40);
    docThreeName = new JLabel("Dr. Manuel P. Arron");
    docThreeName.setBounds(190, 240, 390, 40);
    docThreeEmail = new JLabel("arron@gmail.com");
    docThreeEmail.setBounds(360, 240, 390, 40);
    docThreeEmail.setForeground(Color.red);
   	docThreeContact = new JLabel("09451826478");
    docThreeContact.setBounds(550, 240, 390, 40);
    docThreeSpec = new JLabel("Dermatology");
    docThreeSpec.setBounds(700, 240, 390, 40);
    docThreeRoom = new JLabel("Room 10");
    docThreeRoom.setBounds(860, 240, 390, 40);
		
   	docFourNo = new JLabel("4. ");
    docFourNo.setBounds(20, 310, 390, 40);
    docFourLicense = new JLabel("012843");
    docFourLicense.setBounds(90, 310, 390, 40);
    docFourName = new JLabel("Dr. Shey H. De Guzman");
    docFourName.setBounds(190, 310, 390, 40);
    docFourEmail = new JLabel("shey.guz@gmail.com");
    docFourEmail.setBounds(360, 310, 390, 40);
    docFourEmail.setForeground(Color.red);
    docFourContact = new JLabel("09753823918");
    docFourContact.setBounds(550, 310, 390, 40);
    docFourSpec = new JLabel("Neurology");
    docFourSpec.setBounds(700, 310, 390, 40);
    docFourRoom = new JLabel("Room 15");
    docFourRoom.setBounds(860, 310, 390, 40);
		
    docFiveNo = new JLabel("5. ");
    docFiveNo.setBounds(20, 380, 390, 40);
    docFiveLicense = new JLabel("0362712");
    docFiveLicense.setBounds(90, 380, 390, 40);
    docFiveName = new JLabel("Dr. Roto N. Gomez");
    docFiveName.setBounds(190, 380, 390, 40);
    docFiveEmail = new JLabel("roto@gmail.com");
    docFiveEmail.setBounds(360, 380, 390, 40);
    docFiveEmail.setForeground(Color.red);
  	docFiveContact = new JLabel("09074824736");
    docFiveContact.setBounds(550, 380, 390, 40);
    docFivespec = new JLabel("Cardiology");
    docFivespec.setBounds(700, 380, 390, 40);
  	docFiveRoom = new JLabel("Room 25");
    docFiveRoom.setBounds(860, 380, 390, 40);

    ok = new JButton("Ok");
    ok.setBounds(500, 450, 190, 40);
    ok.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });
		
    setLayout(null);
    add(ok);
    add(doctor);
    add(license);
    add(room);
    add(no);
    add(email);
    add(contactNo);
    add(specialization);
    add(name);
    add(docOneContact);
    add(docOneEmail);
    add(docOneLicense);
    add(docOneName);
    add(docOneNo);
    add(docOneRoom);
    add(docOneSpec);
    add(docTwoContact);
    add(docTwoEmail);
    add(docTwoLicense);
    add(docTwoName);
    add(docTwoNo);
    add(docTwoSpec);
    add(docTwoRoom);
    add(docThreeName);
    add(docThreeContact);
    add(docThreeEmail);
    add(docThreeLicense);
    add(docThreeRoom);
    add(docThreeNo);
    add(docThreeSpec);
    add(docFourContact);
    add(docFourEmail);
    add(docFourLicense);
    add(docFourName);
    add(docFourNo);
    add(docFourRoom);
    add(docFourSpec);
    add(docFiveContact);
    add(docFiveEmail);
    add(docFiveLicense);
    add(docFiveName);
    add(docFiveRoom);
    add(docFiveNo);
    add(docFivespec);
    add(back);
		setTitle("Hospital Management System");
    setResizable(false);
    setVisible(true);
    setSize(1000, 550);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

class patient extends JFrame {
	String name, age, address, contact, sex, email;
	
	void patientInterface() {

		setTitle("Hospital Managepat System");
		JLabel pat = new JLabel("Patient");
		pat.setBounds(210, 20, 500, 40);

		JLabel nameicon = new JLabel("");
		nameicon.setIcon(new ImageIcon(
				new ImageIcon("images/name.jpeg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		nameicon.setBounds(50, 10, 200, 200);
		add(nameicon);

		JLabel ageicon = new JLabel("");
		ageicon.setIcon(new ImageIcon(
				new ImageIcon("images/age.jpeg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		ageicon.setBounds(50, 90, 200, 200);
		add(ageicon);

		JLabel addicon = new JLabel("");
		addicon.setIcon(new ImageIcon(
				new ImageIcon("images/address.jpeg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		addicon.setBounds(50, 170, 200, 200);
		add(addicon);

		JLabel conticon = new JLabel("");
		conticon.setIcon(new ImageIcon(
				new ImageIcon("images/contact.jpeg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		conticon.setBounds(50, 250, 200, 200);
		add(conticon);

		JLabel gendicon = new JLabel("");
		gendicon.setIcon(new ImageIcon(
				new ImageIcon("images/gend.jpeg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		gendicon.setBounds(50, 330, 200, 200);
		add(gendicon);

		JLabel emailicon = new JLabel("");
		emailicon.setIcon(new ImageIcon(
				new ImageIcon("images/email.jpeg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		emailicon.setBounds(50, 400, 200, 200);
		add(emailicon);

		JTextField nameField = new JTextField("Name");
		nameField.setBounds(130, 90, 210, 40);
		nameField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (nameField.getText().equals("Name")) {
					nameField.setText("");
					nameField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (nameField.getText().isEmpty()) {
					nameField.setForeground(Color.GRAY);
					nameField.setText("Name");
				}
			}
		});

		JTextField ageField = new JTextField("Age");
		ageField.setBounds(130, 170, 210, 40);
		ageField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (ageField.getText().equals("Age")) {
					ageField.setText("");
					ageField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (ageField.getText().isEmpty()) {
					ageField.setForeground(Color.GRAY);
					ageField.setText("Age");
				}
			}
		});

		JTextField addressField = new JTextField("Address");
		addressField.setBounds(130, 250, 210, 40);
		addressField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (addressField.getText().equals("Address")) {
					addressField.setText("");
					addressField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (addressField.getText().isEmpty()) {
					addressField.setForeground(Color.GRAY);
					addressField.setText("Address");
				}
			}
		});

		JTextField contactField = new JTextField("Contact");
		contactField.setBounds(130, 330, 210, 40);
		contactField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (contactField.getText().equals("Contact")) {
					contactField.setText("");
					contactField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (contactField.getText().isEmpty()) {
					contactField.setForeground(Color.GRAY);
					contactField.setText("Contact");
				}
			}
		});

		JTextField sexField = new JTextField("Sex");
		sexField.setBounds(130, 410, 210, 40);
		sexField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (sexField.getText().equals("Sex")) {
					sexField.setText("");
					sexField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (sexField.getText().isEmpty()) {
					sexField.setForeground(Color.GRAY);
					sexField.setText("Sex");
				}
			}
		});

		JTextField emailField = new JTextField("Email");
		emailField.setBounds(130, 480, 210, 40);
		emailField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (emailField.getText().equals("Email")) {
					emailField.setText("");
					emailField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (emailField.getText().isEmpty()) {
					emailField.setForeground(Color.GRAY);
					emailField.setText("Email");
				}
			}
		});
	JButton back = new JButton("Back");
		back.setBounds(50, 580, 150, 40);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				dashboard db = new dashboard();
				db.dashboardInterface();
			}
		});

		JButton submit = new JButton("Submit");
		submit.setBounds(250, 580, 150, 40);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = nameField.getText();
				age = ageField.getText();
				address = addressField.getText();
				contact = contactField.getText();
				sex = sexField.getText();
				email = emailField.getText();
				
				if (emailField.getText().isEmpty() || nameField.getText().isEmpty() || ageField.getText().isEmpty()
						|| addressField.getText().isEmpty() || contactField.getText().isEmpty()
						|| sexField.getText().isEmpty()) {
					submit.setEnabled(false);
				} else {
					submit.setEnabled(true);
				}
				JOptionPane.showMessageDialog(null, "Submitted Successfully");
				dashboard db = new dashboard();
				db.dashboardInterface();
			}
		});
		setLayout(null);
		add(back);
		add(pat);
		add(nameField);
		add(ageField);
		add(addressField);
		add(contactField);
		add(sexField);
		add(emailField);
		add(submit);
		setSize(500, 690);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
class meds extends JFrame {

	void medsInterface() {
		setTitle("Hospital Management System");
		JLabel medicineList = new JLabel("Available Drugs and Medicine");
		medicineList.setBounds(150, 15, 210, 40);

		JLabel notice = new JLabel("Notice: Please refer to our pharmacist for the prices for non-OTC medicine");
		notice.setBounds(20, 50, 500, 40);

		JLabel othert = new JLabel("please give us the doctors prescription to prevent medicine misuse.");
		othert.setBounds(20, 65, 400, 40);

		JLabel noticeObgyn = new JLabel("Notice: Please refer to your obyn before buying contraception.");
		noticeObgyn.setBounds(20, 90, 500, 40);

		JLabel paracetamol = new JLabel("Paracetamol 500mg/Syrup/Suspension");
		paracetamol.setBounds(20, 130, 225, 40);

		JLabel antihistamine = new JLabel("Antihistamines 10/25mg");
		antihistamine.setBounds(20, 160, 225, 40);

		JLabel antacids = new JLabel("Antacids 40/250mg 10ml drops");
		antacids.setBounds(20, 190, 225, 40);

		JLabel hydrocortisoneCream = new JLabel("Hydrocortisone Cream 5/10/15g");
		hydrocortisoneCream.setBounds(20, 220, 225, 40);

		JLabel antisepticCream = new JLabel("Antiseptic Cream 50/100g");
		antisepticCream.setBounds(20, 250, 225, 40);

		JLabel antisepticSolution = new JLabel("Anti-Septic Solution 25/50ml");
		antisepticSolution.setBounds(20, 280, 225, 40);

		JLabel painKiller = new JLabel("Painkiller 60/120ml");
		painKiller.setBounds(20, 310, 225, 40);

		JLabel bandages = new JLabel("Bandages 4x6/4x10/3x5");
		bandages.setBounds(20, 340, 225, 40);

		JLabel loperamide = new JLabel("Loperamide 2mg only");
		loperamide.setBounds(20, 370, 225, 40);

		JLabel centrum = new JLabel("Centrum Silver Advance 30 Tablets");
		centrum.setBounds(20, 400, 225, 40);

		JLabel loratadine = new JLabel("Loratadine 10mg");
		loratadine.setBounds(20, 430, 225, 40);

		JLabel folicAcid = new JLabel("Folic Acid 300mg");
		folicAcid.setBounds(20, 460, 225, 40);

		JLabel eyedrops = new JLabel("EyeDrops 10m");
		eyedrops.setBounds(20, 490, 225, 40);

		JLabel hexylresorcinol = new JLabel("Hexylresorcinol 2.4 mg");
		hexylresorcinol.setBounds(20, 520, 225, 40);

		JButton ok = new JButton("OK");
		ok.setBounds(270, 580, 150, 40);

		JButton back = new JButton("Back");
		back.setBounds(50, 580, 150, 40);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dashboard db = new dashboard();
				db.dashboardInterface();
				dispose();
			}
		});
		setLayout(null);
		add(medicineList);
		add(notice);
		add(othert);
		add(noticeObgyn);
		add(paracetamol);
		add(antihistamine);
		add(antacids);
		add(hydrocortisoneCream);
		add(antisepticCream);
		add(antisepticSolution);
		add(painKiller);
		add(bandages);
		add(loperamide);
		add(centrum);
		add(loratadine);
		add(folicAcid);
		add(eyedrops);
		add(hexylresorcinol);
		add(back);
		setSize(500, 690);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

						

class system {
	public static void main(String[] args) {
		/*signin si = new signin();
		si.signinInterface();
		si.setVisible(true);*/
		branches bra = new branches();
		bra.brInterface();
	}
}