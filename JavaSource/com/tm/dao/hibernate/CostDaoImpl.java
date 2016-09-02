package com.tm.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tm.dao.CostDao;
import com.tm.model.Cost;

@Repository
public class CostDaoImpl implements CostDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(Cost cost) {
		try{
			System.out.println("----USERNAME------SAVE--"+cost.getUserName());
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			int count = ((Long)session.createQuery("select count(*) from Cost").uniqueResult()).intValue();
			System.out.println("------COUN-T-----------"+count);
				cost.setUserId(count+1);
		
			session.save(cost);
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
