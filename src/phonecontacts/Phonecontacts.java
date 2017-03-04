/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.*;

/**
 *
 * @author esteb
 */
public class Phonecontacts {

    /**
     * @param args the command line arguments
     */
   // public static Scanner teclado=new Scanner(System.in);
    public static  mobilephone myphone=new mobilephone();
    
    public static void main(String[] args) {
      int option;
      
      
      printmenu();
      Scanner teclado=new Scanner (System.in);
      option=teclado.nextInt();
      while(option>0 && option<7){
          switch(option){
              case 1:
                  addcontacts();
                  break;
              case 2:
                  updatecontacts();
                  break;
              case 3:
                  break;
              case 4:
                  break;
              case 5:
                  break;
              case 6:
                  printmenu();
                  break;
              default:
                  break;
          }
          System.out.println("Select an option");
          option=teclado.nextInt();
          
      }
      
    
    }
    public static void printmenu(){
        System.out.println("Menu: ");
        System.out.println("0. Quit");
        System.out.println("1. Add");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Query");
        System.out.println("5. List Contacts");
        System.out.println("6. Print options");
        System.out.println("Option?");
    }
    public static void addcontacts(){
        String name;
        int number;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Contact name: ");
        name=teclado.next();
System.out.println("Telephone number: ");
        number=teclado.nextInt();
        
        
        if(myphone.addcontacts(name, number)){
            System.out.println("Contact Succesfully Added");
        }else{ System.out.println("Contact already on list");
        }
    }
    public static void updatecontacts(){
        String name;
        int number;
        Scanner teclado=new Scanner(System.in);
     
        name=teclado.nextLine();
          System.out.println("Contact name: ");
  
        number=teclado.nextInt();
                System.out.println("Telephone number: ");
        
        if(myphone.updatecontacts(name, number)){
            System.out.println("Updated");
            
            
        }else{ System.out.println("Contact not found");
}
        
}
   public static void deleteContact(){
  Scanner scanner = new Scanner(System.in);
    String name;
    int number; 
    System.out.println("Contact name: ");
    name=scanner.nextLine();
    System.out.println("Contact number: ");
    number=scanner.nextInt();
if(myphone.removecontacts(name,123)){
    System.out.println("Contact deleted");
    
    
}    else{
    System.out.println("Contact not found");
}
    
}

public static void queryContact(){
    Scanner scanner = new Scanner(System.in);
    String name;
    System.out.println("Contact name: ");
    name=scanner.nextLine();
  
    System.out.println(myphone.querycontacts(name));
    
    
}

public static void listAll(){
    myphone.listcontacts();
       
    
}
}
    

