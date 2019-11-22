import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO<E extends Identificavel> {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("marjorye_martha_tc");
	private EntityManager em = factory.createEntityManager();
	
	public void save(E e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}
	
	public void update(E e) {
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
	}
	
	public void remove(E e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
	}
	
	public E find(Class<E> classe,Long id) {
		E e = em.find(classe, id);
		em.close();
		return e;
	}
	
}
