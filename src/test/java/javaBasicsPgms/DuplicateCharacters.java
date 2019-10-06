/**
 * 
 */
package javaBasicsPgms;

import java.util.HashMap;

/**
 * @author abhay
 *
 */
public class DuplicateCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Anuaaabhavkumar";
		char [] ch=str.toCharArray();
		System.out.println(ch);
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char chars:ch)
		{
			if(map.containsKey(chars)){
				map.put(chars,map.get(chars)+1);
		}
		else
		{
			map.put(chars, 1);
		}
		}
		
		System.out.println(map);
		
		
		
		


	}}
