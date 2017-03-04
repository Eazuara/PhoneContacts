/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.ArrayList;
/**
 *
 * @author esteb
 */
public class mobilephone {
    private ArrayList<contacts>Contact;
    
    public mobilephone(){
        Contact=new ArrayList<contacts>();
    }
    public boolean addcontacts(contacts contacts){
        if(findcontacts(contacts.getName())== -1){
            
            Contact.add(contacts);
        return true;
        }
        return false;
    }
    public boolean addcontacts(String name,int number){
        return addcontacts(new contacts(name,number));
    }
    /*public contacts findcontacts(String name){
        for(contacts tempcontacts: Contact){
            if(tempcontacts.getName().equals(name)){
                return tempcontacts;
            }
        }
        return null;
    }*/
    public int findcontacts(String name){
        for(int i=0;i<Contact.size();i++){
            if(Contact.get(i).equals(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean removecontacts(contacts contacts){
        int pos=findcontacts(contacts.getName());
      if(findcontacts(contacts.getName())==-1){
          if(pos==-1){
              return false;
          }
          Contact.remove(pos);
          
      }
      return true;
    }
    public boolean removecontacts(String name,int number){
        return removecontacts(new contacts(name,number));
    }
    public boolean removecontacts(String name){
        return removecontacts(new contacts(name,123));
    }
    public boolean updatecontacts(contacts contacts){
        int pos=findcontacts(contacts.getName());
        if(pos==-1){
        return false;
    }
        Contact.get(pos).setName(contacts.getName());
        Contact.get(pos).setNumber(contacts.getNumber());
        return true;
    }
    public boolean updatecontacts(String name,int number){
        return updatecontacts(new contacts(name,number));
    }
    public void listcontacts(){
        for(contacts tempcontacts:Contact){
            System.out.println(tempcontacts.toString());
        }
    }
    public String querycontacts(String name){
    int pos = findcontacts(name);
    
    if(pos == -1){
        return "Contact not found";
        
    }else{
        return Contact.get(pos).toString();
    }
}

}

        
    

   
