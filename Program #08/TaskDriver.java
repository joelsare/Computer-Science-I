// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.  

import java.util.Scanner;
public class TaskDriver {

   public static void main (String[] args) {
   
      Scanner get = new Scanner(System.in);
      int ans = 0;
      String task;
      int priority;
      Task newTask = new Task();
      TaskList a = new TaskList();
      int orderNum;
      int deleteNum;
      
      while (ans != 8) {
         System.out.println("1. Print the task list\n"
            + "2. Print the number of tasks\n"
            + "3. Add a task\n"
            + "4. Remove a task (based on position)\n"
            + "5. Print the next task to be done\n"
            + "6. Sort the tasks by priority\n"
            + "7. Change the priority scale\n"
            + "8. Quit");
         System.out.print("Enter choice: ");
         ans = get.nextInt();
         get.nextLine();
         
         switch (ans) {
            case 1:
               System.out.println("Task list is:\n" + a);
               break;
            case 2:
               System.out.print("Number of tasks: " + a.getCount() + "\n");
               break;
            case 3:
               System.out.println("Enter task");
               task = get.nextLine();
               do {
                  System.out.println("Enter priority (1-5)");
                  priority = get.nextInt();
               } while (priority < 1 || priority > 5);
               newTask = new Task(task, priority);
               a.addTask(newTask);
               break;
            case 4:
               System.out.println("Here is the list of tasks");
               System.out.println(a);
               System.out.println("Enter a number of tasks to delete");
               deleteNum = get.nextInt();
               a.deleteTask(deleteNum - 1);
               break;
            case 5:
                  System.out.println("The next task to be done is " + a.next() );
               break;
            case 6:
               Task [] sortedList = a.sort();
               System.out.println("Sorted tasks are:");
               for (int i = 0; i < sortedList.length; i++) {
                  System.out.println(sortedList[i]);
               }
               break;
            case 7:
               System.out.println("Enter 1 to make 1 highest priority, "
                  + "anything else will make 5 highest priority.");
               orderNum = get.nextInt();
               if (orderNum == 1)
                  Task.setOrder(true);
               else
                  Task.setOrder(false);
               break;
         }
      }
   }
}