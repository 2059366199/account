package cn.itcast.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.service.OrderService;

public class OrderTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		OrderService orderService = context.getBean(OrderService.class);
		orderService.accountMoney();
	}
}
