public class OldDelete {
   public void deleteTask (int p) {
      p--;
      if (p == 0 && list.length == 1) {
         count = 0;
         list[0].setTaskIDC("");
      }
      else if (p >= 0 && p < list.length - 1) {
         if (list[p] != null) {
            Task[] newArray = new Task[list.length - 1];
            int a = 0;
            for (int i = 0; i < list.length; i++) {
               if (i == p) {
                  i++;
               }
               newArray[a++] = list[i];
            }
            list = new Task[newArray.length];
            for (int i = 0; i < list.length; i++) {
               list[i] = newArray[i];
            }
         }
         count = list.length;
      }
   }
   public TaskList (Task[] newList) {
      list = new Task[newList.length];
      for (int i = 0; i < newList.length; i++) {
         list[i] = new Task();
      }
      for (int i = 0; i < newList.length; i++ ) {
         list[i].setTask(newList[i].getTask());
         list[i].setPriority(newList[i].getPriority());
      }
      count = newList.length;
   } 
}