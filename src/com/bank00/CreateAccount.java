package com.bank00;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CreateAccount implements BankProcess {

	@Override
	public void exec(ArrayList<Account> list, Account user, View v1, View v2) {
		for (int i = 0; i < 4; i++) {
			if (v1.getfield(i).getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "빈칸 확인");
				return;
			}
		}
		for (Account ac : list) {
			if ((v1.getfield(0).getText()).equals(ac.getId())) {
				JOptionPane.showMessageDialog(null, "중복된 아이디 입니다");
				return;
			}
		}
		list.add(new Account(v1.getfield(0).getText(), v1.getfield(1).getText(), v1.getfield(2).getText(),
				v1.getfield(3).getText(), 0));
		for (int i = 0; i < 4; i++) {
			v1.getfield(i).setText(null);
		}
		JOptionPane.showMessageDialog(null, "등록 완료");
		v1.hide();
		v2.show();
	}

}
