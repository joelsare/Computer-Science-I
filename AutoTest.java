public class AutoTest {
   
   public static void main (String[] args) {
      //Auto(Model, milesDriven, gallonsOfGas)

      Auto c = new Auto ("Ford", 1203, 31);
      
      System.out.printf("Model: %s\nMiles driven: %d\nGallons of gas: %.1f\n\n", 
      c.getModel(), c.getMilesDriven(), c.getGallonsOfGas());
      
      c.setModel("Hyundai");
      c.setMilesDriven(5312);
      c.setGallonsOfGas(25);
      
      System.out.printf("New model: %s\nNew miles driven: %d\nNew gallons of gas: %.1f\n\n", 
      c.getModel(), c.getMilesDriven(), c.getGallonsOfGas());
      
      System.out.println("MPG: " + c.calcMPG());
      
      System.out.println(Auto.getCount());
   }
}