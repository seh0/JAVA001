package com.bank00;

import java.util.ArrayList;

public class ReadAccount implements BankProcess{

	@Override
	public void exec(ArrayList<Account> list, Account user, View v1, View v2) {
		v1.hide();
		v2.show();
		for (Account ac : list) {
			Object[] data = { ac.getId(), ac.getPwd(), ac.getName(), ac.getAddress(), ac.getCash() };
			v2.getmodel().addRow(data);
		}
	}

}
