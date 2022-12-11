package week2.day5;

public class ReverseEvenWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] splitText=test.split(" ");
		String test1="";
	    for (int i = 0; i < splitText.length; i++) {
	    	String word=splitText[i];
    		String word2="";
	    	if (i%2!=0) {
				for (int j =word.length()-1 ; j >=0 ; j--) {
					word2 = word2 + word.charAt(j);
				}
	    	}
				else {
					for (int j2 = 0; j2 < word.length(); j2++) {
						word2 = word2 + word.charAt(j2);
					}
				}
			
	    	 test1 = test1 + word2 + " ";
	    	}
	    System.out.println(test1);
	    }
	    
	  
	}

