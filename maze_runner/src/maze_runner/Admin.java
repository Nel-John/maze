package maze_runner;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import maze_runner.Menu;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class  Admin {

	JTable accountsTable = new JTable();
	DefaultTableModel accountsTableModel = new DefaultTableModel();

	Boolean isRemoving = false;

	public Admin(){
		JFrame Admin = new JFrame();
		JFrame Accounts = new JFrame();
		Admin.setBounds(10,10,1539,784);
		Admin.getContentPane().setLayout(null);


		JScrollPane pane = new JScrollPane(accountsTable);
		pane.setBounds(313, 57, 895, 582);
		pane.setVisible(true);
		Admin.getContentPane().add(pane);

		Object[]columns = {"USERNAME","PASSWORD","ACCOUNT TYPE"};
		accountsTableModel.setColumnIdentifiers(columns);

		accountsTable.setModel(accountsTableModel);

		accountsTable.setBackground(Color.white);
		accountsTable.setRowHeight(30);
		accountsTable.setAutoCreateRowSorter(true);
		Object[] rows = new Object[3];
		String checker="";
		List<String> test = new ArrayList<String>();
		List<String> user = new ArrayList<String>();
		List<String> password = new ArrayList<String>();
		List<String> type = new ArrayList<String>();

		accountsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				setListListener();
			}
		});

		String[] accountType = {"Counter", "Admin"};

		JTextField newUsername = new JTextField();
		JPasswordField newPassword = new JPasswordField();
		JComboBox newAccountType = new JComboBox(accountType);

		JButton btnAdd = new JButton("ADD");
		JButton btnCancel = new JButton("CANCEL");
		JButton btnRemove = new JButton("REMOVE");


		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				Object[] form = {
						"Username:", newUsername,
						"Password:", newPassword,
						"Account:", newAccountType,
				};

				int option = JOptionPane.showConfirmDialog(null, form, "Add Account", JOptionPane.OK_CANCEL_OPTION);

				if (option == JOptionPane.OK_OPTION) {
					try {
						if (!newUsername.getText().isEmpty() && newPassword.getPassword().length != 0) {
							Path path = Paths.get("DBAccounts/accounts.txt");
							ArrayList<String> file = new ArrayList<String>(Files.readAllLines(path, StandardCharsets.UTF_8));
							String data = newUsername.getText() + " " + String.valueOf(newPassword.getPassword()) + " " + newAccountType.getSelectedItem();

							file.add(data);
							Files.write(path, file, StandardCharsets.UTF_8);
							setAccountTable();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnAdd.setBounds(894, 652, 123, 52);
		btnAdd.setVisible(false);
		Admin.getContentPane().add(btnAdd);

		// BUTTON CANCEL
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {

				isRemoving = false;

				btnRemove.setVisible(true);
				btnAdd.setVisible(true);
				btnCancel.setVisible(false);
			}
		});
		btnCancel.setBounds(1029, 652, 123, 52);
		btnCancel.setVisible(false);
		Admin.getContentPane().add(btnCancel);

		// BUTTON REMOVE
		btnRemove.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				JOptionPane.showMessageDialog(null, "Just Click a Row on The Table to Delete an Account");
				isRemoving = true;

				btnAdd.setVisible(false);
				btnRemove.setVisible(false);
				btnCancel.setVisible(true);
			}
		});
		btnRemove.setBounds(1029, 652, 123, 52);
		btnRemove.setVisible(false);
		Admin.getContentPane().add(btnRemove);




		JButton btnInvent = new JButton("INVENT");
		btnInvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnInvent.setBounds(178, 251, 123, 52);
		Admin.getContentPane().add(btnInvent);

		JButton btnSales = new JButton("SALES");
		btnSales.setBounds(178, 57, 123, 52);
		Admin.getContentPane().add(btnSales);

		JButton btnAccounts = new JButton("ACCOUNTS");
		btnAccounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAccountTable();

				btnAdd.setVisible(true);
				btnRemove.setVisible(true);
			}
		});
		btnAccounts.setBounds(178, 122, 123, 52);
		Admin.getContentPane().add(btnAccounts);



		JButton btnProceed = new JButton("MENU");
		btnProceed.setBounds(178, 310, 123, 52);
		Admin.getContentPane().add(btnProceed);
		JLabel lblBG = new JLabel();
		lblBG.setBounds(0, 0, 1521, 737);
		lblBG.setIcon(new ImageIcon(new ImageIcon("BGIMAGE/Admin/AdminBg.png").getImage().getScaledInstance(lblBG.getWidth(),lblBG.getHeight(), Image.SCALE_SMOOTH)));
		lblBG.setVisible(true);
		Admin.getContentPane().add(lblBG);

		Admin.setVisible(true);
	}

	public void setAccountTable() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("DBAccounts/accounts.txt"));

			Object[] tableLines = br.lines().toArray();

			// Removing Data From Table
			for (int i = accountsTableModel.getRowCount() - 1; i >= 0; i-- ) {
				accountsTableModel.removeRow(i);
			}

			// Adding Data To Table
			for (int i = 0; i < tableLines.length; i++) {
				String line = tableLines[i].toString().trim();
				String[] dataRow = line.split("\\s");
				accountsTableModel.addRow(dataRow);

				accountsTable.setModel(accountsTableModel);
			}
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

	public void setListListener() {
		String[] accountType = {"Counter", "Admin"};

		JTextField newUsername = new JTextField();
		JPasswordField newPassword = new JPasswordField();
		JComboBox newAccountType = new JComboBox(accountType);

		JTextField openPassword = new JTextField();

			if (!isRemoving) {
				Vector item = accountsTableModel.getDataVector().elementAt(accountsTable.getSelectedRow());
				ArrayList<String> array = new ArrayList<>(item);

				newUsername.setText(array.get(0));
				openPassword.setText(array.get(1));
				newAccountType.setSelectedItem(array.get(2));

				Object[] form = {
						"Username:", newUsername,
						"Password:", openPassword,
						"Account:", newAccountType,
				};

				int option = JOptionPane.showConfirmDialog(null, form, "Add Account", JOptionPane.OK_CANCEL_OPTION);

				if (option == JOptionPane.OK_OPTION) {
					try {
						if (!newUsername.getText().isEmpty() && !openPassword.getText().isEmpty()) {
							Path path = Paths.get("DBAccounts/accounts.txt");
							ArrayList<String> file = new ArrayList<String>(Files.readAllLines(path, StandardCharsets.UTF_8));
							String data = newUsername.getText() + " " + openPassword.getText() + " " + newAccountType.getSelectedItem();

							for (int i = 0; i < file.size();i++) {
								if (i == accountsTable.getSelectedRow()) {
									file.set(i, data);
								}
							}

							Files.write(path, file, StandardCharsets.UTF_8);
							setAccountTable();
						}
					} catch (IOException exception) {
						exception.printStackTrace();
					}
				}
			} else {
				int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this account?", "Delete Account", JOptionPane.YES_NO_OPTION);

				if (option == JOptionPane.YES_OPTION) {
					try {
						Path path = Paths.get("DBAccounts/accounts.txt");
						ArrayList<String> file = new ArrayList<String>(Files.readAllLines(path, StandardCharsets.UTF_8));
						ArrayList<String> newFile = new ArrayList<String>();

						for (int i = 0; i < file.size();i++) {
							if (i != accountsTable.getSelectedRow()) {
								newFile.add(file.get(i));
							}
						}

						Files.write(path, newFile, StandardCharsets.UTF_8);
						setAccountTable();
					} catch (IOException exception) {
						exception.printStackTrace();
					}
				}
			}
	}

	public static void main(String[] args) {
		new Admin();
	}
}
