package com.dao;


public interface UserService {
    
    /**
     * �ʺ�������ȷ����true
     * @param userName
     * @param pwd
     * @return
     */
    public Boolean userLogin(String userName,String pwd);

}
