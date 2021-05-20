public class Auto {
   /**
   * Private The name of the Auto object 
   */
   private String model;
   private int milesDriven;
   private double gallonsOfGas;
   private static int countAutos;
   
   public Auto () {
      setModel("N/A");
      countAutos++;
   }
   public Auto (String a, int b, double c) {
      setModel(a);
      setMilesDriven(b);
      setGallonsOfGas(c);
      countAutos++;
   }
   public String getModel() {
      return model;
   }
   public int getMilesDriven() {
      return milesDriven;
   }
   public double getGallonsOfGas() {
      return gallonsOfGas;
   }
   public void setModel (String newModel) {
      model = newModel;
   }
   public void setMilesDriven (int newMilesDriven) {
      if (newMilesDriven >= 0) {
         milesDriven = newMilesDriven;
      }
      else {
         System.out.println("Miles cannot be "
            + "negative\nValue not changed");
      }
   }
   public void setGallonsOfGas (double newGal) {
      if (newGal >= 0) {
         gallonsOfGas = newGal;
      }
      else {
         System.out.println("Gallons cannot be "
            + "negative\nValue not changed");
      }
   }
   public double calcMPG() {
      double mpg = 0.0;
      if (getGallonsOfGas() > 0) {
         mpg = getMilesDriven() / getGallonsOfGas();
      }
      return mpg;
   }
   @Override
   public String toString() {
      String result;
      result = String.format("%s (%d miles driven, %.2f gallons of gas)", getModel(), getMilesDriven(), getGallonsOfGas() );
      return result;
   }
   @Override
   public boolean equals (Object other) {
      boolean result = false;
      if (other instanceof Auto) {
         Auto o = (Auto) other;
         if (this.getModel().equals(o.getModel())) {
            result = true;
         }
      }
      return result;
   }
   private static void updateCount() {
      countAutos++;
   }
   public static int getCount() {
      return countAutos; 
   }
}