package com.bank00;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CashDeposit implements BankProcess {
	SimpleDateFormat df;

	@Override
	public void exec(ArrayList<Account> list, Account user, View v1, View v2) {
		df = new SimpleDateFormat(" yyyy-MM-dd > hh:mm:ss ");
		String i_cash = JOptionPane.showInputDialog("입금할 금액 입력");
		try {
			int d_cash = Integer.parseInt(i_cash);
			user.setCash(d_cash + user.getCash());
			JOptionPane.showMessageDialog(null, "입금 완료");
			Object[] data = { df.format(System.currentTimeMillis()), (" + " + d_cash), user.getCash() };
			v1.getmodel().addRow(data);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "숫자만 입력해주세요");
			return;
		}

	}

}
