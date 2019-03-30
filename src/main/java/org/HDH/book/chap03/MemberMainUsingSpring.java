package org.HDH.book.chap03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMainUsingSpring {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chap03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);

		// registerRequest ?��?��린�?��
		RegisterRequest req = new RegisterRequest();
		req.setEmail("hongdh1353@naver.com");
		req.setPassword("xxxx");
		req.setName("HDH");

		// �쉶�썝 �벑濡�
		regService.regist(req);
	}
}
