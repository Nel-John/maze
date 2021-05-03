package maze_runner;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Stocks {
	
	int BurgerSteak =0;
	int Burger = 0;
	int ComboMeal=0;
	int Addon = 0;

	int selectedLine = 0;

	int counter1 = 0;
	int counter2 = 0;
	int counter3=0;
	int counter4=0;
	int counter5=0;
	int counter6=0;

	String temp;
	String temp1;
	ArrayList<String> burgerSteakArray;
	ArrayList<String> burgerArray;
	ArrayList<String> addOnArray;
	ArrayList<String> comboMealArray;
	ArrayList<String> burgerSteakNameArray;
	ArrayList<String> burgerNameArray;
	ArrayList<String> addOnNameArray;
	ArrayList<String> comboMealNameArray;

	String productName = "Product Name:";
	String productPrice= "Product Price:";
	String productStock= "Product Stock:";
	String productInformation= "Product Information:";


	public Stocks() throws IOException {
		JFrame Stocks = new JFrame();
		Stocks.setBounds(10,10,1393,781);
		Stocks.getContentPane().setLayout(null);

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

		JButton btnEdit = new JButton("EDIT PRODUCT");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.setBounds(863, 599, 132, 50);
		Stocks.getContentPane().add(btnEdit);

		JButton btnUpdate = new JButton("UPDATE STOCK");
		btnUpdate.setBounds(1007, 599, 132, 50);
		Stocks.getContentPane().add(btnUpdate);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(1150, 599, 132, 50);
		Stocks.getContentPane().add(cancelButton);

		JLabel lbl2 = new JLabel();
		lbl2.setBounds(291, 13, 236, 295);
		Stocks.getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel();
		lbl3.setBounds(581, 13, 236, 295);
		Stocks.getContentPane().add(lbl3);

		JLabel lbl4 = new JLabel();
		lbl4.setBounds(12, 426, 236, 295);
		Stocks.getContentPane().add(lbl4);

		JLabel lbl5 = new JLabel();
		lbl5.setBounds(291, 426, 236, 295);
		Stocks.getContentPane().add(lbl5);

		JLabel lbl6 = new JLabel();
		lbl6.setBounds(581, 426, 236, 295);
		Stocks.getContentPane().add(lbl6);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(863, 13, 419, 284);
		Stocks.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel img = new JLabel();
		img.setBounds(94, 13, 247, 184);
		panel.add(img);
		
		JLabel lblName = new JLabel("");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBackground(new Color(255, 255, 255));
		lblName.setBounds(12, 210, 395, 61);
		panel.add(lblName);

		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea.setEditable(false);
		textArea.setBackground(new Color(139, 0, 0));
		textArea.setBounds(863, 324, 419, 127);
		Stocks.getContentPane().add(textArea);

		JLabel lbl1 = new JLabel();

		lbl1.setBounds(12, 13, 236, 295);
		Stocks.getContentPane().add(lbl1);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 20));

		comboBox.addItem(product_array[0]);
		comboBox.addItem(product_array[1]);
		comboBox.addItem(product_array[2]);
		comboBox.addItem(product_array[3]);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals(product_array[0])){

					BurgerSteak =1;
					Burger = 0;
					ComboMeal=0;
					Addon=0;

					lbl1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(), Image.SCALE_SMOOTH)));
					lbl2.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));
					lbl3.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));
					lbl4.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));
					lbl5.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));
					lbl6.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));
				}
				else if(comboBox.getSelectedItem().equals(product_array[1])){
					BurgerSteak =0;
					Burger = 1;
					ComboMeal=0;
					Addon=0;

					lbl1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(),Image.SCALE_SMOOTH)));
					lbl2.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));
					lbl3.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));
					lbl4.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));
					lbl5.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));
					lbl6.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));


				}
				else if(comboBox.getSelectedItem().equals(product_array[2])){
					BurgerSteak =0;
					Burger = 0;
					ComboMeal=1;
					Addon=0;

					lbl1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(),Image.SCALE_SMOOTH)));
					lbl2.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));
					lbl3.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));
					lbl4.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));
					lbl5.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));
					lbl6.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));

				}
				else if(comboBox.getSelectedItem().equals(product_array[3])){
					BurgerSteak =0;
					Burger = 0;
					ComboMeal=0;
					Addon=1;

					lbl1.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(),Image.SCALE_SMOOTH)));
					lbl2.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));
					lbl3.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));
					lbl4.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));
					lbl5.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));
					lbl6.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));

				}
			}
		});
		comboBox.setBounds(863, 464, 419, 50);
		Stocks.getContentPane().add(comboBox);

		lbl1.addMouseListener(new MouseAdapter() {
								  @Override
								  public void mouseClicked(MouseEvent e) {
									  if (BurgerSteak == 1) {
									  		counter1=1;
										  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS1.png").getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH)));
										  //txtName.set
										  // Copy Paste mo to pre.
										  // Yung selectedLine base yan sa number ng lbl mo (dito 1 kasi lbl1)
										  // Tapos palitan mo lang yung burgerSteakArray depender sa Category nya, nasa taas yung mga variables na yan
										  // Palitan mo din Path name
										  // Start
										  selectedLine = 1;
										  try {
											  burgerSteakNameArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteakName");
											  burgerSteakArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteak.txt");
											  String[] split = burgerSteakArray.get(0).split("\\s");
											  String join = String.join("\n", split);
											  String pname = burgerSteakNameArray.get(0);
											  lblName.setText(pname);
											  textArea.setEditable(true);
											  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
											  temp = split[0];
											  temp1= split[1];
										  } catch (IOException ioException) {
											  ioException.printStackTrace();
										  }

									  } else if (Burger == 1) {
									  	counter1 = 1;
										  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger1.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

										  selectedLine = 1;
										  try {
											  burgerNameArray = fileArray("maze_runner/ProductIMG/Burger/BurgerName");
											  burgerArray = fileArray("maze_runner/ProductIMG/Burger/Burger.txt");
											  String[] split = burgerArray.get(0).split("\\s");
											  //String join = String.join("\n", split);
											  String pname = burgerNameArray.get(0);
											  lblName.setText(pname);
											  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
											  temp = split[0];
											  temp1= split[1];
										  } catch (IOException ioException) {
											  ioException.printStackTrace();
										  }

									  } else if (ComboMeal == 1) {
									  	counter1=1;
										  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C1.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

										  selectedLine = 1;
										  try {
											  comboMealNameArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMealName");
											  comboMealArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMeal.txt");
											  String[] split = comboMealArray.get(0).split("\\s");
											  //String join = String.join("\n", split);
											  String pname = comboMealNameArray.get(0);
											  lblName.setText(pname);
											  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
											  temp = split[0];
											  temp1= split[1];
										  } catch (IOException ioException) {
											  ioException.printStackTrace();
										  }

									  } else if (Addon == 1) {
									  	counter1=1;
										  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A1.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));


										  selectedLine = 1;
										  try {
											  addOnNameArray = fileArray("maze_runner/ProductIMG/Add-On/AddOnName");
											  addOnArray = fileArray("maze_runner/ProductIMG/Add-On/Add-On.txt");
											  String[] split = addOnArray.get(0).split("\\s");
											  //String join = String.join("\n", split);
											  String pname = addOnNameArray.get(0);
											  lblName.setText(pname);
											  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
											  temp = split[0];
											  temp1= split[1];
										  } catch (IOException ioException) {
											  ioException.printStackTrace();
										  }

									  }
								  }
							  });

				lbl2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked (MouseEvent e){
					if (BurgerSteak == 1) {
						counter2=1;
						img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS2.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

						// Copy Paste mo to pre.
						// Yung selectedLine base yan sa number ng lbl mo (dito 1 kasi lbl1)
						// Tapos palitan mo lang yung burgerSteakArray depender sa Category nya, nasa taas yung mga variables na yan
						// Palitan mo din Path name
						// Start
						selectedLine = 2;
						try {
							burgerSteakNameArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteakName");
							burgerSteakArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteak.txt");
							String[] split = burgerSteakArray.get(1).split("\\s");
							//String join = String.join("\n", split);
							String pname = burgerSteakNameArray.get(1);
							lblName.setText(pname);
							textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
							temp = split[0];
							temp1= split[1];
						} catch (IOException ioException) {
							ioException.printStackTrace();
						}

					} else if (Burger == 1) {
						counter2=1;
						img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger2.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

						selectedLine = 2;
						try {
							burgerNameArray = fileArray("maze_runner/ProductIMG/Burger/BurgerName");
							burgerArray = fileArray("maze_runner/ProductIMG/Burger/Burger.txt");
							String[] split = burgerArray.get(1).split("\\s");
							//String join = String.join("\n", split);
							String pname = burgerNameArray.get(1);
							lblName.setText(pname);
							textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
							temp = split[0];
							temp1= split[1];
						} catch (IOException ioException) {
							ioException.printStackTrace();
						}

					} else if (ComboMeal == 1) {
						counter2=1;
						img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C2.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

						selectedLine = 2;
						try {
							comboMealNameArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMealName");
							comboMealArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMeal.txt");
							String[] split = comboMealArray.get(1).split("\\s");
							//String join = String.join("\n", split);
							String pname = comboMealNameArray.get(1);
							lblName.setText(pname);
							textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
							temp = split[0];
							temp1= split[1];
						} catch (IOException ioException) {
							ioException.printStackTrace();
						}

					} else if (Addon == 1) {
						counter2=1;
						img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A2.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));


						selectedLine = 2;
						try {
							addOnNameArray = fileArray("maze_runner/ProductIMG/Add-On/AddOnName");
							addOnArray = fileArray("maze_runner/ProductIMG/Add-On/Add-On.txt");
							String[] split = addOnArray.get(1).split("\\s");
							//String join = String.join("\n", split);
							String pname = addOnNameArray.get(1);
							lblName.setText(pname);
							textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
							temp = split[0];
							temp1= split[1];
						} catch (IOException ioException) {
							ioException.printStackTrace();
						}

					}
				}
			});

				lbl3.addMouseListener(new MouseAdapter() {
										  @Override
										  public void mouseClicked(MouseEvent e) {
											  if (BurgerSteak == 1) {
											  	counter3=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS3.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  // Copy Paste mo to pre.
												  // Yung selectedLine base yan sa number ng lbl mo (dito 1 kasi lbl1)
												  // Tapos palitan mo lang yung burgerSteakArray depender sa Category nya, nasa taas yung mga variables na yan
												  // Palitan mo din Path name
												  // Start
												  selectedLine = 3;
												  try {
													  burgerSteakNameArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteakName");
													  burgerSteakArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteak.txt");
													  String[] split = burgerSteakArray.get(2).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = burgerSteakNameArray.get(2);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (Burger == 1) {
											  	counter3=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger3.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  selectedLine = 3;
												  try {
													  burgerNameArray = fileArray("maze_runner/ProductIMG/Burger/BurgerName");
													  burgerArray = fileArray("maze_runner/ProductIMG/Burger/Burger.txt");
													  String[] split = burgerArray.get(2).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = burgerNameArray.get(2);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (ComboMeal == 1) {
											  	counter3=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C3.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  selectedLine = 3;
												  try {
													  comboMealNameArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMealName");
													  comboMealArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMeal.txt");
													  String[] split = comboMealArray.get(2).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = comboMealNameArray.get(2);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (Addon == 1) {
											  	counter3=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A3.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));


												  selectedLine = 3;
												  try {
													  addOnNameArray = fileArray("maze_runner/ProductIMG/Add-On/AddOnName");
													  addOnArray = fileArray("maze_runner/ProductIMG/Add-On/Add-On.txt");
													  String[] split = addOnArray.get(2).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = addOnNameArray.get(2);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  }
										  }
									  });

				lbl4.addMouseListener(new MouseAdapter() {
										  @Override
										  public void mouseClicked(MouseEvent e) {
											  if (BurgerSteak == 1) {
											  	counter4=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS4.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  // Copy Paste mo to pre.
												  // Yung selectedLine base yan sa number ng lbl mo (dito 1 kasi lbl1)
												  // Tapos palitan mo lang yung burgerSteakArray depender sa Category nya, nasa taas yung mga variables na yan
												  // Palitan mo din Path name
												  // Start
												  selectedLine = 4;
												  try {
													  burgerSteakNameArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteakName");
													  burgerSteakArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteak.txt");
													  String[] split = burgerSteakArray.get(3).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = burgerSteakNameArray.get(3);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (Burger == 1) {
											  	counter4=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger4.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  selectedLine = 4;
												  try {
													  burgerNameArray = fileArray("maze_runner/ProductIMG/Burger/BurgerName");
													  burgerArray = fileArray("maze_runner/ProductIMG/Burger/Burger.txt");
													  String[] split = burgerArray.get(3).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = burgerNameArray.get(3);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (ComboMeal == 1) {
											  	counter4=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C4.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  selectedLine = 4;
												  try {
													  comboMealNameArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMealName");
													  comboMealArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMeal.txt");
													  String[] split = comboMealArray.get(3).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = comboMealNameArray.get(3);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (Addon == 1) {
											  	counter4=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A4.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));


												  selectedLine = 4;
												  try {
													  addOnNameArray = fileArray("maze_runner/ProductIMG/Add-On/AddOnName");
													  addOnArray = fileArray("maze_runner/ProductIMG/Add-On/Add-On.txt");
													  String[] split = addOnArray.get(3).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = addOnNameArray.get(3);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  }
										  }
									  });

				lbl5.addMouseListener(new MouseAdapter() {
										  @Override
										  public void mouseClicked(MouseEvent e) {
											  if (BurgerSteak == 1) {
											  	counter5=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS5.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  // Copy Paste mo to pre.
												  // Yung selectedLine base yan sa number ng lbl mo (dito 1 kasi lbl1)
												  // Tapos palitan mo lang yung burgerSteakArray depender sa Category nya, nasa taas yung mga variables na yan
												  // Palitan mo din Path name
												  // Start
												  selectedLine = 5;
												  try {
													  burgerSteakNameArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteakName");
													  burgerSteakArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteak.txt");
													  String[] split = burgerSteakArray.get(4).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = burgerSteakNameArray.get(4);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (Burger == 1) {
											  	counter5=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger5.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  selectedLine = 5;
												  try {
													  burgerNameArray = fileArray("maze_runner/ProductIMG/Burger/BurgerName");
													  burgerArray = fileArray("maze_runner/ProductIMG/Burger/Burger.txt");
													  String[] split = burgerArray.get(4).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = burgerNameArray.get(4);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (ComboMeal == 1) {
											  	counter5=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C5.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  selectedLine = 5;
												  try {
													  comboMealNameArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMealName");
													  comboMealArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMeal.txt");
													  String[] split = comboMealArray.get(4).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = comboMealNameArray.get(4);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (Addon == 1) {
											  	counter5=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A5.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));


												  selectedLine = 5;
												  try {
													  addOnNameArray = fileArray("maze_runner/ProductIMG/Add-On/AddOnName");
													  addOnArray = fileArray("maze_runner/ProductIMG/Add-On/Add-On.txt");
													  String[] split = addOnArray.get(4).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = addOnNameArray.get(4);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  }
										  }
									  });

				lbl6.addMouseListener(new MouseAdapter() {
										  @Override
										  public void mouseClicked(MouseEvent e) {
										  	counter6=1;
											  if (BurgerSteak == 1) {
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/BurgerSteak/BS6.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  // Copy Paste mo to pre.
												  // Yung selectedLine base yan sa number ng lbl mo (dito 1 kasi lbl1)
												  // Tapos palitan mo lang yung burgerSteakArray depender sa Category nya, nasa taas yung mga variables na yan
												  // Palitan mo din Path name
												  // Start
												  selectedLine = 6;
												  try {
													  burgerSteakNameArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteakName");
													  burgerSteakArray = fileArray("maze_runner/ProductIMG/BurgerSteak/BurgerSteak.txt");
													  String[] split = burgerSteakArray.get(5).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = burgerSteakNameArray.get(5);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (Burger == 1) {
											  	counter6=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Burger/burger6.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  selectedLine = 6;
												  try {
													  burgerNameArray = fileArray("maze_runner/ProductIMG/Burger/BurgerName");
													  burgerArray = fileArray("maze_runner/ProductIMG/Burger/Burger.txt");
													  String[] split = burgerArray.get(5).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = burgerNameArray.get(5);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (ComboMeal == 1) {
											  	counter6=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Combo Meal/C6.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));

												  selectedLine = 6;
												  try {
													  comboMealNameArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMealName");
													  comboMealArray = fileArray("maze_runner/ProductIMG/Combo Meal/CMeal.txt");
													  String[] split = comboMealArray.get(5).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = comboMealNameArray.get(5);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  } else if (Addon == 1) {
											  	counter6=1;
												  img.setIcon(new ImageIcon(new ImageIcon("maze_runner/ProductIMG/Add-On/A6.png").getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH)));


												  selectedLine = 6;
												  try {
													  addOnNameArray = fileArray("maze_runner/ProductIMG/Add-On/AddOnName");
													  addOnArray = fileArray("maze_runner/ProductIMG/Add-On/Add-On.txt");
													  String[] split = addOnArray.get(6).split("\\s");
													  //String join = String.join("\n", split);
													  String pname = addOnNameArray.get(6);
													  lblName.setText(pname);
													  textArea.setText(productName + pname + "\n" + productPrice + "₱" + split[0] + "\n" + productStock + split[1] + "\n" + productInformation);
													  temp = split[0];
													  temp1= split[1];
												  } catch (IOException ioException) {
													  ioException.printStackTrace();
												  }

											  }
										  }
									  });


				JLabel lblBG = new JLabel();
		lblBG.setBounds(0, 0, 1375, 734);
		lblBG.setIcon(new ImageIcon(new ImageIcon("maze_runner/BGIMAGE/Stocks/testBG.png").getImage().getScaledInstance(lblBG.getWidth(),lblBG.getHeight(), Image.SCALE_SMOOTH)));
		Stocks.getContentPane().add(lblBG);

		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.print("Cancel");
				Stocks.setVisible(false);
			}
		});

		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				String choice = JOptionPane.showInputDialog(new JFrame(),"PRICE OR INVENT","NOTICE!",JOptionPane.INFORMATION_MESSAGE);
				if(choice.equalsIgnoreCase("price")){
					temp="";
					String in = JOptionPane.showInputDialog(new JFrame(),"ENTER NEW PRICE:","NOTICE!",JOptionPane.INFORMATION_MESSAGE);
					temp=in;
					String[] input ={temp,temp1};
					String joined = String.join(" ", input[0]);
					String join = String.join(" ",input[1]);
					try {
						writeFile(joined+" "+join);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(choice.equalsIgnoreCase("invent")){
					temp1="";
					String in = JOptionPane.showInputDialog(new JFrame(),"ENTER NEW INVENT:","NOTICE!",JOptionPane.INFORMATION_MESSAGE);
					temp1=in;
					String[] input ={temp,temp1};
					String joined = String.join(" ", input[0]);
					String join = String.join(" ",input[1]);
					try {
						writeFile(joined+" "+join);
					} catch (IOException e) {
						e.printStackTrace();
					}

				}





			}
		});


		Stocks.setVisible(true);
	}

	public static ArrayList<String> fileArray(String filename) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader(filename));
		ArrayList<String> array = new ArrayList<String>();
		String line;

		while ((line = file.readLine()) != null) {
			array.add(line);
		}

		return array;
	}

	public void writeFile(String content) throws IOException {
		ArrayList<String> fileContent;
		Path path = null;

		if (Burger == 1) {
			path = Paths.get("maze_runner/ProductIMG/Burger/Burger.txt") ;
		}
		if (Addon == 1) {
			path = Paths.get("maze_runner/ProductIMG/Add-ON/Add-On.txt");
		}
		if (BurgerSteak == 1) {
			path = Paths.get("maze_runner/ProductIMG/BurgerSteak/BurgerSteak.txt");
		}
		if (ComboMeal == 1) {
			path = Paths.get("maze_runner/ProductIMG/Combo Meal/CMeal.txt");
		}

		fileContent = new ArrayList<String>(Files.readAllLines(path));

		for (int i = 0; i < fileContent.size();i++) {
			if (i == selectedLine - 1) {
				fileContent.set(i, content);
			}
		}

		Files.write(path, fileContent, StandardCharsets.UTF_8);
		System.out.println(path);

	}


	public static void main(String[] args) throws IOException {
		new Stocks();

	}
}
