package com.bank00;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class View_create implements View {
	ArrayList<Account> account;
	View_intro intro;
	JFrame frame;
	JLabel h_label;
	JLabel[] label;
	JTextField[] text;
	JButton[] button;

	public View_create() {
		frame = new JFrame("Create");
		h_label = new JLabel("Create Account");
		label = new JLabel[] { new JLabel("아이디 : "), new JLabel("비밀번호 : "), new JLabel("이름 : "), new JLabel("주소 : ") };
		text = new JTextField[] { new JTextField(), new JTextField(), new JTextField(), new JTextField() };
		button = new JButton[] { new JButton("등록"), new JButton("취소") };
		intro = new View_intro();
		h_label.setBounds(125, 25, 300, 30);
		for (int i = 0; i < label.length; i++) {
			label[i].setBounds(50, (100 * (i + 1)), 80, 30);
		}
		for (int i = 0; i < text.length; i++) {
			text[i].setBounds(200, (100 * (i + 1)), 200, 30);
		}
		button[0].setBounds(250, 500, 80, 30);
		button[1].setBounds(350, 500, 80, 30);
	}

	public void show() {
		for (int i = 0; i < label.length; i++) {
			frame.add(label[i]);
		}
		for (int i = 0; i < text.length; i++) {
			frame.add(text[i]);
		}
		frame.add(h_label);
		h_label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
		frame.add(button[0]);
		frame.add(button[1]);
		frame.setLayout(null);
		frame.setSize(500, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public JButton getbtn(int i) {
		return button[i];
	}

	@Override
	public void hide() {
		for (int i = 0; i < text.length; i++) {
			text[i].setText(null);
		}
		frame.dispose();
	}

	@Override
	public JTextField getfield(int i) {
		return text[i];
	}

	@Override
	public JLabel getlabel(int i) {
		return label[i];
	}

	@Override
	public DefaultTableModel getmodel() {
		// TODO Auto-generated method stub
		return null;
	}
}
