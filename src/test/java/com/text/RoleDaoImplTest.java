package com.text;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Action;
import com.bean.Role;
import com.dao.RoleDao;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-ming.xml")
public class RoleDaoImplTest {

    
    @Autowired(required=false)  //自动注入,默认按名称  
    private RoleDao roleDao; 
    
    
    @Test
    public void testBaseDaoImpl() {
        
    }

    @Test
    public void testSave() {
        Role role = new Role();
        role.setRoleName("yisheng9");

        Set<Action> bean = new HashSet<Action>();
        Action action = new Action();
        
        action.setActionName("cc");
        action.setCode("11");
        action.setActionAdress("adf");
        action.setType(1);
        bean.add(action);        
        role.setAction(bean);
        roleDao.add(role);
    }

    @Test
    public void testDelete() {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdate() {
        fail("Not yet implemented");
    }

    @Test
    public void testSaveOrUpdate() {
        fail("Not yet implemented");
    }

    @Test
    public void testFind() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGet() {
        roleDao.get(Role.class,1);
    }

}
