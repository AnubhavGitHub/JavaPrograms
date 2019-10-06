/**
 * 
 */
package javaBasicsPgms;

import java.util.LinkedHashSet;

/**
 * @author abhay
 *
 */
public class RemoveDuplicateCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="anuabbsdb";
		char []ch=str.toCharArray();
		
		LinkedHashSet<Character> wordwithoutDuplicates=new LinkedHashSet<Character>();
		
		for(Character c:ch)
		{
			wordwithoutDuplicates.add(c);
		}
		System.out.println(wordwithoutDuplicates);
		
//		StringBuilder finalOutput=new StringBuilder();
//		for(Character ch1:wordwithoutDuplicates)
//		{
//			finalOutput.append(ch1);
//		}
//		System.out.println(finalOutput.toString());
		
		StringBuffer finalOutput=new StringBuffer();
		for(Character ch1:wordwithoutDuplicates)
		{
			finalOutput.append(ch1);
		}
		System.out.println(finalOutput);
		//System.out.println(finalOutput.toString());
		

	}

}
