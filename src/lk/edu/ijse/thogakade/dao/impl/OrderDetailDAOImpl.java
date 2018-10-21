/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.dao.impl;

import java.io.Serializable;
import lk.edu.ijse.thogakade.daoo.OrderDetailDAO;
import lk.edu.ijse.thogakade.entity.OrderDetail;
import org.hibernate.Session;


/**
 *
 * @author USER
 */
public class OrderDetailDAOImpl implements OrderDetailDAO{

    private Session session;
    @Override
    public boolean addOrderDetail(OrderDetail orderDetail) throws Exception {
        Serializable save=session.save(orderDetail);
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
