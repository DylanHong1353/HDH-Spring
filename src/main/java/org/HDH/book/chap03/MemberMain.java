package org.HDH.book.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		//MemberRegisterService regService = new MemberRegisterService(memberDao);
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);

		// registerRequest ?��?��린�?��
		RegisterRequest req = new RegisterRequest();
		req.setEmail("hongdh1353@naver.com");
		req.setPassword("xxxx");
		req.setName("HDH");

		
		// �쉶�썝 �벑濡�
		regService.regist(req);
	}
}
