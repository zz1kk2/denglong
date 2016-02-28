package com.service;

import java.util.List;

public interface BaseService<T>{
    
	 /**  
     * 保存实体  
   
     * @param entity  
     *         实体对象  
     * @return 实体主键  
     */  
    void add(Object entity);  
  
    /**  
     * 删除实体   
     * @param entity  
     *        实体对象       
     */  
    void delete(Object entity);  
  
    /**  
     *   
     * 更新实体  
     * @param entity  
     *            实体对象  
     */  
    void update(Object entity);  
  
    /**  
     * 保存或更新实体, 实体没有主键时保存，否则更新  
     * @param entity  
     *            实体对象 
     */  
    void saveOrUpdate(Object entity);  
    
    List<T> find(String hql);  
    
    List<T> find(String hql, String[] strings);
    
    T get(Class<T> entity,int id);  
}
