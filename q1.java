import java.util.*;

public class q1 {


     public static void main(String []args)
     {
     Boolean answer = allStringSetsIdentical(new String[][] {{"a","b"},{"b","b","a"},{"b","a"}});
     System.out.println(answer);

     answer = allStringSetsIdentical(new String[][] {{"a","b"},{"a"},{"b"}});
     System.out.println(answer);

     answer = allStringSetsIdentical(new String[][] {{"a","b","c"},{"a","d"},{"b","e"}});
     System.out.println(answer);
     
     answer = allStringSetsIdentical(new String[][] {{"a","b","c","c","d"},{"a","d"},{"b","e"}, {"a","b","c","d","e"}});
     System.out.println(answer);

     answer = allStringSetsIdentical(new String[][] {{"a","a","a","a","b"},{"b","a"},{"a","b","a"},{"a","b","b","a"}});
     System.out.println(answer);

     answer = allStringSetsIdentical(new String[][] {{"a"},{"e"}});
     System.out.println(answer);

     answer = allStringSetsIdentical(new String[][] {{"a"}});
     System.out.println(answer);
     }
     
     public static boolean allStringSetsIdentical(String[ ][ ] sets) { 
    
    HashSet<String> mySet1 = new HashSet<String>();
    HashSet<String> mySet2 = new HashSet<String>();


    for (int i = 0; i < sets[0].length; i++)
    {
         mySet1.add(sets[0][i]);
    }
    
    for (int i = 1; i < sets.length; i++)
    {
    for (int j = 0; j < sets[i].length; j++)
    {
        mySet2.add(sets[i][j]);
    }
        if((mySet1.retainAll(mySet2)) || (mySet2.retainAll(mySet1)))
        {
         return false;   
        }
    }
    return true;
     
    }
}
