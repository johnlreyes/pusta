package per.pusta.service.impl.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BaseService {

	 private static EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("Dogs");
 
    public EntityManager createEntityManager() {
        return emf.createEntityManager();
    }
 
    public static void closeEntityManager() {
        emf.close();
    }
}
