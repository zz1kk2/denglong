package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BaseDao;
import com.service.BaseService;


@Service
public class BaseServiceI<T> implements BaseService<T> {

	
	@Autowired
	private BaseDao<T> base;
	
	public void add(Object entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(Object entity) {
		// TODO Auto-generated method stub
		
	}

	public void saveOrUpdate(Object entity) {
		// TODO Auto-generated method stub
		
	}

	public List<T> find(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> find(String hql, String[] strings) {
		// TODO Auto-generated method stub
		return null;
	}

	public T get(Class<T> entity, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	


	
	
	


}
