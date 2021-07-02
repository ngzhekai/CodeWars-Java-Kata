/*
 --> Instructions <--
 Complete the solution so that it reverses the string passed into it.
 
'world'  =>  'dlrow'
*/

// <My Solution>

public class Kata {

  public static String solution(String str) {
    // Your code here...
    StringBuffer reverseStr = new StringBuffer(str).reverse();
    String newStr = reverseStr.toString();
    return newStr;
  }

}

// --> Best Solution <--

public class Kata {

  public static String solution(String str) {
    return new StringBuilder(str).reverse().toString();
  }

}

// --> Other Smart Solution <--

public class Kata {

  public static String solution(String str) {
    // Your code here...
    String newcad="";
    
    for(int i = str.length()-1; i >= 0; i--){
      newcad += str.charAt(i);
    }
    
    return newcad;
  }

}
