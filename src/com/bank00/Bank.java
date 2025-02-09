package com.bank00;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class mvc_using {
	ArrayList<Account> list;
	AccountLogin login;
	Account user;
	View vi;
	View[] vis;
	BankProcess controller;
	BankProcess[] process;

	public mvc_using() {
		list = new ArrayList<Account>();
		login = new AccountLogin();
// 0.등록 1.입금 2.출금 3.수정 4.읽기 5.삭제
		process = new BankProcess[] { new CreateAccount(), new CashDeposit(), new CashWithdraw(), new UpdateAccount(),
				new ReadAccount(), new DeleteAccount() };
// 0.intro 1.admin 2.create 3.login 4.info
		vis = new View[] { new View_intro(), new View_admin(), new View_create(), new View_login(), new View_info() };
	}

	public void button(int btn, View v1, View v2) {
		v1.getbtn(btn).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				v1.hide();
				v2.show();
			}
		});
	}

	public void button(int btn, View v1, View v2, int pro) {
		v1.getbtn(btn).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller = process[pro];
				controller.exec(list, user, v1, v2);
			}
		});
	}

	public void start() {
		vis[0].show();

// intro 등록
		button(0, vis[0], vis[2]);
// intro 로그인
		button(1, vis[0], vis[3]);
// intro ?
		button(2, vis[0], vis[1], 4);
// admin 나가기
		button(0, vis[1], vis[0]);
// create 등록
		button(0, vis[2], vis[0], 0);
// create 취소
		button(1, vis[2], vis[0]);
// login 취소
		button(1, vis[3], vis[0]);
// info 입금
		button(0, vis[4], null, 1);
// info 출금
		button(1, vis[4], null, 2);
// info 주소변경
		button(2, vis[4], null, 3);
// info 계좌삭제
		button(4, vis[4], vis[0], 5);
// 로그인
		vis[3].getbtn(0).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				user = login.find(list, vis[3]);
				login.in(list, user, vis[3], vis[4]);
			}
		});
// 로그아웃
		vis[4].getbtn(3).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				user = null;
				login.out(vis[4], vis[0]);
			}
		});
	}
}

public class Bank {
	public static void main(String[] args) {
		mvc_using mvc = new mvc_using();
		mvc.start();
	}
}
