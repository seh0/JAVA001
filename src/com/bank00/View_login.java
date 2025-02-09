package com.bank00;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class View_login implements View {
	JFrame frame;
	JLabel[] label;
	JTextField[] text;
	JButton[] button;

	public View_login() {
		frame = new JFrame("Login");
		label = new JLabel[] { new JLabel("아이디"), new JLabel("비밀번호") };
		label[0].setBounds(70, 50, 80, 30);
		text = new JTextField[] { new JTextField(), new JTextField() };
		text[0].setBounds(200, 50, 100, 30);
		label[1].setBounds(70, 100, 80, 30);
		text[1].setBounds(200, 100, 100, 30);
		button = new JButton[] { new JButton("로그인"), new JButton("취소") };
		button[0].setBounds(150, 200, 75, 30);
		button[1].setBounds(250, 200, 75, 30);
	}

	public void show() {
		for (int i = 0; i < 2; i++) {
			frame.add(label[i]);
			frame.add(text[i]);
			frame.add(button[i]);
		}
		frame.setLayout(null);
		frame.setSize(400, 300);
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
		text[0].setText(null);
		text[1].setText(null);
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