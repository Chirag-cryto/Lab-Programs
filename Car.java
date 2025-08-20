package cjchiraglab2;

public class Car {
      private String brand;
      private String model;
      private double price;
      private double mileage;
      private String ownerName;
      
      private static int totalCars;
      private static String showroomName = "one and only";
      
      public Car (String b, String m, double p, double mil)
      {
    	  brand = b;
    	  model = m;
    	  price = p;
    	  mileage = mil;
    	  ownerName = "Conor";
    	  totalCars++;
      }
      
      public Car(String b, String m, double p, double mil, String owner)
      {
    	  brand = b;
    	  model = m;
    	  price = p;
    	  mileage = mil;
    	  this.ownerName = owner;
    	  totalCars++;
      }
      
      public String getOwnerName() {
    	  return ownerName;
      }
      
      public void setOwnerName(String owner) {
    	  ownerName = owner;
      }
      
      public void displaydetails() {
    	  System.out.println("Brand: "+this.brand);
    	  System.out.println("Model: "+this.model);
    	  System.out.println("Price: "+this.price);
    	  System.out.println("Mileage: "+this.mileage);
    	  System.out.println("Owner: "+this.ownerName);
      }
      
      public void updatePrice(double newPrice) {
    	  price = newPrice;
 
      }
      
      public static void showTotalCars() {
    	  System.out.println("Total Cars: "+ totalCars);
      }
      
      public static void showShowroomName() {
    	  System.out.println("Showroom: "+showroomName);
      }
}
