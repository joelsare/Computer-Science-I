// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.            

import java.util.Scanner;

public class GuessingGame{
   public static void main (String[] args){
      Scanner i = new Scanner(System.in);
   
      System.out.println("Think of something. Now answer my questions.");
      System.out.println("Is it a living animal, living plant, or non-living thing?");
      String ans = i.nextLine().toLowerCase();
   
      switch (ans) {//begining of main switch
         case "living animal":
            System.out.println("Does it have feathers, fur, or neither?");
            ans = i.nextLine().toLowerCase();
            switch (ans) {//beginning of feathers fur neither switch
               case "feathers":
                  System.out.println("Is it bigger than a soccer ball?");
                  ans = i.nextLine().toLowerCase();
                  switch (ans) {//beginning of soccer ball switch
                     case "yes":
                        System.out.println("Does it fly?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of does it fly switch
                           case "yes":
                              System.out.println("Does it hunt prey?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of hunt prey switch
                                 case "yes":
                                    System.out.println("Is it an eagle?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of eagle switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of eagle switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a vulture?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of vulture switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of vulture switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of hunt prey switch
                              break;
                           case "no":
                              System.out.println("Does it swim?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of does it swim switch
                                 case "yes":
                                    System.out.println("Is it a penguin?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of penguin switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of penguin switch
                                    break;
                                 case "no":
                                    System.out.println("Is it an ostrich?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of ostrich switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of ostrich switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of does it swim switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of does it fly switch
                        break;
                     case "no":
                        System.out.println("Does it eat meat?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of eat meat switch
                           case "yes":
                              System.out.println("Does it hunt at night?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of hunt at night switch
                                 case "yes":
                                    System.out.println("Is it an owl?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of owl switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of owl switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a falcon?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of falcon switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of falcon switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of hunt at night switch
                              break;
                           case "no":
                              System.out.println("Is it yellow?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of yellow switch
                                 case "yes":
                                    System.out.println("Is it a finch?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of finch switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of finch switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a cardinal?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of cardinal switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of cardinal switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of yellow switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of eat meat switch
                        break;
                     default:
                        System.out.println("Invalid response\nYou should try again");
                  }//end of soccer ball switch
                  break;
               case "fur":
                  System.out.println("Is it domesticated?");
                  ans = i.nextLine().toLowerCase();
                  switch (ans) {//beginning of is it domesticated switch
                     case "yes":
                        System.out.println("Is it bigger than a chair?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of bigger than chair switch
                           case "yes":
                              System.out.println("Can you ride it?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of can you ride it switch
                                 case "yes":
                                    System.out.println("Is it a horse?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of horse switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of horse switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a cow?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of cow switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of cow switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of can you ride it switch
                              break;
                           case "no":
                              System.out.println("Does it bark?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of bark switch
                                 case "yes":
                                    System.out.println("Is it a dog?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of dog switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of dog switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a cat?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of cat switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of cat switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of bark switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of bigger than a chair switch
                        break;
                     case "no":
                        System.out.println("Does it eat meat?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of eat meat switch
                           case "yes":
                              System.out.println("Does it hibernate?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of hibernate switch
                                 case "yes":
                                    System.out.println("Is it a bear?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of bear switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of bear switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a tiger?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of tiger switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of tiger switch
                                    break;
                                 default:
                                    System.out.println("Invalid respinse\nYou should try again");
                              }//end of hibernate switch
                              break;
                           case "no":
                              System.out.println("Does it have stripes?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of stripes switch
                                 case "yes":
                                    System.out.println("Is it a zebra?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of zebra switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of zebra switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a deer?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of deer switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of deer switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of stripes switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of eat meat switch
                        break;
                     default:
                        System.out.println("Invalid response\nYou should try again");
                  }//end of is it domesticated switch
                  break;
               case "neither":
                  System.out.println("Does it swim?");
                  ans = i.nextLine().toLowerCase();
                  switch (ans) {//beginning of does it swim switch
                     case "yes":
                        System.out.println("Is it a mammal?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of mammal switch
                           case "yes":
                              System.out.println("Is it bigger than a car?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of bigger than a car switch
                                 case "yes":
                                    System.out.println("Is it a whale?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of whale switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");      
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again"); 
                                    }//end of whale switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a dolphin?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of dolphin switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of dolphin switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of bigger than a car switch
                              break;
                           case "no":
                              System.out.println("Does it eat meat?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of does it eat meat switch
                                 case "yes":
                                    System.out.println("Is it a shark?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of shark switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of shark switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a clownfish?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of clownfish switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of clownfish switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of does it eat meat switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of mammal switch
                        break;
                     case "no":
                        System.out.println("Does it have legs?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of legs switch
                           case "yes":
                              System.out.println("Is it bigger than a soccer ball?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of bigger than a soccer ball switch
                                 case "yes":
                                    System.out.println("Is it a komodo dragon?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of komodo dragon switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of komodo dragon switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a chameleon?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of chameleon switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of chameleon switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of bigger than a soccer ball switch
                              break;
                           case "no":
                              System.out.println("Is it venomous?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of venomous switch
                                 case "yes":
                                    System.out.println("Is it a rattlesnake?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of rattlesnake switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of rattlesnake switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a rat snake?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of rat snake switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of rat snake switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of venomous switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of legs switch
                        break;
                     default:
                        System.out.println("Invalid response\nYou should try again");
                  }//end of does it swim switch
                  break;
               default:
                  System.out.println("Invalid response\nYou should try again");
            }//end of feathers fur neither switch
            break;
         case "living plant":
            System.out.println("Is it a tree?");
            ans = i.nextLine().toLowerCase();
            switch (ans) {//beginning of tree switch
               case "yes":
                  System.out.println("Is it deciduous?");
                  ans = i.nextLine().toLowerCase();
                  switch (ans) {//beginning of deciduous tree switch
                     case "yes":
                        System.out.println("Is it a fruit tree?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of fruit tree switch
                           case "yes":
                              System.out.println("Does it have orange fruit?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of orange fruit switch
                                 case "yes":
                                    System.out.println("Is it an orange tree?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of orange tree switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of orange tree switch
                                    break;
                                 case "no":
                                    System.out.println("Is it an apple tree?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of apple tree case
                                       case "yes":
                                          System.out.println("I am correct\nYou should play again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should play again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of apple tree case
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of orange fruit switch
                              break;
                           case "no":
                              System.out.println("Is it a weeping tree?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of weeping tree switch
                                 case "yes":
                                    System.out.println("Is it a willow tree?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of willow tree switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of willow tree switch
                                    break;
                                 case "no":
                                    System.out.println("Is it an oak tree?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of oak tree switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of oak tree switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of weeping tree switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of fruit tree switch
                        break;
                     case "no":
                        System.out.println("Is it native to N. America?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of N. America switch
                           case "yes":
                              System.out.println("Does it produce cones?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of cones switch
                                 case "yes":
                                    System.out.println("Is it a pine tree?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of pine tree
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of pine tree
                                    break;                          
                                 case "no":
                                    System.out.println("Is it an evergreen tree?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of evergreen switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of evergreen switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of cones switch
                              break;
                           case"no":
                              System.out.println("Does it have an enclosed seed?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of enclosed seed
                                 case "yes":
                                    System.out.println("Is it a cypress tree?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of cypress tree
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of cypress tree
                                    break;
                                 case "no":
                                    System.out.println("Is it a yew?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of yew switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of yew switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of enclosed seed
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of N. America switch
                        break;
                     default:
                        System.out.println("Invalid response\nYou should try again");
                  }//end of deciduous tree switch
                  break;
               case "no":
                  System.out.println("Does it have flowers?");
                  ans = i.nextLine().toLowerCase();
                  switch (ans) {//beginning of flower switch
                     case "yes":
                        System.out.println("Is it a fruit?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of fruit switch
                           case "yes":
                              System.out.println("Is it round?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of round switch
                                 case "yes":
                                    System.out.println("Is it a tomato plant?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of tomato plant
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of tomato plant
                                    break;
                                 case "no":
                                    System.out.println("Is it a squash plant?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of squash plant
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of squash plant
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of round switch
                              break;
                           case "no":
                              System.out.println("Does it have thorns?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of thorns switch
                                 case "yes":
                                    System.out.println("Is it a rose bush?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of rose bush
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of rose bush
                                    break;
                                 case "no":
                                    System.out.println("Is it a lily?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of lily switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of lily switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of thorns switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of fruit switch
                        break;
                     case "no":
                        System.out.println("Is it a vegetable?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of vegetable switch
                           case "yes":
                              System.out.println("Is it orange?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of orange switch
                                 case "yes":
                                    System.out.println("Is it a carrot plant?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of carrot plant switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of carrot plant switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a potato plant?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of potato plant switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of potato plant switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of orange switch
                              break;
                           case "no":
                              System.out.println("Does it have leaves?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of leaves switch
                                 case "yes":
                                    System.out.println("Is it a boxwood bush?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of boxwood bush switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of boxwood bush switch
                                    break;
                                 case "no":
                                    System.out.println("Is it grass?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of grass switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of grass switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of leaves switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of vegetable switch
                        break;
                     default:
                        System.out.println("Invalid response\nYou should try again");
                  }//end of flower switch
                  break;
               default:
                  System.out.println("Invalid response\nYou should try again");
            }//end of tree switch
            break;
         case "non-living thing":
            System.out.println("Is it man-made?");
               ans = i.nextLine().toLowerCase();
            switch (ans) {//beginning of is it man-made switch
               case "yes":
                  System.out.println("Is it furniture, textile, or electronic?");
                     ans = i.nextLine().toLowerCase();
                  switch (ans) {//beginning of furniture textile electronic switch
                     case "furniture":
                        System.out.println("Do you sleep on it?");
                           ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of sleep on it switch
                           case "yes":
                              System.out.println("Is it made for sitting?");
                                 ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of made for sitting switch
                                 case "yes":
                                    System.out.println("Is it a couch?");
                                          ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of couch switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of couch switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a bed?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of bed switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of bed switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of made for sitting switch
                              break;
                           case "no":
                              System.out.println("Is it made for sitting?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of made for sitting switch
                                 case "yes":
                                    System.out.println("Is it a chair?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of chair switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of chair switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a table?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of table switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of table switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of made for sitting switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of sleep on it switch
                        break;
                     case "textile":
                        System.out.println("Is it wearable?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of is it wearable switch
                           case "yes":
                              System.out.println("Does it go on your head?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of does it go on head switch
                                 case "yes":
                                    System.out.println("Is it a hat?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of hat switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of hat switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a coat?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of coat switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of coat switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of does it go on head switch
                              break;
                           case "no":
                              System.out.println("Does it go on the floor?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of on the floor switch
                                 case "yes":
                                    System.out.println("Is it a rug?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of rug switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of rug switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a blanket?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of blanket switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of blanket switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of on the floor switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of is it wearable switch
                        break;
                     case "electronic":
                        System.out.println("Does it prepare food?");
                        ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of prepare food switch
                           case "yes":
                              System.out.println("Does it cook a turkey?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of cook turkey switch
                                 case "yes":
                                    System.out.println("Is it an oven?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of oven switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of oven switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a toaster?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of toaster switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of toaster switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of cook turkey switch
                              break;
                           case "no":
                              System.out.println("Does it play music?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of music switch
                                 case "yes":
                                    System.out.println("Is it a radio?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of radio switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of radio switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a lamp?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of lamp switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of lamp switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of music switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of prepare food switch
                        break;
                     default:
                        System.out.println("Invalid response\nYou should try again");
                  }//end of furniture textile electronic switch
                  break;
               case "no":
                  System.out.println("Is it water based?");
                     ans = i.nextLine().toLowerCase();
                  switch (ans) {//beginning of water based switch
                     case "yes":
                        System.out.println("Is it fresh water?");
                           ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of fresh water switch
                           case "yes":
                              System.out.println("Is it still?");
                                 ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of is it still switch
                                 case "yes":
                                    System.out.println("Is it a lake?");
                                       ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of lake switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of lake switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a river?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of river switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of river switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of is it still switch
                              break;
                           case "no":
                              System.out.println("Is it frozen?");
                              ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of frozen switch
                                 case "yes":
                                    System.out.println("Is it an iceberg?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of iceberg switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of iceberg switch
                                    break;
                                 case "no":
                                    System.out.println("Is it an ocean?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of ocean switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of ocean switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of frozen switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of fresh water switch
                        break;
                     case "no":
                        System.out.println("Is it flat?");
                           ans = i.nextLine().toLowerCase();
                        switch (ans) {//beginning of flat switch
                           case "yes":
                              System.out.println("Is it near water?");
                                 ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of near water switch
                                 case "yes":
                                    System.out.println("Is it a beach?");
                                       ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of beach switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of beach switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a desert?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of desert switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of desert switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of near water switch
                              break;
                           case "no":
                              System.out.println("Does it have lava?");
                                 ans = i.nextLine().toLowerCase();
                              switch (ans) {//beginning of lava switch
                                 case "yes":
                                    System.out.println("Is it a volcano?");
                                    ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of volcano switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of volcano switch
                                    break;
                                 case "no":
                                    System.out.println("Is it a mountain?");
                                       ans = i.nextLine().toLowerCase();
                                    switch (ans) {//beginning of mountain switch
                                       case "yes":
                                          System.out.println("I am correct\nYou should try again");
                                          break;
                                       case "no":
                                          System.out.println("Oh, I am wrong\nYou should try again");
                                          break;
                                       default:
                                          System.out.println("Invalid response\nYou should try again");
                                    }//end of mountain switch
                                    break;
                                 default:
                                    System.out.println("Invalid response\nYou should try again");
                              }//end of lava switch
                              break;
                           default:
                              System.out.println("Invalid response\nYou should try again");
                        }//end of flat switch
                        break;
                     default:
                        System.out.println("Invalid response\nYou should try again");
                  }//end of water based switch
                  break;
               default:
                  System.out.println("Invalid response\nYou should try again");
            }//end of is it man-made switch
            break;
         default:
            System.out.println("Invalid response\nYou should try again");
      }//end of main switch
   }
}