/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.daoo;

import lk.edu.ijse.thogakade.entity.OrderDetail;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public interface OrderDetailDAO {
    public boolean addOrderDetail(OrderDetail orderDetail)throws Exception;
    
    public void setSession(Session session);
}
