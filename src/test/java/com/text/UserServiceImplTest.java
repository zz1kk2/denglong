package com.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.UserDao;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-ming.xml")
public class UserServiceImplTest {

    
    @Autowired(required=false)  //�Զ�ע��,Ĭ�ϰ�����  
    private UserDao userDao; 
    
    
    @Test
    public void testBaseDaoImpl() {
        
    }

    @Test
    public void testuserLogin() {
        userDao.userLogin("dladmin","1991127k");
    }

    

}
