/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import Models.Question;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
/**
 *
 * @author Алексей
 */
public class QuestionService {
        public EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();
    
     public Question add(Question question){
        em.getTransaction().begin();
        Question A = em.merge(question);
        em.getTransaction().commit();
        return A;
    }
 
    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }
 
    public Question get(long id){
        return em.find(Question.class, id);
    }
 
    public void update(Question question){
        em.getTransaction().begin();
        em.merge(question);
        em.getTransaction().commit();
    }
 
    public List<Question> getAll(){
        TypedQuery<Question> namedQuery = em.createNamedQuery("question.getAll", Question.class);
        return namedQuery.getResultList();
    }
}
