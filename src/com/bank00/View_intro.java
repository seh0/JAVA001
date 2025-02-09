package com.bank00;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class View_intro implements View {
	JFrame frame;
	JButton[] button;
	JLabel label;
	ImageIcon icon;

	public View_intro() {

		frame = new JFrame("Intro");
		label = new JLabel("Bank", JLabel.CENTER);
		icon = new ImageIcon("imgs/a1.png");
		button = new JButton[] { new JButton("계좌 등록"), new JButton("로그인"), new JButton("?") };
		label.setBounds(50, 0, 300, 300);
		button[0].setBounds(100, 300, 100, 30);
		button[1].setBounds(300, 300, 100, 30);
		button[2].setBounds(50, 300, 45, 30);
	}

	public void show() {
		label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 70));
		label.setIcon(icon);
		frame.add(label);
		frame.add(button[0]);
		frame.add(button[1]);
		frame.add(button[2]);
		frame.setLayout(null);
		frame.setSize(500, 400);
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
		frame.dispose();
	}

	@Override
	public JTextField getfield(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JLabel getlabel(int i) {
		return label;
	}

	@Override
	public DefaultTableModel getmodel() {
		// TODO Auto-generated method stub
		return null;
	}
}