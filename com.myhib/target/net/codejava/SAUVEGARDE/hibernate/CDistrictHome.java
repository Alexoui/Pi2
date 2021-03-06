package net.code.java.hibernate;
// Generated 13 nov. 2018 10:53:12 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CDistrict.
 * @see net.code.java.hibernate.CDistrict
 * @author Hibernate Tools
 */
@Stateless
public class CDistrictHome {

	private static final Log log = LogFactory.getLog(CDistrictHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CDistrict transientInstance) {
		log.debug("persisting CDistrict instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CDistrict persistentInstance) {
		log.debug("removing CDistrict instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CDistrict merge(CDistrict detachedInstance) {
		log.debug("merging CDistrict instance");
		try {
			CDistrict result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CDistrict findById(CDistrictId id) {
		log.debug("getting CDistrict instance with id: " + id);
		try {
			CDistrict instance = entityManager.find(CDistrict.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
