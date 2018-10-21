/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.service.impl;

import java.util.List;
import lk.edu.ijse.thogakade.dao.impl.CustomerDAOImpl;
import lk.edu.ijse.thogakade.dao.impl.ItemDAOImpl;
import lk.edu.ijse.thogakade.dao.impl.OrderDAOImpl;
import lk.edu.ijse.thogakade.dao.impl.OrderDetailDAOImpl;
import lk.edu.ijse.thogakade.daoo.CustomerDAO;
import lk.edu.ijse.thogakade.daoo.ItemDAO;
import lk.edu.ijse.thogakade.daoo.OrderDAO;
import lk.edu.ijse.thogakade.daoo.OrderDetailDAO;
import lk.edu.ijse.thogakade.dto.CashierDTO;
import lk.edu.ijse.thogakade.dto.OrderDetailDTO;
import lk.edu.ijse.thogakade.entity.Customer;
import lk.edu.ijse.thogakade.entity.Item;
import lk.edu.ijse.thogakade.entity.OrderDetail;
import lk.edu.ijse.thogakade.entity.OrderDetail_PK;
import lk.edu.ijse.thogakade.entity.Orders;
import lk.edu.ijse.thogakade.services.CashireServices;
import lk.edu.ijse.thogakade.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;




/**
 *
 * @author USER
 */
public class ChashierServiceImpl implements CashireServices{

    ItemDAO itemDAO=new ItemDAOImpl();
    CustomerDAO customerDAO=new CustomerDAOImpl();
    OrderDAO  ordersDAO=new OrderDAOImpl();
    OrderDetailDAO orderDetailDAO=new OrderDetailDAOImpl();
    @Override
    public boolean placeOrder(CashierDTO cashierDTO) throws Exception {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = null;
        try {
            tr = session.beginTransaction();
            customerDAO.setSession(session);
            Customer c = new Customer();
            c.setCid(cashierDTO.getCustomerDTO().getCid());
            c.setName(cashierDTO.getCustomerDTO().getName());
            c.setAddress(cashierDTO.getCustomerDTO().getAddress());
            c.setContact(cashierDTO.getCustomerDTO().getAddress());
            c.setContact(cashierDTO.getCustomerDTO().getContact());
            
            boolean result1 = customerDAO.addCustomer(c);
            
            ordersDAO.setSession(session);
            Orders o=new Orders();
            o.setOid(cashierDTO.getOrderDTO().getOid());
            o.setDate(cashierDTO.getOrderDTO().getDate());
            o.setPriority(cashierDTO.getOrderDTO().getPriority());
            o.setCustomer(c);
            
            boolean result2 = ordersDAO.addOrder(o);
            
            orderDetailDAO.setSession(session);
            itemDAO.setSession(session);
            List<OrderDetailDTO> orderlist;
            orderlist = cashierDTO.getOrderdetaillist();
            boolean result3=false;
            boolean result4=false;
            for (OrderDetailDTO orderDTO : orderlist) {
                Item item=new Item();
                item.setItemId(orderDTO.getItemDTO().getItemId());
                item.setDescription(orderDTO.getItemDTO().getDescription());
                item.setQty_on_hand(orderDTO.getItemDTO().getQty_on_hand());
                item.setUnitprice(orderDTO.getItemDTO().getUnitprice());
                
                result4=itemDAO.updateItem(item);
                
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setOrder_qty(orderDTO.getOrder_qty());
                orderDetail.setUnitprice(orderDTO.getUnitprice());
                orderDetail.setItem(item);
                orderDetail.setOrder(o);
                orderDetail.setOrderDetail_PK(new OrderDetail_PK(item.getItemId(),o.getOid()));
                result3 = orderDetailDAO.addOrderDetail(orderDetail);
            }
            
            if (result1 && result2 && result3 && result4) {
                tr.commit();
                return true;
            } else {
                tr.rollback();
                return false;
            }

        } catch (HibernateException ex) {
            ex.printStackTrace();
            tr.rollback();
            return false;
        } finally {
            session.close();
        }
    
    }

    
}
