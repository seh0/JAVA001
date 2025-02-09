package com.bank00;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AccountLogin {

	public Account find(ArrayList<Account> list, View v1) {
		String id = v1.getfield(0).getText();
		String pwd = v1.getfield(1).getText();
		for (Account ac : list) {
			if (id.equals(ac.getId()) && pwd.equals(ac.getPwd())) {
				return ac;
			}
		}
		return null;

	}

	public void in(ArrayList<Account> list, Account user, View v1, View v2) {
		if (user != null) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			for (int i = 0; i < 2; i++) {
				v1.getfield(i).setText(null);
			}
			v1.hide();
			v2.show();
			v2.getlabel(0).setText(user.getName());
			v2.getlabel(1).setText(" 아이디 : " + user.getId());
			v2.getlabel(2).setText(" 주소 : " + user.getAddress());
		} else
			JOptionPane.showMessageDialog(null, "다시 확인해주세요");

	}

	public void out(View v1, View v2) {
		v1.hide();
		v2.show();
	}

}
