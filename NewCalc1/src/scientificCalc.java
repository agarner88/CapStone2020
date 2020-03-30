
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;


//import org.eclipse.example.calc.BinaryOperation;
//import org.eclipse.example.calc.internal.operations.Equals;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class scientificCalc {

	private JFrame frmAshlysScientificCalculator;
	private JTextField textDisplay1;


	//variables used in basic arithmetic 
	double firstnum;
	double secondnum;
	double result;
	
	String operations;
	String answer;
	ScientificCalcOperations scientificCalcOperations= new ScientificCalcOperations();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientificCalc window = new scientificCalc();
					window.frmAshlysScientificCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public scientificCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAshlysScientificCalculator = new JFrame();
		frmAshlysScientificCalculator.getContentPane().setBackground(new Color(0, 0, 0));
		frmAshlysScientificCalculator.setBackground(new Color(0, 0, 0));
		frmAshlysScientificCalculator.getContentPane().setForeground(new Color(0, 0, 0));
		frmAshlysScientificCalculator.setForeground(new Color(139, 0, 139));
		frmAshlysScientificCalculator.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frmAshlysScientificCalculator.setTitle("Ashly's  Calculator");
		frmAshlysScientificCalculator.setBounds(100, 100, 291, 447);
		frmAshlysScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 255));
		frmAshlysScientificCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setForeground(new Color(0, 0, 205));
		menuBar.add(mnFile);
		//sets up the standard drop down option for calculator
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmAshlysScientificCalculator.setTitle("Ashly's Calculator");
				frmAshlysScientificCalculator.setBounds(100, 100, 275, 367);
				textDisplay1.setBounds(10, 11, 243, 37);
			}
		});
		mnFile.add(mntmStandard);
		
		//sets up the Scientific drop down option for calculator
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmAshlysScientificCalculator.setTitle("Scientific Calculator");
				frmAshlysScientificCalculator.setBounds(100, 100, 525, 367);
				textDisplay1.setBounds(10, 11, 494, 37);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		mnFile.add(mntmExit);
		frmAshlysScientificCalculator.getContentPane().setLayout(null);
		//Sets the calculator display and colors
		textDisplay1 = new JTextField();
		textDisplay1.setBackground(new Color(0, 0, 0));
		textDisplay1.setSelectedTextColor(new Color(152, 251, 152));
		textDisplay1.setSelectionColor(new Color(220, 20, 60));
		textDisplay1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textDisplay1.setForeground(SystemColor.textHighlight);
		textDisplay1.setBounds(10, 9, 258, 39);
		frmAshlysScientificCalculator.getContentPane().add(textDisplay1);
		textDisplay1.setColumns(10);
		
		//Sets backspace function
		JButton btnUfe = new JButton("\u2190");
		btnUfe.setBackground(new Color(0, 0, 0));
		btnUfe.setForeground(Color.MAGENTA);
		btnUfe.setFont(new Font("Arial", Font.BOLD, 11));
		btnUfe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(textDisplay1.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textDisplay1.getText());
					strB.deleteCharAt(textDisplay1.getText().length()- 1);
					backspace = strB.toString();
					textDisplay1.setText(backspace);
					
			
			}
		}
		});
		btnUfe.setName("");
		btnUfe.setBounds(10, 48, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnUfe);
		
		//Sets the calculator button for 7, adds color, and function action
		JButton btn_7 = new JButton("7");
		btn_7.setBackground(new Color(0, 0, 0));
		btn_7.setForeground(Color.MAGENTA);
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = textDisplay1.getText() + btn_7.getText();
				textDisplay1.setText(iNum);
				
			}
		});
		//sets button size and font
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_7.setBounds(10, 97, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn_7);
		
		//Sets the calculator button for 4, adds color, and function action
		JButton btn_4 = new JButton("4");
		btn_4.setBackground(new Color(0, 0, 0));
		btn_4.setForeground(Color.MAGENTA);
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = textDisplay1.getText() + btn_4.getText();
				textDisplay1.setText(iNum);
			}
		});
		//sets button size and font
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_4.setBounds(10, 146, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn_4);
		
		//Sets the calculator button for 1, adds color, and function action
		JButton btn_1 = new JButton("1");
		btn_1.setBackground(new Color(0, 0, 0));
		btn_1.setForeground(Color.MAGENTA);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = textDisplay1.getText() + btn_1.getText();
				textDisplay1.setText(iNum);
		
			}
		});
		
		//sets button size and font
		btn_1.setFont(new Font("Tahoma", Font.BOLD,14));
		btn_1.setBounds(10, 195, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn_1);
		
		//Sets the calculator button for clear entry, adds color, and function action
		JButton btnCe = new JButton("CE");
		btnCe.setBackground(new Color(0, 0, 0));
		btnCe.setForeground(Color.MAGENTA);
		btnCe.setFont(new Font("Arial", Font.BOLD, 8));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			      textDisplay1.setText("0");
				
				
			}
		});
		
		//sets button size and font
		btnCe.setBounds(58, 48, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnCe);
		
		//Sets the calculator button for clear, adds color, and function action
		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(0, 0, 0));
		btnC.setForeground(Color.MAGENTA);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textDisplay1.setText("0");	
		
				
			}
		});
		
		//sets button size and font
		btnC.setFont(new Font ("Tahoma", Font.BOLD, 14));
		btnC.setBounds(106, 48, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnC);
		
		//Sets the calculator button for ops, adds color, and function action
		JButton btnPM_3 = new JButton("\u00B1");
		btnPM_3.setBackground(new Color(0, 0, 0));
		btnPM_3.setForeground(Color.MAGENTA);
		btnPM_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = ops * (-1);
				textDisplay1.setText(String.valueOf(ops));
				
			}
		});
		
		//sets button size and font
		btnPM_3.setFont(new Font ("Tahoma", Font.PLAIN, 14));
		btnPM_3.setBounds(154, 48, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnPM_3);
		
		//Sets the calculator button for square root operation, adds color, and function action
		JButton btnSq_4 = new JButton("\u221A");
		btnSq_4.setBackground(new Color(0, 0, 0));
		btnSq_4.setForeground(Color.MAGENTA);
		btnSq_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				//ops = Math.sqrt(ops);
				ops = scientificCalcOperations.squareRoot(ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		
		//sets button size and font
		btnSq_4.setFont(new Font ("Tahoma", Font.BOLD, 14));
		btnSq_4.setBounds(212, 48, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnSq_4);
		
		//Sets the calculator button for 8, adds color, and function action
		JButton btn_8 = new JButton("8");
		btn_8.setBackground(new Color(0, 0, 0));
		btn_8.setForeground(Color.MAGENTA);
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = textDisplay1.getText() + btn_8.getText();
				textDisplay1.setText(iNum);
			}
		});
		
		//sets button size and font
		btn_8.setFont(new Font ("Tahoma", Font.BOLD, 14));
		btn_8.setBounds(58, 97, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn_8);
		
		//Sets the calculator button for 5, adds color, and function action
		JButton btn_5 = new JButton("5");
		btn_5.setBackground(new Color(0, 0, 0));
		btn_5.setForeground(Color.MAGENTA);
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = textDisplay1.getText() + btn_5.getText();
				textDisplay1.setText(iNum);
			}
		});
		
		//sets button size and font
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_5.setBounds(58, 146, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn_5);
		
		//Sets the calculator button for 2, adds color, and function action
		JButton btn_2 = new JButton("2");
		btn_2.setBackground(new Color(0, 0, 0));
		btn_2.setForeground(Color.MAGENTA);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = textDisplay1.getText() + btn_2.getText();
				textDisplay1.setText(iNum);
			}
		});
		
		//sets button size and font
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_2.setBounds(58, 195, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn_2);
		
		//Sets the calculator button for 0, adds color, and function action
		JButton btn_0 = new JButton("0");
		btn_0.setBackground(new Color(0, 0, 0));
		btn_0.setForeground(Color.MAGENTA);
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = textDisplay1.getText() + btn_0.getText();
				textDisplay1.setText(iNum);
				
			}
		});
		
		//sets button size and font
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_0.setBounds(10, 244, 94, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn_0);
		
		//Sets the calculator button for 9, adds color, and function action
		JButton btn_9 = new JButton("9");
		btn_9.setBackground(new Color(0, 0, 0));
		btn_9.setForeground(Color.MAGENTA);
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = textDisplay1.getText() + btn_9.getText();
				textDisplay1.setText(iNum);
			}
		});
		
		//sets button size and font
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_9.setBounds(106, 97, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn_9);
		
		//Sets the calculator button for 6 , adds color, and function action
		JButton btn_6 = new JButton("6");
		btn_6.setBackground(new Color(0, 0, 0));
		btn_6.setForeground(Color.MAGENTA);
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = textDisplay1.getText() + btn_6.getText();
				textDisplay1.setText(iNum);
						}
		});
		
		//sets button size and font
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_6.setBounds(106, 146, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn_6);
		
		//Sets the calculator button for 3 , adds color, and function action
		JButton btn_3 = new JButton("3");
		btn_3.setBackground(new Color(0, 0, 0));
		btn_3.setForeground(Color.MAGENTA);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = textDisplay1.getText() + btn_3.getText();
				textDisplay1.setText(iNum);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_3.setBounds(106, 195, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn_3);
		
		//Sets the calculator button for the decimal point , adds color, and function action
		JButton Button_12 = new JButton(".");
		Button_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		Button_12.setBackground(new Color(0, 0, 0));
		Button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textDisplay1.setText(textDisplay1.getText()+ Button_12.getText());
				
			}
		});
		Button_12.setForeground(Color.MAGENTA);
		Button_12.setBounds(106, 244, 46, 47);
		frmAshlysScientificCalculator.getContentPane().add(Button_12);
		
		//Sets the calculator button for the divide symbol , adds color, and function action
		JButton btnDiv_13 = new JButton("/");
		btnDiv_13.setBackground(new Color(0, 0, 0));
		btnDiv_13.setForeground(Color.MAGENTA);
		btnDiv_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay1.getText());
				textDisplay1.setText("");
				operations = "/";
			}
		});
		btnDiv_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDiv_13.setBounds(154, 97, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnDiv_13);
		
		//Sets the calculator button for the multiply symbol , adds color, and function action
		JButton btnMult_14 = new JButton("*");
		btnMult_14.setBackground(new Color(0, 0, 0));
		btnMult_14.setForeground(Color.MAGENTA);
		btnMult_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay1.getText());
				textDisplay1.setText("");
				operations = "*";
			}
		});
		btnMult_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMult_14.setBounds(154, 146, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnMult_14);
		
		//Sets the calculator button for the subtraction symbol , adds color, and function action
		JButton btnSub_15 = new JButton("\u2014");
		btnSub_15.setBackground(new Color(0, 0, 0));
		btnSub_15.setForeground(Color.MAGENTA);
		btnSub_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay1.getText());
				textDisplay1.setText("");
				operations = "-";
			}
		});
		
		btnSub_15.setFont(new Font("Arial", Font.BOLD, 14));
		btnSub_15.setBounds(154, 195, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnSub_15);
		
		//Sets the calculator button for the addition symbol , adds color, and function action
		JButton btnAdd_16 = new JButton("+");
		btnAdd_16.setBackground(new Color(0, 0, 0));
		btnAdd_16.setForeground(Color.MAGENTA);
		btnAdd_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay1.getText());
				textDisplay1.setText("");
				operations = "+";
				
			}
		});
		btnAdd_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd_16.setBounds(154, 244, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnAdd_16);
		
		//Sets the calculator button for the equal symbol, adds color, and function action
		JButton Button_17 = new JButton("=");
		Button_17.setBackground(new Color(0, 0, 0));
		Button_17.setFont(new Font("Arial", Font.BOLD, 13));
		Button_17.setForeground(Color.MAGENTA);
		Button_17.addActionListener(new ActionListener() {
			
			//Sets the calculator action function for standard operations 
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textDisplay1.getText());
				if (operations == "+")
				{
					//result = firstnum + secondnum;
					result = scientificCalcOperations.addition(firstnum, secondnum);
					answer = String.format("%.2f", result);
					textDisplay1.setText(answer);
				}
				
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textDisplay1.setText(answer);
			}
				else if (operations == "*")
				{

					result = scientificCalcOperations.multiply(firstnum, secondnum);
					answer = String.format("%.2f", result);
					textDisplay1.setText(answer);
					
				}
				
				else if (operations.equals("Mod"))
				{

					result = scientificCalcOperations.modulo(firstnum, secondnum);
					answer = String.format("%.2f", result);
					textDisplay1.setText(answer);
				
			}

				
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textDisplay1.setText(answer);
					
				}		
				}			
		});
		
	
		Button_17.setBounds(213, 195, 55, 96);
		frmAshlysScientificCalculator.getContentPane().add(Button_17);
		
		//Sets the calculator button for the  reciprocal symbol, adds color, and function action
		JButton button_19 = new JButton("1/X");
		button_19.setBackground(new Color(0, 0, 0));
		button_19.setForeground(Color.MAGENTA);
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = (1 /ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		
		
		button_19.setBounds(212, 146, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(button_19);
		
		
		//Sets the calculator button for the percentage symbol, adds color, and function action
		JButton btnPerc_18 = new JButton("%");
		btnPerc_18.setBackground(new Color(0, 0, 0));
		btnPerc_18.setForeground(Color.MAGENTA);
		btnPerc_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondnum = Double.parseDouble(textDisplay1.getText());
				
			//	textDisplay1.setText(textDisplay1.getText()+"%");
//				operations = "%";
				secondnum = firstnum * (secondnum/100.0);	
				textDisplay1.setText(secondnum + "");
			}
		});
		
		btnPerc_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPerc_18.setBounds(212, 97, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnPerc_18);
		
		//Sets the calculator button for the Logarithm symbol, adds color, and function action
		JButton btnLog_19_1 = new JButton("Log");
		btnLog_19_1.setBackground(new Color(0, 0, 0));
		btnLog_19_1.setForeground(new Color(0, 255, 0));
		btnLog_19_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				//ops = Math.log(ops);
				ops = scientificCalcOperations.log10(ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		btnLog_19_1.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btnLog_19_1.setBounds(270, 48, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnLog_19_1);
		
		//Sets the calculator button for the Sine symbol, adds color, and function action
		JButton btnSin = new JButton("Sin");
		btnSin.setBackground(new Color(0, 0, 0));
		btnSin.setForeground(new Color(0, 255, 0));
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				//ops = Math.Sin(ops);
				//ops = scientificCalcOperations.sin(ops);
				ops = scientificCalcOperations.sin(ops * (Math.PI/180.0));
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		btnSin.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btnSin.setBounds(328, 48, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnSin);
		
		//Sets the calculator button for the hyperbolic sine symbol, adds color, and function action
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setBackground(new Color(0, 0, 0));
		btnSinh.setForeground(new Color(0, 255, 0));
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = Math.sinh(ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		btnSinh.setFont(new Font("SanSerif", Font.PLAIN, 10));
		btnSinh.setBounds(386, 48, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnSinh);
		
		//Sets the calculator button for the Modulo symbol, adds color, and function action
		JButton btnMod = new JButton("Mod");
		btnMod.setBackground(new Color(0, 0, 0));
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMod.setForeground(new Color(0, 255, 0));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay1.getText());
				textDisplay1.setText("");
				operations = "Mod";
			
			}
		});
		btnMod.setBounds(444, 48, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnMod);
		
		//Sets the calculator button for the Pi symbol, adds color, and function action
		JButton btnLog_19_1_1 = new JButton("\u03C0");
		btnLog_19_1_1.setBackground(new Color(0, 0, 0));
		btnLog_19_1_1.setForeground(new Color(0, 255, 0));
		btnLog_19_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384626433832795);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		
		btnLog_19_1_1.setFont(new Font("SanSerif", Font.PLAIN, 14));
		btnLog_19_1_1.setBounds(270, 97, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnLog_19_1_1);
		
		//Sets the calculator button for the Cosine symbol, adds color, and function action
		JButton btnCos_19_1_2 = new JButton("Cos");
		btnCos_19_1_2.setBackground(new Color(0, 0, 0));
		btnCos_19_1_2.setForeground(new Color(0, 255, 0));
		btnCos_19_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = Math.cos(ops);
				textDisplay1.setText(String.valueOf(ops));
					
			}
		});
		
		btnCos_19_1_2.setFont(new Font("SanSerif", Font.PLAIN, 11));
		btnCos_19_1_2.setBounds(328, 97, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnCos_19_1_2);
		
		//Sets the calculator button for the hyperbolic cosine symbol, adds color, and function action
		JButton btnCosh_19_1_3 = new JButton("Cosh");
		btnCosh_19_1_3.setBackground(new Color(0, 0, 0));
		btnCosh_19_1_3.setForeground(new Color(0, 255, 0));
		btnCosh_19_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnCosh_19_1_3.setFont(new Font("SanSerif", Font.PLAIN, 9));
		btnCosh_19_1_3.setBounds(386, 97, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnCosh_19_1_3);
		
		//Sets the calculator button for the Natural Logarithm symbol, adds color, and function action
		JButton btnInx_19_1_4 = new JButton("lnx");
		btnInx_19_1_4.setBackground(new Color(0, 0, 0));
		btnInx_19_1_4.setForeground(new Color(0, 255, 0));
		btnInx_19_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = Math.log10(ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		
		btnInx_19_1_4.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btnInx_19_1_4.setBounds(444, 97, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnInx_19_1_4);
		
		//Sets the calculator button for the Exponential symbol, adds color, and function action
		JButton btnC_19_1_5 = new JButton("Exp");
		btnC_19_1_5.setBackground(new Color(0, 0, 0));
		btnC_19_1_5.setForeground(new Color(0, 255, 0));
		btnC_19_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay1.getText());
				textDisplay1.setText("");
				operations = "Exp";
			}
		});
		
		btnC_19_1_5.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btnC_19_1_5.setBounds(444, 146, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnC_19_1_5);
		
		//Sets the calculator button for the  hyperbolic tangent symbol, adds color, and function action
		JButton btnTanh_19_1_6 = new JButton("Tanh");
		btnTanh_19_1_6.setBackground(new Color(0, 0, 0));
		btnTanh_19_1_6.setForeground(new Color(0, 255, 0));
		btnTanh_19_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = Math.tanh(ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		
		btnTanh_19_1_6.setFont(new Font("SanSerif", Font.PLAIN, 9));
		btnTanh_19_1_6.setBounds(386, 146, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnTanh_19_1_6);

		//Sets the calculator button for the  Tangent symbol, adds color, and function action
		JButton btnTan_19_1_7 = new JButton("Tan");
		btnTan_19_1_7.setBackground(new Color(0, 0, 0));
		btnTan_19_1_7.setForeground(new Color(0, 255, 0));
		btnTan_19_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = Math.tan(ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		
		btnTan_19_1_7.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btnTan_19_1_7.setBounds(328, 146, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnTan_19_1_7);
		
		//Sets the calculator button for the  PowerMod symbol, adds color, and function action
		JButton btnXY_19_1_8 = new JButton("x^y");
		btnXY_19_1_8.setBackground(new Color(0, 0, 0));
		btnXY_19_1_8.setForeground(new Color(0, 255, 0));
		btnXY_19_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = Math.pow(ops, ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		
		btnXY_19_1_8.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btnXY_19_1_8.setBounds(270, 146, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnXY_19_1_8);
		
		
		//Sets the calculator button for the X^2 symbol, adds color, and function action
		JButton btnX2_19_1_9 = new JButton("X^2");
		btnX2_19_1_9.setBackground(new Color(0, 0, 0));
		btnX2_19_1_9.setForeground(new Color(0, 255, 0));
		btnX2_19_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = (ops * ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		btnX2_19_1_9.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btnX2_19_1_9.setBounds(270, 195, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnX2_19_1_9);
		
		//Sets the calculator button for the X^3 symbol, adds color, and function action
		JButton btnLog_19_1_10 = new JButton("X^3");
		btnLog_19_1_10.setBackground(new Color(0, 0, 0));
		btnLog_19_1_10.setForeground(new Color(0, 255, 0));
		btnLog_19_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = (ops * ops * ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		btnLog_19_1_10.setBounds(270, 244, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnLog_19_1_10);
		
		//Sets the calculator button for the CBR symbol, adds color, and function action
		JButton btnCbr_19_1_11 = new JButton("Cbr");
		btnCbr_19_1_11.setBackground(new Color(0, 0, 0));
		btnCbr_19_1_11.setForeground(new Color(0, 255, 0));
		btnCbr_19_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = Math.cbrt(ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		btnCbr_19_1_11.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btnCbr_19_1_11.setBounds(328, 195, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnCbr_19_1_11);
		
		//Sets the calculator button for the Round symbol, adds color, and function action
		JButton btnRund_19_1_12 = new JButton("Rund");
		btnRund_19_1_12.setBackground(new Color(0, 0, 0));
		btnRund_19_1_12.setForeground(new Color(0, 255, 0));
		btnRund_19_1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay1.getText()));
				ops = Math.round(ops);
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		
		btnRund_19_1_12.setFont(new Font("SanSerif", Font.PLAIN, 9));
		btnRund_19_1_12.setBounds(386, 195, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnRund_19_1_12);
		
		//Sets the calculator button for the Pi symbol, adds color, and function action
		JButton btn2PI_19_1_13 = new JButton("2*\u03C0");
		btn2PI_19_1_13.setBackground(new Color(0, 0, 0));
		btn2PI_19_1_13.setForeground(new Color(0, 255, 0));
		btn2PI_19_1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384626433832795) * 2;
				textDisplay1.setText(String.valueOf(ops));
			}
		});
		btn2PI_19_1_13.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btn2PI_19_1_13.setBounds(444, 195, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btn2PI_19_1_13);
		
		//Sets the calculator button for the Octal symbol, adds color, and function action
		JButton btnLog_19_1_14 = new JButton("Octal");
		btnLog_19_1_14.setBackground(new Color(0, 0, 0));
		btnLog_19_1_14.setForeground(new Color(0, 255, 0));
		btnLog_19_1_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(textDisplay1.getText());
				textDisplay1.setText(Integer.toString(a,8));
			}
		});
		btnLog_19_1_14.setFont(new Font("Dialog", Font.PLAIN, 9));
		btnLog_19_1_14.setBounds(444, 244, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnLog_19_1_14);
		
		//Sets the calculator button for the hexadecimal symbol, adds color, and function action
		JButton btnHex_19_1_15 = new JButton("Hex");
		btnHex_19_1_15.setBackground(new Color(0, 0, 0));
		btnHex_19_1_15.setForeground(new Color(0, 255, 0));	
		btnHex_19_1_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(textDisplay1.getText());
				textDisplay1.setText(Integer.toString(a,16));
			}
		});
		btnHex_19_1_15.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btnHex_19_1_15.setBounds(386, 244, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnHex_19_1_15);
		
		//Sets the calculator button for the Binary symbol, adds color, and function action
		JButton btnBin_19_1_16 = new JButton("Bin");
		btnBin_19_1_16.setBackground(new Color(0, 0, 0));
		btnBin_19_1_16.setForeground(new Color(0, 255, 0));
		btnBin_19_1_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(textDisplay1.getText());
				textDisplay1.setText(Integer.toString(a,2));
				
			}
		});
		btnBin_19_1_16.setFont(new Font("SanSerif", Font.PLAIN, 12));
		btnBin_19_1_16.setBounds(328, 244, 56, 47);
		frmAshlysScientificCalculator.getContentPane().add(btnBin_19_1_16);
	}
}
