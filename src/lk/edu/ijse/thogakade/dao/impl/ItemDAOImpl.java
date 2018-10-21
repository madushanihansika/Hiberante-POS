/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.thogakade.daoo.ItemDAO;
import lk.edu.ijse.thogakade.dto.ItemDTO;
import lk.edu.ijse.thogakade.entity.Item;
import org.hibernate.Session;



/**
 *
 * @author USER
 */
public class ItemDAOImpl implements ItemDAO{

    private Session session;
    @Override
    public boolean addItem(Item item) throws Exception {
        Serializable save=session.save(item);
        if(save !=null){
            return true;
        }else{
            return  false;
        }
    }

    @Override
    public ItemDTO searchItem(String name) throws Exception {
        Item item=(Item) session.createQuery("from Item where description='"+name+"'").list().get(0);
        ItemDTO itemDTO=new ItemDTO(item.getItemId(),name,item.getQty_on_hand(),item.getUnitprice());
        if(item !=null){
            return itemDTO;
        }else{
            return null;
        }
    }

    @Override
    public List<ItemDTO> viewItems() throws Exception {
        List<Item> itemlist=session.createQuery("from Item").list();
        List<ItemDTO> itemDTOs=new ArrayList<>();
        for (Item item : itemlist) {
            ItemDTO idto=new ItemDTO();
            idto.setItemId(item.getItemId());
            idto.setDescription(item.getDescription());
            idto.setQty_on_hand(item.getQty_on_hand());
            idto.setUnitprice(item.getUnitprice());
            itemDTOs.add(idto);
        }
        if(itemDTOs !=null){
            return itemDTOs;
        }else{
            return null;
        }    }

    @Override
    public boolean updateItem(Item item) throws Exception {
        if(item!=null){
            session.update(item);
            return true;
        }else{
            return  false;
        }
    }

    @Override
    public boolean deleteItem(String id) throws Exception {
        Item item = (Item) session.get(Item.class, id);
        if(item!=null){
            session.delete(item);
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
