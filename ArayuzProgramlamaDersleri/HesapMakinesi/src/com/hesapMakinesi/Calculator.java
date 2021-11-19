package com.hesapMakinesi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private final JPanel screen = new JPanel();
	private JTextField input;
	private JButton btnfour;
	private JButton btnseven;
	private JButton btneight;
	private JButton btnbolme;
	private JButton btnnine;
	private JButton btnsix;
	private JButton btnfive;
	private JButton btntwo;
	private JButton btnone;
	private JButton btncarpma;
	private JButton btnthree;
	private JButton btnzero;
	private JButton btncikarma;
	private JButton btnclear;
	private JButton btnequal;
	private JButton btntoplama;
	private JLabel lbl;
	private double answer, number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public void addInput(String str) {
		input.setText(input.getText() + str);
	}

	public void calc() {
		switch (operation) {
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		}
	}

	public Calculator() {
		setType(Type.UTILITY);
		setFont(new Font("Dialog", Font.BOLD, 27));
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		screen.setBounds(0, 0, 401, 91);
		contentPane.add(screen);
		screen.setLayout(null);

		input = new JTextField();
		input.setForeground(new Color(255, 255, 255));
		input.setBackground(Color.DARK_GRAY);
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 22));
		input.setBounds(0, 25, 401, 78);
		screen.add(input);
		input.setColumns(10);

		lbl = new JLabel("");
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.RED);
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 10));
		lbl.setBounds(0, 2, 401, 24);
		screen.add(lbl);

		JPanel control = new JPanel();
		control.setBounds(0, 90, 401, 528);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 0, 0));

		btnseven = new JButton("7");
		btnseven.setBackground(Color.BLACK);
		btnseven.setForeground(new Color(255, 255, 255));
		btnseven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnseven.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnseven);

		btneight = new JButton("8");
		btneight.setForeground(Color.WHITE);
		btneight.setBackground(Color.BLACK);
		btneight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btneight.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btneight);

		btnnine = new JButton("9");
		btnnine.setForeground(Color.WHITE);
		btnnine.setBackground(Color.BLACK);
		btnnine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnnine.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnnine);

		btnbolme = new JButton("/");
		btnbolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				operation = 4;
				number = Double.parseDouble(input.getText());
				input.setText(" ");
				lbl.setText(number + "/");
			}
		});
		btnbolme.setForeground(Color.WHITE);
		btnbolme.setBackground(Color.BLACK);
		btnbolme.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnbolme);

		btnfour = new JButton("4");
		btnfour.setForeground(Color.WHITE);
		btnfour.setBackground(Color.BLACK);
		btnfour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnfour.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnfour);

		btnfive = new JButton("5");
		btnfive.setForeground(Color.WHITE);
		btnfive.setBackground(Color.BLACK);
		btnfive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnfive.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnfive);

		btnsix = new JButton("6");
		btnsix.setForeground(Color.WHITE);
		btnsix.setBackground(Color.BLACK);
		btnsix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnsix.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnsix);

		btncarpma = new JButton("X");
		btncarpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 3;
				number = Double.parseDouble(input.getText());
				input.setText(" ");
				lbl.setText(number + "*");
			}
		});
		btncarpma.setForeground(Color.WHITE);
		btncarpma.setBackground(Color.BLACK);
		btncarpma.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btncarpma);

		btnone = new JButton("1");
		btnone.setForeground(Color.WHITE);
		btnone.setBackground(Color.BLACK);
		btnone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnone.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnone);

		btntwo = new JButton("2");
		btntwo.setForeground(Color.WHITE);
		btntwo.setBackground(Color.BLACK);
		btntwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btntwo.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btntwo);

		btnthree = new JButton("3");
		btnthree.setForeground(Color.WHITE);
		btnthree.setBackground(Color.BLACK);
		btnthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnthree.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnthree);

		btncikarma = new JButton("-");
		btncikarma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 2;
				number = Double.parseDouble(input.getText());
				input.setText(" ");
				lbl.setText(number + "-");
			}
		});
		btncikarma.setForeground(Color.WHITE);
		btncikarma.setBackground(Color.BLACK);
		btncikarma.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btncikarma);

		btnzero = new JButton("0");
		btnzero.setForeground(Color.WHITE);
		btnzero.setBackground(Color.BLACK);
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnzero.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnzero);

		btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(" ");
				lbl.setText(" ");
			}
		});
		btnclear.setForeground(Color.WHITE);
		btnclear.setBackground(Color.BLACK);
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnclear);

		btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
				lbl.setText(" " );
			}
		});
		btnequal.setForeground(Color.WHITE);
		btnequal.setBackground(Color.BLACK);
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btnequal);

		btntoplama = new JButton("+");
		btntoplama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 1;
				number = Double.parseDouble(input.getText());
				input.setText(" ");
				lbl.setText(number + "+");
			}
		});
		btntoplama.setForeground(Color.WHITE);
		btntoplama.setBackground(Color.BLACK);
		btntoplama.setFont(new Font("Tahoma", Font.BOLD, 22));
		control.add(btntoplama);
	}
}
