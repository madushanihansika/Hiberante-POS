/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.service.impl;

import java.util.List;
import lk.edu.ijse.thogakade.dao.impl.ItemDAOImpl;
import lk.edu.ijse.thogakade.daoo.ItemDAO;
import lk.edu.ijse.thogakade.dto.ItemDTO;
import lk.edu.ijse.thogakade.entity.Item;
import lk.edu.ijse.thogakade.services.ItemService;
import lk.edu.ijse.thogakade.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author USER
 */
public class ItemServiceImpl implements ItemService{

    ItemDAO itemDAO=new ItemDAOImpl();
    @Override
    public boolean saveItem(Item item) throws Exception {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();      
            itemDAO.setSession(session);
            boolean result=itemDAO.addItem(item);
            if(result){
                tr.commit();
                return true;
            }else{
                tr.rollback();
                return false;
            }
            
        }catch(HibernateException ex){
            ex.printStackTrace();
            tr.rollback();
            return false;
        }finally{
            session.close();
        }
    }

    @Override
    public ItemDTO getItemByDescription(String name) throws Exception {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();      
            itemDAO.setSession(session);
            ItemDTO itemDTO=itemDAO.searchItem(name);
            if(itemDTO!=null){
                tr.commit();
                return itemDTO;
            }else{
                tr.rollback();
                return null;
            }
            
        }catch(HibernateException ex){
            ex.printStackTrace();
            tr.rollback();
            return null;
        }finally{
            session.close();
        }
    }

    @Override
    public List<ItemDTO> viewItems() throws Exception {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();      
            itemDAO.setSession(session);
            List<ItemDTO> itemDTOs=itemDAO.viewItems();
            if(itemDTOs!=null){
                tr.commit();
                return itemDTOs;
            }else{
                tr.rollback();
                return null;
            }
            
        }catch(HibernateException ex){
            ex.printStackTrace();
            tr.rollback();
            return null;
        }finally{
            session.close();
        }
    
    }

    @Override
    public boolean updateItem(Item item) throws Exception {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();      
            itemDAO.setSession(session);
            boolean result=itemDAO.updateItem(item);
            if(result){
                tr.commit();
                return true;
            }else{
                tr.rollback();
                return false;
            }
            
        }catch(HibernateException ex){
            ex.printStackTrace();
            tr.rollback();
            return false;
        }finally{
            session.close();
        }
    }

    @Override
    public boolean deleteItem(String id) throws Exception {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();      
            itemDAO.setSession(session);
            boolean result=itemDAO.deleteItem(id);
            if(result){
                tr.commit();
                return true;
            }else{
                tr.rollback();
                return false;
            }
            
        }catch(HibernateException ex){
            ex.printStackTrace();
            tr.rollback();
            return false;
        }finally{
            session.close();
        }
    }

}
