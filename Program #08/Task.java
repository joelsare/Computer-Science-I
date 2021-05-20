// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.  

public class Task {
   private String task;
   private int priority;
   private static boolean order;
   
   public Task () {
      task = "none";
      priority = 1;
      order = true;
   }
   
   public Task (String t, int p) {
      if (t != "")
         task = t;
      else
         task = "none";
      if (p >= 1 && p <= 5)
         priority = p;
      else
         priority = 1;;
      order = true;
   }
   
   public String getTask () {
      return task;
   }
   
   public int getPriority () {
      return priority;
   }
   
   public void setTaskIDC (String t) {
      task = t;
   }
   
   public void setTask (String t) {
      if (t != "")
         task = t;
   }
   
   public void setPriority (int p) {
      if (p >= 1 && p <= 5)
         priority = p;
   }
   
   public static boolean getOrder () {
      return order;
   }
   
   public static void setOrder (boolean o) {
      order = o;
   }
   
   @Override
   public String toString () {
      return String.format("%s : %d", task, priority);
   }
   
   @Override
   public boolean equals (Object o) {
      boolean result = false;
      if (o instanceof Task) {
         Task other = (Task) o;
         if (this.getTask().equalsIgnoreCase(other.getTask())
               && this.getPriority() == other.getPriority()) {
            result = true;
         }
      }
      return result;
   }
}