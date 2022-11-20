import java.util.ArrayList;
import java.util.Scanner;


class Inventory{
  ArrayList <Product> Inventory = new ArrayList<>();
  

public void addProduct(Product producta){
  Inventory.add(producta);
}


public void printArr(){
    int x = 1;
for(int i=0;i<Inventory.size();i++){
  
   System.out.println("Product # "+ x +" Name:"+ Inventory.get(i).getName());
  System.out.println("Serial Number:" + Inventory.get(i).getSerialNumber());
  System.out.println("Value:" + Inventory.get(i).getValue());
  x++;
}
}

      
  
public boolean remove(String sNumber) {
        for (int i = 0; i < Inventory.size(); i++) {
            if (Inventory.get(i).getSerialNumber().equals(sNumber)) {
                Inventory.remove(i);
                return true;
            }
        }
        return false;
    }

  
public boolean update(String sNumber,String nameI, int nValue) {
        for (int i = 0; i < Inventory.size(); i++) {
            if (Inventory.get(i).getSerialNumber().equals(sNumber)) {
                Inventory.get(i).setName(nameI);
                Inventory.get(i).setValue(nValue);
                return true;
            }
        }
        return false;
    }
  

}


class Main {
	public static void main(String[] args) {
      int input = 0;
      String serrialNumber;
      Inventory inventory = new Inventory();
      Scanner scanner = new Scanner(System.in);
      do{
        System.out.println("Press 1 to add an item.");
        System.out.println("Press 2 to delete an item.");
        System.out.println("Press 3 to update an item.");
        System.out.println("Press 4 to show all the items.");
        System.out.println("Press 5 to quit the program.");
        input = scanner.nextInt();
        
        if(input == 1){
          System.out.println("Enter the name:");
          String name = scanner.next();
          System.out.println("Enter the serial number:");
          serrialNumber = scanner.next();
          System.out.println("Enter the value in dollars (whole number):");
          int value = scanner.nextInt();
          Product product = new Product(name, serrialNumber, value);
          inventory.addProduct(product);
        }
        
       else if(input == 2){
          System.out.println("Enter the serial number of the item to delete:");
        serrialNumber=scanner.next();
        inventory.remove(serrialNumber);   
        }
        
       else if(input == 3){
           System.out.println("Enter the serial number of the item to change:");
          serrialNumber=scanner.next();
         
          System.out.println("Enter the new name:");
          String nName;
          nName=scanner.next();
          System.out.println("Enter the new value in dollars (whole number):");
          int vValue;
          vValue=scanner.nextInt();
          inventory.update(serrialNumber, nName, vValue);
        } 
        
       else if(input == 4){
        inventory.printArr();  
        }
        
        
        
      }while(input !=5);
    
    
	}
}