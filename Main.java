import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  private String name;
  private String SerialNumber;
  private int value;

  public Inventory(String name, String SerialNumber, int value) {
    this.name = name;
    this.SerialNumber = SerialNumber;
    this.value = value;
  }

  public Inventory() {
    this.name = new String();
    this.SerialNumber = new String();
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

class InventorySystem {

  ArrayList<Inventory> Inventory = new ArrayList<>();

  public void addProduct(Inventory producta) {
    Inventory.add(producta);
  }

  public void printArr() {
    int x = 1;
    for (int i = 0; i < Inventory.size(); i++) {

      System.out.println(
          Inventory.get(i).getName() + "," + Inventory.get(i).getSerialNumber() + "," + Inventory.get(i).getValue());
      x++;
    }
  }

  public boolean remove(String sNumber) {
    for (int i = 0; i < Inventory.size(); i++) {
      if (Inventory.get(i).getSerialNumber().equals(sNumber) == true) {

        Inventory.remove(i);

        return true;
      }
    }
    return false;
  }

  public boolean update(String sNumber, String nameI, int nValue) {
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
    int aout = 0;
    int val=0;
    String serrialNumber = "";
    InventorySystem inventory = new InventorySystem();
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");
      int input = sc.nextInt();
      sc.nextLine();

      if (input == 1) {
        aout = input;
        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the serial number:");
        serrialNumber = sc.next();
        System.out.println("Enter the value in dollars (whole number):");
      val = sc.nextInt();
        sc.nextLine();
        Inventory product = new Inventory(name, serrialNumber, val);
        inventory.addProduct(product);
      }

      else if (input == 2) {
        aout = input;
        System.out.println("Enter the serial number of the item to delete:");
        serrialNumber = sc.next();
        inventory.remove(serrialNumber);
      }

      else if (input == 3) {
        aout = input;
        System.out.println("Enter the serial number of the item to change:");
        serrialNumber = sc.next();

        System.out.println("Enter the new name:");
        String nName = sc.nextLine();
        sc.next();
        System.out.println("Enter the new value in dollars (whole number):");
        val = sc.nextInt();
         sc.nextLine();
        inventory.update(serrialNumber, nName, val);
      }

      else if (input == 4) {
        aout = input;
        inventory.printArr();
      }

      aout = input;
    } while (aout != 5);

  }
}