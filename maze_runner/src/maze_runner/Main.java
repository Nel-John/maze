package maze_runner;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame{
	
	JTextField txtField;
	private JPasswordField txtpasswordField;
	String user;
	String pass;
	String counter = "testme";
	String counterpw="please";



	public Main() {

		JFrame Main = new JFrame();
		Main.setTitle("LOGIN\r\n");
		Main.setBounds(10,10,1569,827);
		Main.setLocationRelativeTo(null);
		Main.getContentPane().setLayout(null);

		txtField = new JTextField(8);
		txtField.setHorizontalAlignment(SwingConstants.CENTER);
		txtField.setFont(new Font("Times New Roman", Font.PLAIN, 17));

		txtField.setBounds(570, 279, 415, 73);
		txtField.setColumns(10);
		Main.getContentPane().add(txtField);
		



		txtpasswordField = new JPasswordField();
		txtpasswordField.setHorizontalAlignment(SwingConstants.CENTER);
		txtpasswordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pass=String.valueOf(txtpasswordField.getPassword());
			}
		});

		txtpasswordField.setBounds(570, 435, 415, 73);
		Main.getContentPane().add(txtpasswordField);
		
		JLabel lblUserName = new JLabel("USERNAME");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblUserName.setBounds(716, 216, 129, 50);
		Main.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblPassword.setBounds(716, 372, 129, 50);
		Main.getContentPane().add(lblPassword);
		
		

		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnLogin.setBounds(716, 521, 129, 39);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user = txtField.getText();
				pass = String.valueOf(txtpasswordField.getPassword());
				String checker="";
				try {
					BufferedReader br = new BufferedReader(new FileReader("DBAccounts/accounts.txt"));
					while ((checker = br.readLine())!=null) {
						String[] split = checker.split("\\s");
						if(user.equals(split[0]) && pass.equals(split[1])){
							if(split[2].equals("Admin")) {
								JOptionPane.showMessageDialog(new JFrame(),"LOGIN SUCCESSFUL, WELCOME ADMIN","SUCCES",JOptionPane.INFORMATION_MESSAGE);
								new Menu();
								Main.setVisible(false);
								break;
							}
							else {
								JOptionPane.showMessageDialog(new JFrame(),"LOGIN SUCCESSFUL","SUCCES",JOptionPane.INFORMATION_MESSAGE);
								new Menu();
								Main.setVisible(false);
								break;

							}
						}
						else {
							JOptionPane.showMessageDialog(new JFrame(),"ACCOUNT DOES NOT EXIST","ERROR",JOptionPane.ERROR_MESSAGE);
							break;
						}
						
					}
				
				} catch (IOException e) {
					
				}	
			}
		});
		Main.getContentPane().add(btnLogin);
		Main.setVisible(true);
	}
	public static void main(String[] args) {
		new Main();

	}
}
