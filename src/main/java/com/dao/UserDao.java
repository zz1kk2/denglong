package com.dao;

import com.bean.Usera;

public interface UserDao extends BaseDao<Usera>{

   /**
    * �û���¼
    * @param userName
    * @param pwd
    * @return
    */
     public Boolean userLogin(String userName,String pwd);
}
