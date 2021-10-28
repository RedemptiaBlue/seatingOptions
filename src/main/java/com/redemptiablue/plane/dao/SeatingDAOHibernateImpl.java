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
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<SeatingType> smallSeatingTypes = currentSession.createQuery("From SeatingType s where s.availableOnSmall=1");
		return smallSeatingTypes.getResultList();
	}

	@Override
	public List<SeatingType> getLargePlaneSeatingTypes() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<SeatingType> largeSeatingTypes = currentSession.createQuery("From SeatingType");
		
		return largeSeatingTypes.getResultList();
	}

}
