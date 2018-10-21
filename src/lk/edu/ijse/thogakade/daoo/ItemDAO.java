/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.daoo;

import java.util.List;
import lk.edu.ijse.thogakade.dto.ItemDTO;
import lk.edu.ijse.thogakade.entity.Item;
import org.hibernate.Session;



/**
 *
 * @author USER
 */
public interface ItemDAO {
    public boolean addItem(Item item)throws Exception;
    
    public ItemDTO searchItem(String name)throws Exception;
    
    public List<ItemDTO> viewItems()throws Exception;
    
    public boolean updateItem(Item item)throws Exception;
    
    public boolean deleteItem(String id)throws Exception;
    
    public void setSession(Session session);
}
