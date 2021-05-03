package maze_runner;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import maze_runner.Menu;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Admin {

	public Admin(){
		JTable table = new JTable();
		JFrame Admin = new JFrame();
		JFrame Accounts = new JFrame();
		Admin.setBounds(10,10,1539,784);
		Admin.getContentPane().setLayout(null);


		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(313, 57, 895, 582);
		pane.setVisible(false);
		Admin.getContentPane().add(pane);

		Object[]columns = {"USERNAME","PASSWORD","ACCOUNT TYPE"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);

		table.setModel(model);

		table.setBackground(Color.white);
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		Object[] rows = new Object[3];
		String checker="";
		List<String> test = new ArrayList<String>();
		List<String> user = new ArrayList<String>();
		List<String> password = new ArrayList<String>();
		List<String> type = new ArrayList<String>();

		

			





		
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEdit.setBounds(509, 652, 123, 52);
		Admin.getContentPane().add(btnEdit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setBounds(644, 652, 123, 52);
		Admin.getContentPane().add(btnUpdate);
		
		JButton btnSales = new JButton("SALES");
		btnSales.setBounds(779, 652, 123, 52);
		Admin.getContentPane().add(btnSales);
		
		JButton btnAccounts = new JButton("ACCOUNTS");
		btnAccounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pane.setVisible(true);
			}
		});
		btnAccounts.setBounds(914, 652, 123, 52);
		Admin.getContentPane().add(btnAccounts);
		
		JButton btnProceed = new JButton("PROCEED");
		btnProceed.setBounds(1049, 652, 123, 52);
		Admin.getContentPane().add(btnProceed);
		
		JLabel lblBG = new JLabel();
		lblBG.setBounds(0, 0, 1521, 737);
		lblBG.setIcon(new ImageIcon(new ImageIcon("BGIMAGE/Admin/AdminBg.png").getImage().getScaledInstance(lblBG.getWidth(),lblBG.getHeight(), Image.SCALE_SMOOTH)));
		lblBG.setVisible(true);

		Admin.getContentPane().add(lblBG);
		
		
		
		
		
		
		Admin.setVisible(true);
		
	
	}
	public static void main(String[] args) {
		new Admin();
	}
}
