import java.util.ArrayList;
import java.util.Scanner;

 class Inventory {
 private String name;
 private String SerialNumber;
 private int value;
   
    public Inventory(String name, String SerialNumber, int value){
    this.name = name;
    this.SerialNumber = SerialNumber;
    this.value = value;
  }
   public Inventory(){
    this.name = new String();
    this.SerialNumber =  new String();
    this.value = 0;
  }
        public void setName(String name) {
            this.name = name;
        }

        public void setSerialNumber(String SerialNumber) {
            this.SerialNumber = SerialNumber;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public String getSerialNumber() {
            return SerialNumber;
        }

        public int getValue() {
            return value;
        }


 
}

class Main {
	public static void main(String[] args) {
     int aout=0;
      String serrialNumber="";
      InventorySystem inventory = new InventorySystem();
      Scanner scanner = new Scanner(System.in);
      
      do{
        System.out.println("Press 1 to add an item.");
        System.out.println("Press 2 to delete an item.");
        System.out.println("Press 3 to update an item.");
        System.out.println("Press 4 to show all the items.");
        System.out.println("Press 5 to quit the program.");
        int input = scanner.nextInt();
        
        if(input == 1){
            aout=input;
          System.out.println("Enter the name:");
          String name = scanner.next();
          System.out.println("Enter the serial number:");
          serrialNumber = scanner.next();
          System.out.println("Enter the value in dollars (whole number):");
          int value = scanner.nextInt();
          Inventory product = new Inventory(name, serrialNumber, value);
          inventory.addProduct(product);
        }
        
       else if(input == 2){
            aout=input;
          System.out.println("Enter the serial number of the item to delete:");
        serrialNumber=scanner.next();
         inventory.remove(serrialNumber);   
        }
        
       else if(input == 3){
            aout=input;
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
            aout=input;
        inventory.printArr();  
        }
        
        
         aout=input;
      }while(aout !=5);
    
    
	}
}