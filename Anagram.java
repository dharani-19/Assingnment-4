package week2.day5;

import java.util.Arrays;
import java.util.Iterator;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
	      int length  = text1.length();
	      //System.out.println(length);
	      char [] charArray = text1.toCharArray();
	      //System.out.println(charArray);
	      Arrays.sort(charArray);
	      int length1  = text2.length();
	      //System.out.println(length1);
	      char [] charArray1 = text2.toCharArray();
	    		  //System.out.println(charArray1);
	    		  Arrays.sort(charArray1);
	    		  if (Arrays.equals(charArray, charArray1)) {
	    		         System.out.println("same");
	    		      } else {
	    		         System.out.println(" not same");
	    		      }

	}
	
		
	}


