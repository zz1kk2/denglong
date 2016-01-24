package com.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.bean.Usera;

@Repository
public class UserDaoImpl extends BaseDaoImpl<Usera> implements UserDao {

    public Boolean userLogin(String userName, String pwd) {
        String hql = "from Usera t where t.account =:account and t.password = :pwd";

        Query query = entityManager.createQuery(hql, Usera.class)
                .setParameter("account", userName).setParameter("pwd", pwd);
        if (query.getResultList().size() == 0) {
            return false;
        }
        return true;
    }

}
