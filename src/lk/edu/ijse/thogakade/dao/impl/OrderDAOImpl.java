/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.dao.impl;

import java.io.Serializable;
import lk.edu.ijse.thogakade.daoo.OrderDAO;
import lk.edu.ijse.thogakade.entity.Customer;
import lk.edu.ijse.thogakade.entity.Orders;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public class OrderDAOImpl implements OrderDAO{

    private Session session;
    @Override
    public boolean addOrder(Orders orders) throws Exception {
        Serializable save=session.save(orders);
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
