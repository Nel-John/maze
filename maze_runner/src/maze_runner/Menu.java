package maze_runner;

import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {
	JLabel lblOne;
	JLabel lblTwo;
	JLabel lblThree;
	JLabel lblFour;


	int burgrits = 0;
	int burgs = 0;
	int combo = 0;
	int addons = 0;

	float price;
	float BurgerSteakPrice = 0;
	float YumBurgerPrice=0;
	float ComboMealPrice=0;
	float AddonPrice=0;

	private float payment;
	private float change;
	private static float item1;
	private static float item2;
	private static float item3;
	private static float item4;
	private static float item5;
	private static float item6;
	private static float item7;

	private static float Total;




	JTextArea txtProductClicked1;
	JTextArea txtProductClicked2;
	JTextArea txtProductClicked3;
	JTextArea txtProductClicked4;
	JTextArea txtProductClicked5;
	JTextArea txtProductClicked6;
	JTextArea txtProductClicked7;

	JTextArea txtProductInput1;
	JTextArea txtProductInput2;
	JTextArea txtProductInput3;
	JTextArea txtProductInput4;
	JTextArea txtProductInput5;
	JTextArea txtProductInput6;
	JTextArea txtProductInput7;
	
	String convert;
	int item = 0;
	List<String> carted = new ArrayList<String>();
	JTextField textField;

	public void cartedItems(String c, int val,float price) throws IOException {
		carted.add(c);
		item = item + 1;
		System.out.println(carted);



		if(item == 1){
			txtProductClicked1.setText(carted.get(0));
			txtProductInput1.setText(val + "\n₱"+price);
			item1 = val*price;


		}
		else if(item == 2){
			txtProductClicked2.setText(carted.get(1));
			txtProductInput2.setText(val + "\n₱"+price);
			item2 = val*price;
		}
		else if(item == 3){
			txtProductClicked3.setText(carted.get(2));
			txtProductInput3.setText(val + "\n₱"+price);
			item3=val*price;
		}
		else if(item == 4){
			txtProductClicked4.setText(carted.get(3));
			txtProductInput4.setText(val + "\n₱"+price);
			item4=val*price;
		}
		else if (item == 5) {
			txtProductClicked5.setText(carted.get(4));
			txtProductInput5.setText(val + "\n ₱"+price);
			item5=val*price;

		}
		else if (item == 6) {
			txtProductClicked6.setText(carted.get(5));
			txtProductInput6.setText(val + "\n ₱"+price);
			item6=val*price;
		}
		else if (item == 7){
			txtProductClicked7.setText(carted.get(6));
			txtProductInput7.setText(val + "\n ₱"+price);
			item7=val*price;
		}
		else{
			JOptionPane.showMessageDialog(new JFrame(),"MAXIMUM OF 7 ORDERS ONLY!","ERROR",JOptionPane.INFORMATION_MESSAGE);
		}
		Total = item1+item2+item3+item4+item5+item6+item7;
		textField.setText(String.valueOf(" ₱"+Total));
	}



	public Menu() throws IOException {
		JFrame menu = new JFrame();
		menu.setResizable(false);
		menu.getContentPane().setBackground(Color.WHITE);
		menu.setBackground(Color.BLACK);
		menu.setBounds(10,10,1543,836);
		menu.getContentPane().setLayout(null);

        BufferedReader product = new BufferedReader(new FileReader("maze_runner/ProductIMG/Products"));
        List<String> product_list = new ArrayList<String>();
        try {
            String line = null;
            while (( line = product.readLine()) != null){
                product_list.add(line);
            }
        }

        catch (FileNotFoundException e) {
        }
        finally {
            product.close();
        }
        String[] product_array = product_list.toArray(new String[]{});

		String[]BurgerSteak ={"Burger Steak w/ Drink","2pcs Burger Steak w/ Drink","Burger steak w/ Shanghai","Burger Steak-Solo","2pcs Burger Steak-Solo","Burger Steak w/ fries"};
		String[]Burger={"YumBurger","YumBurger(cheese)","YumBurger(TLC)","Double Yumburger(TLC)","Aloha Burger","Bacon Burger"};
		String[]CMeal = {"Combo Meal 1","Combo Meal 2","Combo Meal 3", "Combo Meal 4","Combo Meal 5","Combo Meal 6"};
		String[]Addon={"Rice","Choco Float","Caramel Float","Iced Coffe","Coffee","Coke Float"};

		// MENU OPTIONS LBLS
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setOpaque(true);
		panel.setBounds(300, 36, 868, 718);
		menu.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblProduct1 = new JLabel("Product1");
		lblProduct1.setBackground(Color.ORANGE);
		lblProduct1.setOpaque(true);
		lblProduct1.setBounds(60, 30, 203, 280);
		lblProduct1.setVisible(false);
		panel.add(lblProduct1);
		
		JLabel lblProduct2 = new JLabel("Product2");

		lblProduct2.setBackground(Color.ORANGE);
		lblProduct2.setOpaque(true);
		lblProduct2.setBounds(337, 30, 203, 280);
		lblProduct2.setVisible(false);
		panel.add(lblProduct2);
		
		JLabel lblProduct3 = new JLabel("Product3");
		lblProduct3.setBackground(Color.ORANGE);
		lblProduct3.setOpaque(true);
		lblProduct3.setBounds(605, 30, 203, 280);
		lblProduct3.setVisible(false);
		panel.add(lblProduct3);
		
		JLabel lblProduct4 = new JLabel("Product4");
		lblProduct4.setBackground(Color.ORANGE);
		lblProduct4.setOpaque(true);
		lblProduct4.setBounds(60, 382, 203, 280);
		lblProduct4.setVisible(false);
		panel.add(lblProduct4);
		
		JLabel lblProduct5 = new JLabel("Product5");
		lblProduct5.setBackground(Color.ORANGE);
		lblProduct5.setOpaque(true);
		lblProduct5.setBounds(337, 382, 203, 280);
		lblProduct5.setVisible(false);
		panel.add(lblProduct5);
		
		JLabel lblProduct6 = new JLabel("Product6");
		lblProduct6.setBackground(Color.ORANGE);
		lblProduct6.setOpaque(true);
		lblProduct6.setBounds(605, 382, 203, 280);
		lblProduct6.setVisible(false);
		panel.add(lblProduct6);
		
		JTextArea txtrProduct1 = new JTextArea();
		txtrProduct1.setText("Product1");
		txtrProduct1.setBounds(70, 323, 193, 46);
		txtrProduct1.setVisible(false);
		panel.add(txtrProduct1);
		
		JTextArea txtrProduct2 = new JTextArea();
		txtrProduct2.setText("Product2");
		txtrProduct2.setBounds(347, 323, 193, 46);
		txtrProduct2.setVisible(false);
		panel.add(txtrProduct2);
		
		JTextArea txtrProduct3 = new JTextArea();
		txtrProduct3.setText("Product3");
		txtrProduct3.setBounds(615, 323, 193, 46);
		txtrProduct3.setVisible(false);
		panel.add(txtrProduct3);
		
		JTextArea txtrProduct4 = new JTextArea();
		txtrProduct4.setText("Product4");
		txtrProduct4.setBounds(60, 675, 193, 46);
		txtrProduct4.setVisible(false);
		panel.add(txtrProduct4);
		
		JTextArea txtrProduct5 = new JTextArea();
		txtrProduct5.setText("Product5");
		txtrProduct5.setBounds(347, 675, 193, 46);
		txtrProduct5.setVisible(false);
		panel.add(txtrProduct5);
		
		JTextArea txtrProduct6 = new JTextArea();
		txtrProduct6.setText("Product6");
		txtrProduct6.setBounds(615, 675, 193, 46);
		txtrProduct6.setVisible(false);
		panel.add(txtrProduct6);
		
		lblOne = new JLabel("New label");
		lblOne.setText(product_array[0]);
		lblOne.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblOne.setOpaque(true);
		lblOne.setForeground(new Color(0, 0, 0));
		lblOne.setBackground(new Color(255, 165, 0));
		lblOne.setBounds(38, 66, 274, 43);
		menu.getContentPane().add(lblOne);
		
		lblTwo = new JLabel("New label");
		lblTwo.setText(product_array[1]);
		lblTwo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTwo.setBackground(new Color(255, 165, 0));
		lblTwo.setOpaque(true);
		lblTwo.setForeground(new Color(0, 0, 0));
		lblTwo.setBounds(38, 139, 274, 43);
		menu.getContentPane().add(lblTwo);
		
		lblThree = new JLabel("New label");
		lblThree.setText(product_array[2]);
		lblThree.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblThree.setBackground(new Color(255, 165, 0));
		lblThree.setOpaque(true);
		lblThree.setForeground(new Color(0, 0, 0));
		lblThree.setBounds(38, 209, 274, 43);
		menu.getContentPane().add(lblThree);
		
		lblFour = new JLabel("New label");
		lblFour.setText(product_array[3]);
		lblFour.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFour.setBackground(new Color(255, 165, 0));
		lblFour.setOpaque(true);
		lblFour.setForeground(new Color(0, 0, 0));
		lblFour.setBounds(38, 277, 274, 43);
		menu.getContentPane().add(lblFour);


		
			txtProductClicked1 = new JTextArea();
			txtProductClicked1.setForeground(new Color(255, 255, 255));
			txtProductClicked1.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductClicked1.setBackground(new Color(139, 0, 0));
			txtProductClicked1.setEditable(false);
			txtProductClicked1.setBounds(1222, 94, 205, 52);
			txtProductClicked1.setVisible(true);
			menu.getContentPane().add(txtProductClicked1);
			
			txtProductClicked2 = new JTextArea();
			txtProductClicked2.setForeground(new Color(255, 255, 255));
			txtProductClicked2.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductClicked2.setBackground(new Color(139, 0, 0));
			txtProductClicked2.setEditable(false);
			txtProductClicked2.setBounds(1222, 159, 205, 52);
			txtProductClicked2.setVisible(true);
			menu.getContentPane().add(txtProductClicked2);
			
			txtProductClicked3 = new JTextArea();
			txtProductClicked3.setForeground(new Color(255, 255, 255));
			txtProductClicked3.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductClicked3.setBackground(new Color(139, 0, 0));
			txtProductClicked3.setEditable(false);
			txtProductClicked3.setBounds(1222, 224, 205, 52);
			txtProductClicked3.setVisible(true);
			menu.getContentPane().add(txtProductClicked3);
			
			
			txtProductClicked4 = new JTextArea();
			txtProductClicked4.setForeground(new Color(255, 255, 255));
			txtProductClicked4.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductClicked4.setBackground(new Color(139, 0, 0));
			txtProductClicked4.setEditable(false);
			txtProductClicked4.setBounds(1222, 289, 205, 52);
			txtProductClicked4.setVisible(true);
			menu.getContentPane().add(txtProductClicked4);
			
			txtProductClicked5 = new JTextArea();
			txtProductClicked5.setForeground(new Color(255, 255, 255));
			txtProductClicked5.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductClicked5.setBackground(new Color(139, 0, 0));
			txtProductClicked5.setEditable(false);
			txtProductClicked5.setBounds(1222, 354, 205, 52);
			txtProductClicked5.setVisible(true);
			menu.getContentPane().add(txtProductClicked5);
			
			txtProductClicked6 = new JTextArea();
			txtProductClicked6.setForeground(new Color(255, 255, 255));
			txtProductClicked6.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductClicked6.setBackground(new Color(139, 0, 0));
			txtProductClicked6.setEditable(false);
			txtProductClicked6.setBounds(1222, 419, 205, 52);
			txtProductClicked6.setVisible(true);
			menu.getContentPane().add(txtProductClicked6);
			
			txtProductClicked7 = new JTextArea();
			txtProductClicked7.setForeground(new Color(255, 255, 255));
			txtProductClicked7.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductClicked7.setBackground(new Color(139, 0, 0));
			txtProductClicked7.setEditable(false);
			txtProductClicked7.setBounds(1222, 484, 205, 52);
			txtProductClicked7.setVisible(true);
			menu.getContentPane().add(txtProductClicked7);
			
			
			txtProductInput1 = new JTextArea();
			txtProductInput1.setEditable(false);
			txtProductInput1.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductInput1.setForeground(new Color(255, 255, 255));
			txtProductInput1.setBackground(new Color(139, 0, 0));
			txtProductInput1.setBounds(1428, 94, 64, 52);
			menu.getContentPane().add(txtProductInput1);
			
			txtProductInput2 = new JTextArea();
			txtProductInput2.setEditable(false);
			txtProductInput2.setForeground(new Color(255, 255, 255));
			txtProductInput2.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductInput2.setBackground(new Color(139, 0, 0));
			txtProductInput2.setBounds(1428, 159, 64, 52);
			menu.getContentPane().add(txtProductInput2);

			txtProductInput3 = new JTextArea();
			txtProductInput3.setEditable(false);
			txtProductInput3.setForeground(new Color(255, 255, 255));
			txtProductInput3.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductInput3.setBackground(new Color(139, 0, 0));
			txtProductInput3.setBounds(1428, 221, 64, 52);
			menu.getContentPane().add(txtProductInput3);
			
			txtProductInput4 = new JTextArea();
			txtProductInput4.setEditable(false);
			txtProductInput4.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductInput4.setForeground(new Color(255, 255, 255));
			txtProductInput4.setBackground(new Color(139, 0, 0));
			txtProductInput4.setBounds(1428, 289, 64, 52);
			menu.getContentPane().add(txtProductInput4);
			
			txtProductInput5 = new JTextArea();
			txtProductInput5.setEditable(false);
			txtProductInput5.setForeground(new Color(255, 255, 255));
			txtProductInput5.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductInput5.setBackground(new Color(139, 0, 0));
			txtProductInput5.setBounds(1428, 354, 64, 52);
			menu.getContentPane().add(txtProductInput5);
			
			txtProductInput6 = new JTextArea();
			txtProductInput6.setEditable(false);
			txtProductInput6.setForeground(new Color(255, 255, 255));
			txtProductInput6.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductInput6.setBackground(new Color(139, 0, 0));
			txtProductInput6.setBounds(1428, 419, 64, 52);
			menu.getContentPane().add(txtProductInput6);
			
			txtProductInput7 = new JTextArea();
			txtProductInput7.setEditable(false);
			txtProductInput7.setForeground(new Color(255, 255, 255));
			txtProductInput7.setFont(new Font("Times New Roman", Font.BOLD, 17));
			txtProductInput7.setBackground(new Color(139, 0, 0));
			txtProductInput7.setBounds(1428, 484, 64, 52);
			menu.getContentPane().add(txtProductInput7);



		// BURGERSTEAK
		lblOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				burgrits=1;
				burgs=0;
				combo=0;
				addons=0;


				lblOne.setForeground(new Color(255, 255, 255));
				lblOne.setHorizontalAlignment(SwingConstants.CENTER);

				lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS1.png").getImage().getScaledInstance(lblProduct1.getWidth(),lblProduct1.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct2.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS2.png").getImage().getScaledInstance(lblProduct2.getWidth(),lblProduct2.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct3.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS3.png").getImage().getScaledInstance(lblProduct3.getWidth(),lblProduct3.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct4.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS4.png").getImage().getScaledInstance(lblProduct4.getWidth(),lblProduct4.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct5.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS5.png").getImage().getScaledInstance(lblProduct5.getWidth(),lblProduct5.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct6.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS6.png").getImage().getScaledInstance(lblProduct6.getWidth(),lblProduct6.getHeight(),Image.SCALE_SMOOTH)));

				lblProduct1.setVisible(true);
				lblProduct2.setVisible(true);
				lblProduct3.setVisible(true);
				lblProduct4.setVisible(true);
				lblProduct5.setVisible(true);
				lblProduct6.setVisible(true);

				txtrProduct1.setVisible(true);
				txtrProduct2.setVisible(true);
				txtrProduct3.setVisible(true);
				txtrProduct4.setVisible(true);
				txtrProduct5.setVisible(true);
				txtrProduct6.setVisible(true);

				txtrProduct1.setText(BurgerSteak[0]);
				txtrProduct1.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct2.setText(BurgerSteak[1]);
				txtrProduct2.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct3.setText(BurgerSteak[2]);
				txtrProduct3.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct4.setText(BurgerSteak[3]);
				txtrProduct4.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct5.setText(BurgerSteak[4]);
				txtrProduct5.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct6.setText(BurgerSteak[5]);
				txtrProduct6.setFont(new Font("Times New Roman", Font.BOLD, 18));


				lblTwo.setForeground(new Color(0, 0, 0));
				lblTwo.setHorizontalAlignment(SwingConstants.LEADING);

				lblThree.setForeground(new Color(0, 0, 0));
				lblThree.setHorizontalAlignment(SwingConstants.LEADING);

				lblFour.setForeground(new Color(0, 0, 0));
				lblFour.setHorizontalAlignment(SwingConstants.LEADING);
			}

		});

		// BURGER
		lblTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				burgs=1;
				burgrits=0;
				combo=0;
				addons=0;


				lblTwo.setForeground(new Color(255, 255, 255));
				lblTwo.setHorizontalAlignment(SwingConstants.CENTER);

				lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger1.png").getImage().getScaledInstance(lblProduct1.getWidth(),lblProduct1.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct2.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger2.png").getImage().getScaledInstance(lblProduct2.getWidth(),lblProduct2.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct3.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger3.png").getImage().getScaledInstance(lblProduct3.getWidth(),lblProduct3.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct4.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger4.png").getImage().getScaledInstance(lblProduct4.getWidth(),lblProduct4.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct5.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger5.png").getImage().getScaledInstance(lblProduct5.getWidth(),lblProduct5.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct6.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger6.png").getImage().getScaledInstance(lblProduct6.getWidth(),lblProduct6.getHeight(),Image.SCALE_SMOOTH)));

				lblProduct1.setVisible(true);
				lblProduct2.setVisible(true);
				lblProduct3.setVisible(true);
				lblProduct4.setVisible(true);
				lblProduct5.setVisible(true);
				lblProduct6.setVisible(true);

				txtrProduct1.setVisible(true);
				txtrProduct2.setVisible(true);
				txtrProduct3.setVisible(true);
				txtrProduct4.setVisible(true);
				txtrProduct5.setVisible(true);
				txtrProduct6.setVisible(true);

				txtrProduct1.setText(Burger[0]);
				txtrProduct1.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct2.setText(Burger[1]);
				txtrProduct2.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct3.setText(Burger[2]);
				txtrProduct3.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct4.setText(Burger[3]);
				txtrProduct4.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct5.setText(Burger[4]);
				txtrProduct5.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct6.setText(Burger[5]);
				txtrProduct6.setFont(new Font("Times New Roman", Font.BOLD, 18));



				lblOne.setForeground(new Color(0, 0, 0));
				lblOne.setHorizontalAlignment(SwingConstants.LEADING);

				lblThree.setForeground(new Color(0, 0, 0));
				lblThree.setHorizontalAlignment(SwingConstants.LEADING);

				lblFour.setForeground(new Color(0, 0, 0));
				lblFour.setHorizontalAlignment(SwingConstants.LEADING);

			}
		});

		//CMEAL
		lblThree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				combo=1;
				burgrits=0;
				burgs=0;
				addons=0;

				lblThree.setForeground(new Color(255, 255, 255));
				lblThree.setHorizontalAlignment(SwingConstants.CENTER);

				lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C1.png").getImage().getScaledInstance(lblProduct1.getWidth(),lblProduct1.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct2.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C2.png").getImage().getScaledInstance(lblProduct2.getWidth(),lblProduct2.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct3.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C3.png").getImage().getScaledInstance(lblProduct3.getWidth(),lblProduct3.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct4.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C4.png").getImage().getScaledInstance(lblProduct4.getWidth(),lblProduct4.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct5.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C5.png").getImage().getScaledInstance(lblProduct5.getWidth(),lblProduct5.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct6.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C6.png").getImage().getScaledInstance(lblProduct6.getWidth(),lblProduct6.getHeight(),Image.SCALE_SMOOTH)));

				lblProduct1.setVisible(true);
				lblProduct2.setVisible(true);
				lblProduct3.setVisible(true);
				lblProduct4.setVisible(true);
				lblProduct5.setVisible(true);
				lblProduct6.setVisible(true);

				txtrProduct1.setVisible(true);
				txtrProduct2.setVisible(true);
				txtrProduct3.setVisible(true);
				txtrProduct4.setVisible(true);
				txtrProduct5.setVisible(true);
				txtrProduct6.setVisible(true);

				txtrProduct1.setText(CMeal[0]);
				txtrProduct1.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct2.setText(CMeal[1]);
				txtrProduct2.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct3.setText(CMeal[2]);
				txtrProduct3.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct4.setText(CMeal[3]);
				txtrProduct4.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct5.setText(CMeal[4]);
				txtrProduct5.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct6.setText(CMeal[5]);
				txtrProduct6.setFont(new Font("Times New Roman", Font.BOLD, 18));


				lblOne.setForeground(new Color(0, 0, 0));
				lblOne.setHorizontalAlignment(SwingConstants.LEADING);

				lblTwo.setForeground(new Color(0, 0, 0));
				lblTwo.setHorizontalAlignment(SwingConstants.LEADING);

				lblFour.setForeground(new Color(0, 0, 0));
				lblFour.setHorizontalAlignment(SwingConstants.LEADING);



			}

		});



		lblFour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				addons=1;
				burgs=0;
				burgrits=0;
				combo=0;


				lblFour.setForeground(new Color(255, 255, 255));
				lblFour.setHorizontalAlignment(SwingConstants.CENTER);

				lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A1.png").getImage().getScaledInstance(lblProduct1.getWidth(),lblProduct1.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct2.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A2.png").getImage().getScaledInstance(lblProduct2.getWidth(),lblProduct2.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct3.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A3.png").getImage().getScaledInstance(lblProduct3.getWidth(),lblProduct3.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct4.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A4.png").getImage().getScaledInstance(lblProduct4.getWidth(),lblProduct4.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct5.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A5.png").getImage().getScaledInstance(lblProduct5.getWidth(),lblProduct5.getHeight(),Image.SCALE_SMOOTH)));
				lblProduct6.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A6.png").getImage().getScaledInstance(lblProduct6.getWidth(),lblProduct6.getHeight(),Image.SCALE_SMOOTH)));

				lblProduct1.setVisible(true);
				lblProduct2.setVisible(true);
				lblProduct3.setVisible(true);
				lblProduct4.setVisible(true);
				lblProduct5.setVisible(true);
				lblProduct6.setVisible(true);

				txtrProduct1.setVisible(true);
				txtrProduct2.setVisible(true);
				txtrProduct3.setVisible(true);
				txtrProduct4.setVisible(true);
				txtrProduct5.setVisible(true);
				txtrProduct6.setVisible(true);

				txtrProduct1.setText(Addon[0]);
				txtrProduct1.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct2.setText(Addon[1]);
				txtrProduct2.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct3.setText(Addon[2]);
				txtrProduct3.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct4.setText(Addon[3]);
				txtrProduct4.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct5.setText(Addon[4]);
				txtrProduct5.setFont(new Font("Times New Roman", Font.BOLD, 18));
				txtrProduct6.setText(Addon[5]);
				txtrProduct6.setFont(new Font("Times New Roman", Font.BOLD, 18));

				lblOne.setForeground(new Color(0, 0, 0));
				lblOne.setHorizontalAlignment(SwingConstants.LEADING);

				lblTwo.setForeground(new Color(0, 0, 0));
				lblTwo.setHorizontalAlignment(SwingConstants.LEADING);

				lblThree.setForeground(new Color(0, 0, 0));
				lblThree.setHorizontalAlignment(SwingConstants.LEADING);

			}
		});


		
		String checker="";
		List<Float> BurgerSteakList = new ArrayList<Float>();
		List<Float> BurgerList = new ArrayList<Float>();
		List<Float> ComboList = new ArrayList<Float>();
		List<Float> AddList = new ArrayList<Float>();

		BufferedReader br = new BufferedReader(new FileReader("maze_runner/ProductIMG/BurgerSteak/BurgerSteak.txt"));
		while ((checker = br.readLine()) != null) {
			String[] split = checker.split("\\s");
			BurgerSteakList.add(Float.parseFloat(split[0]));
		}
		System.out.println(BurgerSteakList);

		BufferedReader b = new BufferedReader(new FileReader("maze_runner/ProductIMG/Burger/Burger.txt"));
		while ((checker = b.readLine()) != null) {
			String[] split = checker.split("\\s");
			BurgerList.add(Float.parseFloat(split[0]));
		}
		System.out.println(BurgerList);

		BufferedReader cm= new BufferedReader(new FileReader("maze_runner/ProductIMG/Combo Meal/CMeal.txt"));
		while ((checker = cm.readLine()) != null) {
			String[] split = checker.split("\\s");
			ComboList.add(Float.parseFloat(split[0]));
		}
		System.out.println(ComboList);

		BufferedReader addon= new BufferedReader(new FileReader("maze_runner/ProductIMG/Add-On/Add-On.txt"));
		while ((checker = addon.readLine()) != null) {
			String[] split = checker.split("\\s");
			AddList.add(Float.parseFloat(split[0]));
		}
		System.out.println(AddList);
		
		
		

		lblProduct1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(burgrits == 1){
					try {
						cartedItems(BurgerSteak[0],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerSteakList.get(0));
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
				else if(burgs == 1){
					try {
						cartedItems(Burger[0],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerList.get(0));
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
				else if(combo == 1){
					try {
						cartedItems(CMeal[0],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),ComboList.get(0));
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
				else if(addons == 1){
					try {
						cartedItems(Addon[0],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),AddList.get(0));
					} catch (IOException ex) {
						ex.printStackTrace();
					}
					;
				}


			}
		});

		lblProduct2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(burgrits == 1){
					try {
						cartedItems(BurgerSteak[1],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerSteakList.get(1));
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
				else if(burgs == 1){
					try {
						cartedItems(Burger[1],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerList.get(1));
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
				else if(combo == 1){
					try {
						cartedItems(CMeal[1],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),ComboList.get(1));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(addons == 1){
					try {
						cartedItems(Addon[1],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),AddList.get(1));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
			}
		});

		lblProduct3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(burgrits == 1){
					try {
						cartedItems(BurgerSteak[2],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerSteakList.get(2));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(burgs == 1){
					try {
						cartedItems(Burger[2],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerList.get(2));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(combo == 1){
					try {
						cartedItems(CMeal[2],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),ComboList.get(2));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(addons == 1){
					try {
						cartedItems(Addon[2],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),AddList.get(2));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
			}
		});

		lblProduct4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(burgrits == 1){
					try {
						cartedItems(BurgerSteak[3],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerSteakList.get(3));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(burgs == 1){
					try {
						cartedItems(Burger[3],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerList.get(3));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(combo == 1){
					try {
						cartedItems(CMeal[3],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),ComboList.get(3));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(addons == 1){
					try {
						cartedItems(Addon[3],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),AddList.get(3));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}

			}
		});

		lblProduct5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(burgrits == 1){
					try {
						cartedItems(BurgerSteak[4],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerSteakList.get(4));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(burgs == 1){
					try {
						cartedItems(Burger[4],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)), BurgerSteakList.get(4));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(combo == 1){
					try {
						cartedItems(CMeal[4],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),ComboList.get(4));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(addons == 1){
					try {
						cartedItems(Addon[4],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),AddList.get(4));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
			}
		});

		lblProduct6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(burgrits == 1){
					try {
						cartedItems(BurgerSteak[5],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerSteakList.get(5));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(burgs == 1){
					try {
						cartedItems(Burger[5],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),BurgerList.get(5));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(combo == 1){
					try {
						cartedItems(CMeal[5],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),ComboList.get(5));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				else if(addons == 1){
					try {
						cartedItems(Addon[5],Integer.parseInt(convert=JOptionPane.showInputDialog(new JFrame(),"ENTER QUANTITY:","QUANTITY",JOptionPane.INFORMATION_MESSAGE)),AddList.get(5));
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
			}
		});



		JButton CheckStocks = new JButton("CHECK STOCKS");
		CheckStocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new Stocks();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		CheckStocks.setBounds(88, 484, 135, 52);
		menu.getContentPane().add(CheckStocks);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(88, 549, 135, 52);
		menu.getContentPane().add(btnUpdate);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = JOptionPane.showInputDialog(new JFrame(), "ENTER PRODUCT CATERGORY:", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
				if (search.equalsIgnoreCase(product_array[0])) {
					String search1 = JOptionPane.showInputDialog(new JFrame(), "CATEGORY: BURGER STEAK \n ENTER PRODUCT NAME:", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
					if (search1.equalsIgnoreCase(BurgerSteak[0])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS1.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(BurgerSteak[0]);

						try {
							cartedItems(BurgerSteak[0], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerSteakList.get(0));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(BurgerSteak[1])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS2.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(BurgerSteak[1]);

						try {
							cartedItems(BurgerSteak[1], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerSteakList.get(1));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(BurgerSteak[2])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS3.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(BurgerSteak[2]);

						try {
							cartedItems(BurgerSteak[2], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerSteakList.get(2));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(BurgerSteak[3])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS4.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(BurgerSteak[3]);

						try {
							cartedItems(BurgerSteak[3], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerSteakList.get(3));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(BurgerSteak[4])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS5.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(BurgerSteak[4]);

						try {
							cartedItems(BurgerSteak[4], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerSteakList.get(4));
						} catch (IOException ex) {
							ex.printStackTrace();
						}

					} else if (search1.equalsIgnoreCase(BurgerSteak[5])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS6.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(BurgerSteak[5]);

						try {
							cartedItems(BurgerSteak[5], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerSteakList.get(5));
						} catch (IOException ex) {
							ex.printStackTrace();
						}

					}


				} else if (search.toUpperCase().equals(product_array[1])) {
					String search1 = JOptionPane.showInputDialog(new JFrame(), "CATEGORY: BURGER \n ENTER PRODUCT NAME:", JOptionPane.INFORMATION_MESSAGE);
					if (search1.equalsIgnoreCase(Burger[0])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger1.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Burger[0]);

						try {
							cartedItems(Burger[0], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerList.get(0));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(Burger[1])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger2.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Burger[1]);

						try {
							cartedItems(Burger[1], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerList.get(1));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(Burger[2])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger3.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Burger[2]);

						try {
							cartedItems(Burger[2], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerList.get(2));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(Burger[3])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger4.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Burger[3]);

						try {
							cartedItems(Burger[3], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerList.get(3));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(Burger[4])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger5.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Burger[4]);

						try {
							cartedItems(Burger[4], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerList.get(4));
						} catch (IOException ex) {
							ex.printStackTrace();
						}

					} else if (search1.equalsIgnoreCase(Burger[5])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger6.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Burger[5]);

						try {
							cartedItems(Burger[5], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), BurgerList.get(5));
						} catch (IOException ex) {
							ex.printStackTrace();
						}

					}

				} else if (search.equalsIgnoreCase(product_array[2])) {
					String search1 = JOptionPane.showInputDialog(new JFrame(), "CATEGORY: COMBO MEALS \n ENTER PRODUCT NAME::", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
					if (search1.equalsIgnoreCase(CMeal[0])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C1.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(CMeal[0]);

						try {
							cartedItems(CMeal[0], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), ComboList.get(0));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(CMeal[1])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C2.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(CMeal[1]);

						try {
							cartedItems(CMeal[1], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), ComboList.get(1));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(CMeal[2])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C3.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(CMeal[2]);

						try {
							cartedItems(CMeal[2], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), ComboList.get(2));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(CMeal[3])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C4.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(CMeal[3]);

						try {
							cartedItems(CMeal[3], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), ComboList.get(3));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(CMeal[4])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C5.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(CMeal[4]);

						try {
							cartedItems(CMeal[4], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), ComboList.get(4));
						} catch (IOException ex) {
							ex.printStackTrace();
						}

					} else if (search1.equalsIgnoreCase(CMeal[5])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C6.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(CMeal[5]);

						try {
							cartedItems(CMeal[5], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), ComboList.get(5));
						} catch (IOException ex) {
							ex.printStackTrace();
						}

					}
				} else if (search.equalsIgnoreCase(product_array[3])) {
					String search1 = JOptionPane.showInputDialog(new JFrame(), "CATEGORY: ADD-ON \n ENTER PRODUCT NAME::", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
					if (search1.equalsIgnoreCase(Addon[0])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A1.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Addon[0]);

						try {
							cartedItems(Addon[0], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), AddList.get(0));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(Addon[1])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A2.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Addon[1]);

						try {
							cartedItems(Addon[1], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), AddList.get(1));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(Addon[2])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A3.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Addon[2]);

						try {
							cartedItems(Addon[2], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), AddList.get(2));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(Addon[3])) {
						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A4.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Addon[3]);

						try {
							cartedItems(Addon[3], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), AddList.get(3));
						} catch (IOException ex) {
							ex.printStackTrace();
						}


					} else if (search1.equalsIgnoreCase(Addon[4])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A5.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Addon[4]);

						try {
							cartedItems(Addon[4], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), AddList.get(4));
						} catch (IOException ex) {
							ex.printStackTrace();
						}

					} else if (search1.equalsIgnoreCase(Addon[5])) {

						lblProduct2.setVisible(false);
						lblProduct3.setVisible(false);
						lblProduct4.setVisible(false);
						lblProduct5.setVisible(false);
						lblProduct6.setVisible(false);

						txtrProduct2.setVisible(false);
						txtrProduct3.setVisible(false);
						txtrProduct4.setVisible(false);
						txtrProduct5.setVisible(false);
						txtrProduct6.setVisible(false);

						lblProduct1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A6.png").getImage().getScaledInstance(lblProduct1.getWidth(), lblProduct1.getHeight(), Image.SCALE_SMOOTH)));
						txtrProduct1.setText(Addon[5]);

						try {
							cartedItems(Addon[5], Integer.parseInt(convert = JOptionPane.showInputDialog(new JFrame(), "ENTER QUANTITY:", "QUANTITY", JOptionPane.INFORMATION_MESSAGE)), AddList.get(5));
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				else{
					JOptionPane.showMessageDialog(new JFrame(),"CATEGORY NOT FOUND","NOTICE",JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnSearch.setBounds(88, 614, 135, 52);
		menu.getContentPane().add(btnSearch);
		
		textField = new JTextField();
		textField.setBackground(new Color(139, 0, 0));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField.setForeground(new Color(255, 255, 255));
		textField.setColumns(10);
		textField.setBounds(1363, 600, 150, 52);
		textField.setVisible(true);
		menu.getContentPane().add(textField);
		
		JButton button = new JButton("LOGOUT");
		button.setBounds(88, 679, 135, 52);
		menu.getContentPane().add(button);
		
			
		JLabel lblMenu = new JLabel();
		lblMenu.setBounds(1180, 36, 333, 551);
		lblMenu.setIcon(new ImageIcon(new ImageIcon("maze_runner/BGIMAGE/Menu/Menu1.png").getImage().getScaledInstance(lblMenu.getWidth(),lblMenu.getHeight(),Image.SCALE_SMOOTH)));
		menu.getContentPane().add(lblMenu);
		
		JLabel lblTotal = new JLabel();
		lblTotal.setBounds(1180, 600, 333, 55);
		lblTotal.setIcon(new ImageIcon(new ImageIcon("maze_runner/BGIMAGE/Menu/Total1.png").getImage().getScaledInstance(lblTotal.getWidth(),lblTotal.getHeight(),Image.SCALE_SMOOTH)));
		menu.getContentPane().add(lblTotal);
		
		JLabel lblCheckout = new JLabel();
		lblCheckout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int confirm;
				confirm=JOptionPane.showConfirmDialog(new JFrame(),"WOULD YOU LIKE TO CHECK OUT?","CONFIRM",JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.YES_OPTION){
					payment=Float.parseFloat(JOptionPane.showInputDialog(new JFrame(),"Enter Amout:","PAYMENT",JOptionPane.INFORMATION_MESSAGE));
					if(payment<0){
						JOptionPane.showMessageDialog(new JFrame(),"INVALID INPUT!","ERROR",JOptionPane.ERROR_MESSAGE);
					}
					else{
						change = payment-Total;
						if(change <0){
							JOptionPane.showMessageDialog(new JFrame(),"INVALID INPUT!","NOTICE",JOptionPane.ERROR_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(new JFrame(), "TOTAL CHANGE:" + change, "CHANGE", JOptionPane.INFORMATION_MESSAGE);
							int confirm1 = JOptionPane.showConfirmDialog(new JFrame(), "WOULD YOU LIKE TO HAVE A COPY OF YOUR RECEIPT?", "CONFIRM", JOptionPane.INFORMATION_MESSAGE);
							if (confirm1 == JOptionPane.YES_OPTION) {
								//new Receipt();
							}
						}
					}
				}

				
			}
		});
		lblCheckout.setBounds(1180, 676, 333, 78);
		lblCheckout.setIcon(new ImageIcon(new ImageIcon("maze_runner/BGIMAGE/Menu/Checkout1.png").getImage().getScaledInstance(lblCheckout.getWidth(),lblCheckout.getHeight(),Image.SCALE_SMOOTH)));
		menu.getContentPane().add(lblCheckout);
		
		JLabel lblCompany = new JLabel();
		lblCompany.setBounds(12, 333, 266, 120);
		lblCompany.setIcon(new ImageIcon(new ImageIcon("maze_runner/BGIMAGE/Menu/Company1.png").getImage().getScaledInstance(lblCompany.getWidth(),lblCompany.getHeight(),Image.SCALE_SMOOTH)));
		menu.getContentPane().add(lblCompany);
		
		JLabel lblBG = new JLabel("");
		lblBG.setOpaque(true);
		lblBG.setForeground(Color.BLACK);
		lblBG.setBackground(new Color(139, 0, 0));
		lblBG.setBounds(0, 0, 1533, 789);
		menu.getContentPane().add(lblBG);
		

		menu.setVisible(true);
		
	}


	public static void main(String[] args) throws IOException {
		new Menu();

	}
}
