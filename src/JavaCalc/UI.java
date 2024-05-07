package JavaCalc;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UI extends CalcFunctions{

	public JFrame frame;
	public static JTextField display;

	public JFrame getFrame() {
		return frame;
	}

	public static JTextField getDisplay() {
		return display;
	}

	public UI() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame("Calculator");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setResizable(false);
		frame.setBounds(100, 100, 310, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setSize(310, 457);
		
		display = new JTextField();
		display.setText("0");
		display.setForeground(new Color(235, 254, 253));
		display.setFont(new Font("Arial", Font.BOLD, 35));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBackground(new Color(78, 78, 78));
		display.setBounds(10, 15, 274, 75);
		display.setEditable(false);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.DARK_GRAY);
		btnC.setForeground(new Color(235, 254, 253));
		btnC.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnC.setBounds(14, 105, 55, 47);
		frame.getContentPane().add(btnC);
		btnC.addActionListener(this::btnC);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBackground(Color.DARK_GRAY);
		btnPercent.setForeground(new Color(235, 254, 253));
		btnPercent.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnPercent.setBounds(83, 105, 55, 47);
		frame.getContentPane().add(btnPercent);
		btnPercent.addActionListener(this::btnPercent);
		
		JButton btnTimes = new JButton("X");
		btnTimes.setBackground(Color.DARK_GRAY);
		btnTimes.setForeground(new Color(235, 254, 253));
		btnTimes.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnTimes.setBounds(152, 105, 55, 47);
		frame.getContentPane().add(btnTimes);
		btnTimes.addActionListener(this::btnTimes);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(Color.DARK_GRAY);
		btnDivide.setForeground(new Color(235, 254, 253));
		btnDivide.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnDivide.setBounds(221, 105, 55, 47);
		frame.getContentPane().add(btnDivide);
		btnDivide.addActionListener(this::btnDivide);
		
		JButton btnSeven = new JButton("7");
		btnSeven.setBackground(Color.DARK_GRAY);
		btnSeven.setForeground(new Color(235, 254, 253));
		btnSeven.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnSeven.setBounds(14, 167, 55, 47);
		frame.getContentPane().add(btnSeven);
		btnSeven.addActionListener(this::btnSeven);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(Color.DARK_GRAY);
		btnPlus.setForeground(new Color(235, 254, 253));
		btnPlus.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnPlus.setBounds(221, 167, 55, 47);
		frame.getContentPane().add(btnPlus);
		btnPlus.addActionListener(this::btnPlus);
		
		JButton btnNine = new JButton("9");
		btnNine.setBackground(Color.DARK_GRAY);
		btnNine.setForeground(new Color(235, 254, 253));
		btnNine.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnNine.setBounds(152, 167, 55, 47);
		frame.getContentPane().add(btnNine);
		btnNine.addActionListener(this::btnNine);
		
		JButton btnEight = new JButton("8");
		btnEight.setBackground(Color.DARK_GRAY);
		btnEight.setForeground(new Color(235, 254, 253));
		btnEight.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnEight.setBounds(83, 167, 55, 47);
		frame.getContentPane().add(btnEight);
		btnEight.addActionListener(this::btnEight);
		
		JButton btnFour = new JButton("4");
		btnFour.setBackground(Color.DARK_GRAY);
		btnFour.setForeground(new Color(235, 254, 253));
		btnFour.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnFour.setBounds(14, 229, 55, 47);
		frame.getContentPane().add(btnFour);
		btnFour.addActionListener(this::btnFour);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBackground(Color.DARK_GRAY);
		btnMinus.setForeground(new Color(235, 254, 253));
		btnMinus.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnMinus.setBounds(221, 229, 55, 47);
		frame.getContentPane().add(btnMinus);
		btnMinus.addActionListener(this::btnMinus);
		
		JButton btnSix = new JButton("6");
		btnSix.setBackground(Color.DARK_GRAY);
		btnSix.setForeground(new Color(235, 254, 253));
		btnSix.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnSix.setBounds(152, 229, 55, 47);
		frame.getContentPane().add(btnSix);
		btnSix.addActionListener(this::btnSix);
		
		JButton btnFive = new JButton("5");
		btnFive.setBackground(Color.DARK_GRAY);
		btnFive.setForeground(new Color(235, 254, 253));
		btnFive.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnFive.setBounds(83, 229, 55, 47);
		frame.getContentPane().add(btnFive);
		btnFive.addActionListener(this::btnFive);
		
		JButton btnOne = new JButton("1");
		btnOne.setBackground(Color.DARK_GRAY);
		btnOne.setForeground(new Color(235, 254, 253));
		btnOne.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnOne.setBounds(13, 291, 55, 47);
		frame.getContentPane().add(btnOne);
		btnOne.addActionListener(this::btnOne);
		
		JButton btnThree = new JButton("3");
		btnThree.setBackground(Color.DARK_GRAY);
		btnThree.setForeground(new Color(235, 254, 253));
		btnThree.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnThree.setBounds(151, 291, 55, 47);
		frame.getContentPane().add(btnThree);
		btnThree.addActionListener(this::btnThree);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setBackground(Color.DARK_GRAY);
		btnTwo.setForeground(new Color(235, 254, 253));
		btnTwo.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnTwo.setBounds(82, 291, 55, 47);
		frame.getContentPane().add(btnTwo);
		btnTwo.addActionListener(this::btnTwo);
		
		JButton btnZero = new JButton("0");
		btnZero.setBackground(Color.DARK_GRAY);
		btnZero.setForeground(new Color(235, 254, 253));
		btnZero.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnZero.setBounds(14, 353, 124, 47);
		frame.getContentPane().add(btnZero);
		btnZero.addActionListener(this::btnZero);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setBackground(Color.DARK_GRAY);
		btnEquals.setForeground(new Color(235, 254, 253));
		btnEquals.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnEquals.setBounds(221, 291, 55, 109);
		frame.getContentPane().add(btnEquals);
		btnEquals.addActionListener(this::btnEquals);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.DARK_GRAY);
		btnDot.setForeground(new Color(235, 254, 253));
		btnDot.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
		btnDot.setBounds(152, 353, 55, 47);
		frame.getContentPane().add(btnDot);
		btnDot.addActionListener(this::btnDot);
	}
}
