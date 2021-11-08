package com.redemptiablue.plane.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.redemptiablue.plane.entity.SeatingType;

@Repository
public class SeatingDAOHibernateImpl implements SeatingDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public SeatingDAOHibernateImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	@Transactional
	public List<SeatingType> getSmallPlaneSeatingTypes() {
		Query<SeatingType> smallSeatingTypes = null;
		try {
		Session currentSession = entityManager.unwrap(Session.class);
		
		smallSeatingTypes = currentSession.createQuery("From SeatingType s where s.availableOnSmall=1");
		
		} 
		catch (Exception err) {
			System.out.println(err);
		}
		return smallSeatingTypes.getResultList();
	}

	@Override
	public List<SeatingType> getLargePlaneSeatingTypes() {
		Query<SeatingType> largeSeatingTypes = null;
	try {
		Session currentSession = entityManager.unwrap(Session.class);
		
		largeSeatingTypes = currentSession.createQuery("From SeatingType");
		
		
	} 
	catch (Exception err) {
		System.out.println(err);
	}
	return largeSeatingTypes.getResultList();
	}

}
