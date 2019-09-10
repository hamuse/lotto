package com.lotto.web.servicesImpl;

import com.lotto.web.daoImpls.ConsumerDaoImpl;
import com.lotto.web.daos.ConsumerDAO;
import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.services.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService  {
	private	ConsumerDAO dao;

	public ConsumerServiceImpl() {
		dao = new ConsumerDaoImpl();
	}
	@Override
	public void registerConsumer(ConsumerBean param) {
		System.out.println("registerConsumer"+param.toString());
			dao.insertConsumer(param);
	
	}

}
