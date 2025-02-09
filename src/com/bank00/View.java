package com.bank00;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public interface View {
	void show();

	void hide();

	JTextField getfield(int i);

	JButton getbtn(int i);

	JLabel getlabel(int i);

	DefaultTableModel getmodel();
}
