package com.bank00;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class View_admin implements View {
	JFrame frame;
	JButton button;
	String[] column;
	Object[][] rowData;
	DefaultTableModel model;
	JScrollPane scroll;
	JTable table;

	public View_admin() {
		frame = new JFrame("admin");
		button = new JButton("나가기");
		column = new String[] { "아이디", "비밀번호", "이름", "주소", "잔액" };
		rowData = new Object[][] {};
		model = new DefaultTableModel(rowData, column);
		table = new JTable(model);
		scroll = new JScrollPane(table);
	}

	public void show() {
		frame.setLayout(new BorderLayout());
		frame.add(scroll, BorderLayout.CENTER);
		frame.add(button, BorderLayout.SOUTH);
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public JButton getbtn(int i) {
		return button;
	}

	@Override
	public void hide() {
		model.setRowCount(0);
		frame.dispose();
	}

	@Override
	public JTextField getfield(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JLabel getlabel(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DefaultTableModel getmodel() {
		return model;
	}
}
