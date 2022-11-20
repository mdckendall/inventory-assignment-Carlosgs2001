 class Product {
 private String name;
 private String SerialNumber;
 private int value;
   
    public Product(String name, String SerialNumber, int value){
    this.name = name;
    this.SerialNumber = SerialNumber;
    this.value = value;
  }
   public Product(){
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