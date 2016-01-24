package com.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BaseDao;
@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {

    @PersistenceContext(name="persistMysql")
    protected EntityManager entityManager;
    

    protected Session session;
    
//    public BaseDaoImpl(){
//         session =sessionFactory.getCurrentSession();
//    }
    
    
    public void add(Object entity) {  
         entityManager.persist(entity);       
    }

    public void delete(Object entity) {
        session.delete(entity);        
    }

    public void update(Object entity) {
        session.update(entity);
    }

    public void saveOrUpdate(Object entity) {
        session.saveOrUpdate(entity);   
    }

    
    
    @SuppressWarnings("unchecked")
    public List<T> find(String hql) {
        return session.createQuery(hql).list();
    }


    @Transactional
    public T get(Class<T> entity,int id) {
        // TODO Auto-generated method stub        
//        Session session = sessionFactory.getCurrentSession();
//        
//         = (T) session.get(entity,id);
        T t = null;
        return t;
    }

    public List<T> find(String hql, String[] strings) {
       
          return session.createQuery(hql).list();
    }

    
    
}
