import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    Stack<Character> st = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

    // if opening brackets push it

      if (ch == '{' || ch == '(' || ch == '[') { 
        st.push(ch);
      }

      else if (ch == '}') {
        boolean check = balcheck(st, '{');

        if (check == false) {
          System.out.println("false");
          return;
        }
      }

      else if (ch == ')') {
        boolean check = balcheck(st, '(');

        if (check == false) {
          System.out.println("false");
          return;
        }
      }

      else if (ch == ']') {
        boolean check = balcheck(st, '[');

        if (check == false) {
          System.out.println("false");
          return;
        }
      }


    }
     
    if(st.size() == 0){   // stack empty means no  extra parenthesis left 
        System.out.println("true");
        return;
    } 
    System.out.println("false"); // extra parenthesis at opening 
  }

  public static boolean balcheck(Stack<Character> st,char ch) {
    
// closing parenthesis is extra, no opening bracket is present for this
    if (st.size() == 0) {  
      return false; 
    }
// stack not empty but opening bracket doesn't match with closing bracket
    else if (st.peek() != ch) { 
      return false;
    }
// bracket match and pop the opening bracket

      st.pop();
      return true;
    
  }


}