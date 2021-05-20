// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.  

public class TaskList {
   public final int MAX = 20;
   private Task[] list;
   private int count;
   
   public TaskList () {
      list = new Task[0];
      for (int i = 0; i < list.length; i++) {
         list[i] = new Task();
         list[i].setTaskIDC("");
      }
   }
   
   public TaskList (Task[] newList) {
      list = new Task[newList.length];
      for (int i = 0; i < newList.length; i++) {
         list[i] = new Task(newList[i].getTask(), newList[i].getPriority());
      }
      count = list.length;
   }
   
   public int getCount () {
      return count;
   }
   
   public void addTask (Task t) {
      if (count < MAX) {
         Task[] newArray = new Task[list.length + 1];
         for (int i = 0; i < list.length; i++) {
            newArray[i] = list[i];
         }
         int len = list.length;
         list = new Task[newArray.length];
         for (int i = 0; i < newArray.length; i++) {
            list[i] = newArray[i];
         }
         list[len] = t;
      }
      count = list.length;
   }
   
   public void deleteTask (int p) {
      p--;
      int j = 0;
      if (p < count && p >= 0) {
         Task [] newArray = new Task[list.length-1];
         for (int i = 0; i < list.length; i++) {
            if (i != p) {
               newArray[j++] = list[i];
            }
         }
         list = newArray;
         count = newArray.length;
      }
   }
   
   public Task[] sort() {
      Task[] newArray = new Task[list.length];
         if (Task.getOrder()) {
            for (int i = 0; i < newArray.length; i++) {
               newArray[i] = list[i];
            }
            for ( int pass = 0; pass < list.length - 1; pass ++ ) {
               for ( int pos = 0; pos < list.length - 1; pos++ ) {
                  if ( newArray[pos].getPriority() > newArray[pos+1].getPriority() ) {
                     Task temp = newArray[pos];
                     newArray[pos] = newArray[pos+1];
                     newArray[pos+1] = temp;
                  }
               }
            }
         }
         else {
            for (int i = 0; i < newArray.length; i++) {
               newArray[i] = list[i];
            }
            for ( int pass = 0; pass < list.length - 1; pass ++ ) {
               for ( int pos = 0; pos < list.length - 1; pos++ ) {
                  if ( newArray[pos].getPriority() < newArray[pos+1].getPriority() ) {
                     Task temp = newArray[pos];
                     newArray[pos] = newArray[pos+1];
                     newArray[pos+1] = temp;
                  }
               }
            }
         }
      return newArray;
   }
   
   public Task next () {
         Task [] sortList;
         sortList = sort();
         return sortList[0];
   }
   
   public String toString () {
      String result = "";
      for (int i = 0; i < list.length; i++) {
         result += String.format("%d. %s : %d\n",
            i + 1, list[i].getTask(), list[i].getPriority() );
      }
      return result;
   }
   
   public boolean equals (Object o) {
      boolean areEqual = true;
      if (o instanceof TaskList) {
         TaskList other = (TaskList) o;
         if (this.getCount() != other.getCount() ){
            areEqual = false;
         }
         else {
            for (int i = 0; i < this.list.length; i ++) {
               if (!this.list[i].equals(other.list[i])) {
                  areEqual = false;
               }
            }
         }
      }
      return areEqual;
   }
}