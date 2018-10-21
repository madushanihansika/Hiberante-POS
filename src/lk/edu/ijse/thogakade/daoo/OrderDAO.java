/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.daoo;

import lk.edu.ijse.thogakade.entity.Orders;
import org.hibernate.Session;


/**
 *
 * @author USER
 */
public interface OrderDAO {
   public boolean addOrder(Orders orders)throws Exception;
    
    public void setSession(Session session);
}
