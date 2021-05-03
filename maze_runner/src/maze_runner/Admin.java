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
		pane.setVisible(true);
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

		

			

		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(894, 652, 123, 52);
		btnAdd.setVisible(false);
		Admin.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("REMOVE");
		btnRemove.setBounds(1029, 652, 123, 52);
		btnRemove.setVisible(false);
		Admin.getContentPane().add(btnRemove);
		

		int commit=0;
		
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
	public static void main(String[] args) {
		new Admin();
	}
}
