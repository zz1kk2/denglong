package com.service;

import java.util.List;

public interface BaseService<T>{
    
	 /**  
     * ����ʵ��  
   
     * @param entity  
     *         ʵ�����  
     * @return ʵ������  
     */  
    void add(Object entity);  
  
    /**  
     * ɾ��ʵ��   
     * @param entity  
     *        ʵ�����       
     */  
    void delete(Object entity);  
  
    /**  
     *   
     * ����ʵ��  
     * @param entity  
     *            ʵ�����  
     */  
    void update(Object entity);  
  
    /**  
     * ��������ʵ��, ʵ��û������ʱ���棬�������  
     * @param entity  
     *            ʵ����� 
     */  
    void saveOrUpdate(Object entity);  
    
    List<T> find(String hql);  
    
    List<T> find(String hql, String[] strings);
    
    T get(Class<T> entity,int id);  
}
