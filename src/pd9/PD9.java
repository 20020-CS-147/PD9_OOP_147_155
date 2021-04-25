/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd9;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.WebParamMode;
import static com.oracle.xmlns.internal.webservices.jaxws_databinding.WebParamMode.IN;
import static com.oracle.xmlns.internal.webservices.jaxws_databinding.WebParamMode.OUT;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Balawal
 */
public class PD9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner reader= new Scanner(System.in); 
System.out.print("Enter a string: ");
String S= reader.nextLine();
MyString s1 = new MyString(S);
//int a = s1.wordCounter();
//int b=s1.countVowels();
//int c=s1.puncCount(); 
   //java.lang.String x=s1. stringEncryption();
   //java.lang.String f=s1.ridMultipleBlank();
 // java.lang.String d=s1.removeInteger();
 // java.lang.String v=s1. displayVertical();
System.out.println("The words are: "+s1.wordCounter());
System.out.println("The vovels are: "+s1.countVowels() );
System.out.println("The punctuation marks are "+s1.puncCount() );
System.out.println("The String without the numbers is "+s1.removeInteger() );
System.out.println("Your String Without the spaces is: "+s1.ridMultipleBlank());
System.out.println("The words are: "+wordCounter(S));
System.out.println("The vovels are: "+countVowels( S));
System.out.println("The punctuation marks are "+ puncCount (S));
System.out.println("Your String Printed vertically is");
//displayVertical(S);
System.out.println("Your String Without the spaces is: ");
String noSpaceStr = S.replaceAll("\\s", "");   
        System.out.println(noSpaceStr); 
 System.out.println("Your String Without the Numbers is: "+ removeInteger(S) );

System.out.println("The encrypted form is " );
 stringEncryption(S);
 
System.out.println("The word is found "+findSubString( S)  );
System.out.println("The encrypted form is "+s1. stringEncryption() );
System.out.println("The String Printed vertically is"+s1.displayVertical());


    }
   static  int wordCounter(String S){
      
        WebParamMode state = OUT;
        int word_counter = 0; 
        int i = 0;
         
        
        while (i < S.length())
        {
            
            if (S.charAt(i) == ' ' || S.charAt(i) == '\n'
                    || S.charAt(i) == '\t')
                state = OUT;
                 
      
            
            else if (state == OUT)
            {
                state = IN;
                ++word_counter;
            }
      
            // Move to next character
            ++i;
        }
        return word_counter;
    }
    static  boolean isVowel(char character)
    {
        character = Character.toUpperCase(character);
        return (character=='A' || character=='E' || character=='I' ||
                           character=='O' || character=='U');
    }
      
    // Returns count of vowels in str
     static int countVowels(String S)
    {
        int counter = 0;
        for (int i = 0; i < S.length(); i++)
            if (isVowel(S.charAt(i))) 
                ++counter;
        return counter;
    }
     static  int puncCount(String S){
            int Counter = 0;
              for (int i = 0; i < S.length(); i++) {  
                
            if(S.charAt(i) == '!' || S.charAt(i) == ',' || S.charAt(i) == ';' || S.charAt(i) == '.' ||        S.charAt(i) == '?' || S.charAt(i) == '-' ||  
                    S.charAt(i) == '\'' || S.charAt(i) == '\"' || S.charAt(i) == ':') {  
                Counter++;  
            } 
          
        }  
            
          
          return Counter;
      }
     static boolean findSubString(String S)
             
     {
      
		
		int intIndex = S.indexOf("The");
		if(intIndex == - 1) {
			System.out.println("The is found");
		} else {
			System.out.println("the is not founded  index "+ intIndex);
		}
        return false;
	
     }
        
static String displayVertical(String s){
 
    
    for (int i = 0; i < s.length(); i++) {
   System.out.println(s.charAt(i));
}
        return null;
    
       
      }
String ridMultipleBlank(String s){
       
    return s.replaceAll("\\s", "");
    
}
  public static String removeInteger(String str)
    {
        return str.replaceAll("\\d", "");
    }
static String stringEncryption(String s){
    
char[] chars=s.toCharArray();
for(char C:chars){
    C+=1;
    System.out.print(C);
}
        return s;
 

}
}
        
     


    
    
    

