package com.dao;

import java.util.List;

public interface BaseDao<T> {
   
    /** 
      * @Title: add
      * @Description: �������
      * @param @param entity    
      * @return void    
      * @throws
      */
    void add(Object entity);  
  
      /** 
        * @Title: delete
        * @Description: ����ɾ��
        * @param @param entity    
        * @return void    
        * @throws
     */
    void delete(Object entity);  
  
  
      /** 
        * @Title: saveOrUpdate
        * @Description: �����޸Ļ�ɾ��
        * @param @param entity    
        * @return void    
        * @throws
     */
    void saveOrUpdate(Object entity);  
    
      /**      
        * @Title: find
        * @Description: hqlִ��
        * @param @param hql
        * @param @return    
        * @return List<T>    
        * @throws
     */
    List<T> find(String hql);  
    
    
    /**
     * 
        * @Title: find
        * @Description: TODO
        * @param @param hql
        * @param @param strings
        * @param @return    
        * @return List<T>    
        * @throws
     */
    List<T> find(String hql, String[] strings);
    
    T get(Class<T> entity,int id); 
    
    /**
     * 
        * @Title: getEn
        * @Description: �õ����ͼ���
        * @param @param entity
        * @param @return    
        * @return List<T>    
        * @throws
     */
    List<T> getEn();
    
      /**
        * @Title: getEnById
        * @Description: �õ����ͼ���,ͨ��id
        * @param @param entity
        * @param @param id
        * @param @return    
        * @return List<T>    
        * @throws
      */
    List<T> getEnById(Class<T> entity,int id);
    
    

}
