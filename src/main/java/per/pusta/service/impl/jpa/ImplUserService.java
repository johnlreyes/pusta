package per.pusta.service.impl.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import per.pusta.service.UserService;

public class ImplUserService extends BaseService implements UserService {

	public boolean existing(String email) {
		boolean returnValue = false;
		EntityManager em = createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
 
        Query query = em.createQuery("select u.id from User u where u.email=:email");
        Integer id = (Integer)query.getSingleResult();
		returnValue = id != null;
 
        tx.commit();
        em.close();
		
		return returnValue;
	}
	
	public boolean register(String email, String password) {
		boolean returnValue = false;
		return returnValue;
	}
	
	public void login(String email, String password) {
	}
}
