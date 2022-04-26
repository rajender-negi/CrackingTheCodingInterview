/*
Book: Cracking the coding interview
Topic: Arrays & Strings
Question 2: Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 */

public class CheckPermutation {
    public static void main(String args[])
    {
        String first="google";
        String second="gog"; // case of permutation
        //String second="got"; // case of no permutation
        for(char cs: second.toCharArray())
        {
            boolean check=false;
            for (char cf: first.toCharArray())
            {
                System.out.println("char from second string "+cs);
                System.out.println("char from first string "+cf);
                if(cs==cf)
                {
                    check=true;
                    break;
                }
            }
            if(!check)
            {
                System.out.println("no permutation");
                return;
            }
        }
        System.out.println("permutation");
    }
}
