 
package com.mycompany.main_class;
import java.util.ArrayList; 
 
public class Inventory  {

private  ArrayList<Item> Allitems = new ArrayList<Item>(); 
    
void addItem(Item it){
        Allitems.add(it);
}

void removeItem(String  n){
  for (int i = 0; i < Allitems.size(); i++) {
      if(Allitems.get(i).getName() == n ){
      Allitems.remove(i);
      }
    }
}
    
void printInventory(){
    
for (int i = 0; i < Allitems.size(); i++) {
      System.out.println(Allitems.get(i).getName()+
              " "+Allitems.get(i).getPrice()+
              " "+Allitems.get(i).getQuantity() );
    }
}
    
    
}
