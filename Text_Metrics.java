// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.

import java.util.Scanner;

public class Text_Metrics {
   public static void main (String [] args) {
      Scanner in = new Scanner (System.in);
      
      System.out.println("What is the total number of sentences in the first sapmple?");
      double sentences = in.nextInt();
      System.out.println("What is the total number of words in the first sample?");
      double words = in.nextInt();
      System.out.println("What is the number of \"big words\" in the first sample?");
      double bigWords1 = in.nextInt();
      System.out.println("What is the number of syllables in the first sample?");
      double syllables = in.nextInt();
      System.out.println("What is the number of \"big words\" in the second sample?");
      double bigWords2 = in.nextInt();
      
      //System.out.println("# of sentences: " + sentences);
      //System.out.println("# of words: " + words);
      //System.out.println("# of big words in first sample: " + bigWords1);
      //System.out.println("# of syllables: " + syllables);
      //System.out.println("# of  big words in second sample: " + bigWords2);
      
      double avgSentLength = words / sentences;
      double bigWordsPercent = (bigWords1 / words) * 100;
      double gunningFog = (avgSentLength + bigWordsPercent) * 0.4;
      //System.out.println(gunningFog);
      
      double avgSentLength2 = (words / sentences) * 1.015;
      double avgSyllable = (syllables / words) * 84.6;
      double readingEaseScore = 206.835 - (avgSentLength2 + avgSyllable);
      //System.out.println(readingEaseScore);
      
      double sqareRoot = Math.sqrt(bigWords2);
      double SMOG = Math.round(sqareRoot / 10);
      SMOG = (int) SMOG + 3;   
      //System.out.println(SMOG);
      
      System.out.println("The Gunning Fog Index of this sample is: " + gunningFog);
      System.out.println("The Reading Ease Score is: " + readingEaseScore);
      System.out.println("The SMOG index is: grade " + SMOG);
   }
}