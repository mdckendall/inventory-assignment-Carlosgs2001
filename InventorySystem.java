import java.util.ArrayList;

public class InventorySystem {

    ArrayList<Inventory> Inventory = new ArrayList<>();

    public void addProduct(Inventory producta) {
        Inventory.add(producta);
    }

    public void printArr() {
        int x = 1;
        for (int i = 0; i < Inventory.size(); i++) {

            System.out.println("Product # " + x + " Name:" + Inventory.get(i).getName());
            System.out.println("Serial Number:" + Inventory.get(i).getSerialNumber());
            System.out.println("Value:" + Inventory.get(i).getValue());
            x++;
        }
    }
    public boolean remove(String sNumber) {
        for (int i = 0; i < Inventory.size(); i++) {
            if (Inventory.get(i).getSerialNumber().equals(sNumber)==true) {
         
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
