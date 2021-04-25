/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd9;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.WebParamMode;
import static com.oracle.xmlns.internal.webservices.jaxws_databinding.WebParamMode.IN;
import static com.oracle.xmlns.internal.webservices.jaxws_databinding.WebParamMode.OUT;

/**
 *
 * @author Balawal
 */
public class MyString extends Strings {

    public MyString(String S) {
        super(S);
    }
      int wordCounter(){
      
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



  int puncCount(){
            int Counter = 0;
              for (int i = 0; i < S.length(); i++) {  
                
            if(S.charAt(i) == '!' || S.charAt(i) == ',' || S.charAt(i) == ';' || S.charAt(i) == '.' ||        S.charAt(i) == '?' || S.charAt(i) == '-' ||  
                    S.charAt(i) == '\'' || S.charAt(i) == '\"' || S.charAt(i) == ':') {  
                Counter++;  
            } 
          
        }  
            
          
          return Counter;
      }
  
  
  
      static boolean isVowel(char character)
    {
        character = Character.toUpperCase(character);
        return (character=='A' || character=='E' || character=='I' ||
                           character=='O' || character=='U');
    }
      
    // Returns count of vowels in str
     static int countVowels()
    {
        int counter = 0;
        for (int i = 0; i < S.length(); i++)
            if (isVowel(S.charAt(i))) 
                ++counter;
        return counter;
    }
  
  
  public  String removeInteger()
    {
        return S.replaceAll("\\d", "");
    }
  
  
  
  
  String ridMultipleBlank(){
       
    return S.replaceAll("\\s", "");
    
}
  
  
  
  
  
  
  static String stringEncryption(){
    
char[] chars=S.toCharArray();
for(char C:chars){
    C+=1;
    System.out.print(C);
}
        return S;
 

}
  
  
  
  
  
  
  
   String displayVertical(){
 
    
    for (int i = 0; i < S.length(); i++) {
   System.out.println(S.charAt(i));
}
        return null;
    
       
      }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}