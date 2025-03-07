import java.util.Scanner;
import java.util.Arrays;
class Anagram{

    public static String checkAnagram(String str1, String str2){
     //1 convert string into array of character;
         char[] strArray1 = str1.toCharArray();
         char[] strArray2 = str2.toCharArray();

     //2. if length of both array is not equal then it is not anagram
         if(strArray1.length!=strArray2.length){
           return "False";
         } 
     //3.sort the both array    
         Arrays.sort(strArray1);
         Arrays.sort(strArray2);

     //4.check the every element of first array with second array
         for(int i=0; i<strArray1.length; i++){
            if(strArray1[i]!=strArray2[i]){
               return "False";
            }
         } 
         return "True";
    }

    public static void main(String[] args) {

             //get the input from user using scanner class
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter First  string:");
             String str1 = sc.nextLine();
             System.out.println("Enter Second  string:");
             String str2 = sc.nextLine();


            System.out.println(checkAnagram(str1,str2));
  }
}