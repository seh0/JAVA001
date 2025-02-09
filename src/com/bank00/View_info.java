package com.bank00;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class View_info implements View {
	JFrame frame;
	JLabel[] label;
	JPanel h_panel, b_panel;
	JButton[] button;
	String[] column;
	Object[][] rowData;
	DefaultTableModel model;
	JScrollPane scroll;
	JTable table;

	public View_info() {
		frame = new JFrame("Info");
		label = new JLabel[] { new JLabel("name"), new JLabel("id"), new JLabel("address") };
		h_panel = new JPanel();
		column = new String[] { "시간", "내역", "잔액" };
		rowData = new Object[][] {};
		model = new DefaultTableModel(rowData, column);
		table = new JTable(model);
		scroll = new JScrollPane(table);
		b_panel = new JPanel();
		button = new JButton[] { new JButton("입금"), new JButton("출금"), new JButton("주소변경"), new JButton("로그아웃"),
				new JButton("계좌삭제") };
	}

	public void show() {
		frame.setLayout(new BorderLayout());
		h_panel.setLayout(new GridLayout(3, 1));
		label[0].setFont(new Font(Font.MONOSPACED, Font.BOLD, 40));

		for (int i = 0; i < label.length; i++) {
			h_panel.add(label[i]);
		}
		for (int i = 0; i < button.length; i++) {
			b_panel.add(button[i]);
		}
		frame.add(h_panel, BorderLayout.NORTH);
		frame.add(scroll, BorderLayout.CENTER);
		frame.add(b_panel, BorderLayout.SOUTH);
		frame.setSize(500, 500);
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
		return label[i];
	}

	@Override
	public DefaultTableModel getmodel() {
		return model;
	}
}
