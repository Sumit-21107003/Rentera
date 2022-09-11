package com.apsit.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class MyGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGUI frame = new MyGUI();
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
	public MyGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0xFFF1E6));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registeration");
		lblNewLabel.setForeground(new Color(160, 42, 42));
		lblNewLabel.setFont(new Font("Great Sejagad", Font.PLAIN, 60));
		lblNewLabel.setBounds(336, 25, 303, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 35));
		lblNewLabel_1.setBounds(24, 112, 149, 38);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(210, 105, 30));
		textField.setFont(new Font("Cambria", Font.PLAIN, 20));
		textField.setBounds(155, 118, 266, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Phone No.:");
		lblNewLabel_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 35));
		lblNewLabel_2.setBounds(439, 112, 215, 39);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(210, 105, 30));
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		textField_1.setBounds(652, 112, 274, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setFont(new Font("Monospaced", Font.BOLD, 35));
		lblNewLabel_3.setForeground(new Color(165, 42, 42));
		lblNewLabel_3.setBounds(21, 186, 133, 38);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(210, 105, 30));
		textField_2.setFont(new Font("Cambria", Font.PLAIN, 20));
		textField_2.setBounds(155, 193, 266, 36);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Gender:");
		lblNewLabel_4.setForeground(new Color(165, 42, 42));
		lblNewLabel_4.setFont(new Font("Monospaced", Font.BOLD, 35));
		lblNewLabel_4.setBounds(439, 191, 176, 38);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(new Color(210, 105, 30));
		rdbtnNewRadioButton.setFont(new Font("Great Sejagad", Font.PLAIN, 35));
		rdbtnNewRadioButton.setBounds(652, 165, 176, 38);
		rdbtnNewRadioButton.setFocusable(false);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setForeground(new Color(210, 105, 30));
		rdbtnNewRadioButton_1.setFont(new Font("Great Sejagad", Font.PLAIN, 35));
		rdbtnNewRadioButton_1.setBounds(652, 205, 176, 38);
		rdbtnNewRadioButton_1.setFocusable(false);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Others");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setForeground(new Color(210, 105, 30));
		rdbtnNewRadioButton_2.setFont(new Font("Great Sejagad", Font.PLAIN, 35));
		rdbtnNewRadioButton_2.setBounds(652, 245, 176, 38);
		rdbtnNewRadioButton_2.setFocusable(false);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("Address :");
		lblNewLabel_5.setForeground(new Color(165, 42, 42));
		lblNewLabel_5.setFont(new Font("Monospaced", Font.BOLD, 35));
		lblNewLabel_5.setBounds(24, 263, 199, 38);
		contentPane.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(210, 105, 30));
		textArea.setFont(new Font("Cambria", Font.PLAIN, 20));
		textArea.setBounds(141, 328, 480, 79);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 27));
		btnNewButton.setForeground(new Color(139, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setBounds(238, 436, 183, 54);
		btnNewButton.setBackground(new Color(244,164,96));
		btnNewButton.setBorder(BorderFactory.createEtchedBorder());
		btnNewButton.setFocusable(false);
		contentPane.add(btnNewButton);
		
		JButton btnConfirm = new JButton("RESET");
		btnConfirm.setForeground(new Color(139, 0, 0));
		btnConfirm.setFont(new Font("Cambria", Font.BOLD, 27));
		btnConfirm.setFocusable(false);
		btnConfirm.setBorder(BorderFactory.createEtchedBorder());
		btnConfirm.setBackground(new Color(255, 255, 204));
		btnConfirm.setBounds(530, 436, 183, 54);
		contentPane.add(btnConfirm);
	}
}
