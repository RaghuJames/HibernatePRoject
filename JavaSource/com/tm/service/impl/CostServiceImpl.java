package com.tm.service.impl;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.dao.CostDao;
import com.tm.model.Cost;
import com.tm.service.CostService;

@Service
@Transactional
public class CostServiceImpl implements CostService {

	@Autowired
	private CostDao costDao;

	public void save(Cost cost) {
		this.costDao.save(cost);
		
	}
}
