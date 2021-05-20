public class Test {
     
   public static void main (String[] args) {
      
      Task[] tasks = {new Task("hey", 2)};
      TaskList TL = new TaskList(tasks);
      TL.deleteTask(1);      
      
   }
}