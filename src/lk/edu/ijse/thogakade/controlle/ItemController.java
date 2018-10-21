/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakade.controlle;

import java.util.List;
import lk.edu.ijse.thogakade.dto.ItemDTO;


/**
 *
 * @author USER
 */
public interface ItemController {
    public boolean saveItem(ItemDTO itemDTO)throws Exception;
    
    public ItemDTO getItemByDescription(String name)throws Exception;
    
    public List<ItemDTO> viewItems() throws Exception;
    
    public boolean updateItem(ItemDTO itemDTO)throws Exception;
    
    public boolean deleteItem(String id)throws Exception;
}
