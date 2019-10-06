/**
 * 
 */
package javaBasicsPgms;

/**
 * @author abhay
 *
 */
public class ReverseEachWordofString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Anubhav is a boy";
		String []words=str.split(" ");
		String reverseString="";
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			System.out.println(word);
			String reverseword="";
			//Reverse each word here logic
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword=reverseword+word.charAt(j);
				
			}
			System.out.println(reverseword);
			reverseString=reverseString+reverseword+" ";
		}
		System.out.println(reverseString);
		

	}

}
