package com.dao;

import java.util.List;

public interface BaseDao<T> {
   
    /** 
      * @Title: add
      * @Description: 公共添加
      * @param @param entity    
      * @return void    
      * @throws
      */
    void add(Object entity);  
  
      /** 
        * @Title: delete
        * @Description: 公共删除
        * @param @param entity    
        * @return void    
        * @throws
     */
    void delete(Object entity);  
  
  
      /** 
        * @Title: saveOrUpdate
        * @Description: 公共修改或删除
        * @param @param entity    
        * @return void    
        * @throws
     */
    void saveOrUpdate(Object entity);  
    
      /**      
        * @Title: find
        * @Description: hql执行
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
        * @Description: 得到类型集合
        * @param @param entity
        * @param @return    
        * @return List<T>    
        * @throws
     */
    List<T> getEn();
    
      /**
        * @Title: getEnById
        * @Description: 得到类型集合,通过id
        * @param @param entity
        * @param @param id
        * @param @return    
        * @return List<T>    
        * @throws
      */
    List<T> getEnById(Class<T> entity,int id);
    
    

}
