/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import Models.Answer;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Алексей
 */


public class AnswerService {
 
    public EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();
    
     public Answer add(Answer answer){
        em.getTransaction().begin();
        Answer A = em.merge(answer);
        em.getTransaction().commit();
        return A;
    }
 
    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }
 
    public Answer get(long id){
        return em.find(Answer.class, id);
    }
 
    public void update(Answer answer){
        em.getTransaction().begin();
        em.merge(answer);
        em.getTransaction().commit();
    }
 
    public List<Answer> getAll(){
        TypedQuery<Answer> namedQuery = em.createNamedQuery("answer.getAll", Answer.class);
        return namedQuery.getResultList();
    }
}
