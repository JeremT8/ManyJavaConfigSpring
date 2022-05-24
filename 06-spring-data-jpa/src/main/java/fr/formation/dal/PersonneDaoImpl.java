package fr.formation.dal;

import fr.formation.entity.Personne;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonneDaoImpl implements PersonneDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void add(Personne p) {
        em.persist(p);
    }

    @Override
    @Transactional
    public void delete(Personne p) {
        em.remove(p);
    }

    @Override
    @Transactional
    public void update(Personne p) {
        em.merge(p);
    }

    @Override
    public List<Personne> findAll() {
        String req = "SELECT Object(p) FROM Personne p";
        return em.createQuery(req, Personne.class).getResultList();
    }


    @Override
    public Personne findById(int id) {
        return em.find(Personne.class, id);
    }
}
