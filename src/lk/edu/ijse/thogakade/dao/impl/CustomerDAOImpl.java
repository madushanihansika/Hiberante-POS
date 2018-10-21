/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.dao.impl;

import java.io.Serializable;
import lk.edu.ijse.thogakade.daoo.CustomerDAO;
import lk.edu.ijse.thogakade.entity.Customer;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public class CustomerDAOImpl implements CustomerDAO{

    private Session session;
    @Override
    public boolean addCustomer(Customer cutomer) throws Exception {
        Serializable save=session.save(cutomer);
        if(save !=null){
            return true;
        }else{
            return  false;
        }
    }

    @Override
    public void setSession(Session session) {
        this.session=session;
    }
    
}
