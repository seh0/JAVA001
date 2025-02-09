package com.bank00;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CashWithdraw implements BankProcess {
	SimpleDateFormat df;

	@Override
	public void exec(ArrayList<Account> list, Account user, View v1, View v2) {
		df = new SimpleDateFormat(" yyyy-MM-dd > hh:mm:ss ");
		String i_cash = JOptionPane.showInputDialog("출금할 금액 입력");
		try {
			int w_cash = Integer.parseInt(i_cash);
			if (user.getCash() - w_cash < 0) {
				JOptionPane.showMessageDialog(null, "잔액이 부족합니다");
				return;
			}
			user.setCash(user.getCash() - w_cash);
			JOptionPane.showMessageDialog(null, "출금 완료");
			Object[] data = { df.format(System.currentTimeMillis()), (" - " + w_cash), user.getCash() };
			v1.getmodel().addRow(data);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "숫자만 입력해주세요");
			return;
		}

	}

}
