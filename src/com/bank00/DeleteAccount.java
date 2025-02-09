package com.bank00;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DeleteAccount implements BankProcess {

	@Override
	public void exec(ArrayList<Account> list, Account user, View v1, View v2) {
		int s = JOptionPane.showConfirmDialog(null, "계좌를 삭제합니다","확인",JOptionPane.YES_NO_OPTION);
		if(s == 0) {
			list.remove(user);
			v1.hide();
			v2.show();
		}else
			return;
	}

}
