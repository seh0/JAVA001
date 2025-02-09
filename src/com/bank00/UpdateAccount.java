package com.bank00;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UpdateAccount implements BankProcess {

	@Override
	public void exec(ArrayList<Account> list, Account user, View v1, View v2) {
		String update = JOptionPane.showInputDialog(null, "변경 내용 입력");
		user.setAddress(update);
		v1.getlabel(2).setText(" 주소 : " + user.getAddress());
	}

}
