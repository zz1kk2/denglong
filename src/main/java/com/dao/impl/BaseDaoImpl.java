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

    
    public List<T> find(String hql, String[] strings) {
        
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
   
    
    /**
      *     
      *
      * @Title: get
      * @Description: TODO
      * @param @param entity
      * @param @return    设定文件
      * @return List<T>    返回类型
      * @throws
     */
    public List<T> get(Class<T> entity) {
        // TODO Auto-generated method stub        
//        Session session = sessionFactory.getCurrentSession();
//        
//         = (T) session.get(entity,id);
        T t = null;
        return null;
    }

	public List<T> getEn() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> getEnById(Class<T> entity, int id) {
		// TODO Auto-generated method stub
		return null;
	}
    

  

    
    
}
