package cn.itcast.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.OrderDao;

//@Transactional
public class OrderService {
	
	private OrderDao orderDao;
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	public void accountMoney(){
		orderDao.lessMoney();
		int i = 10/0;
		orderDao.moreMoney();
	}
}
