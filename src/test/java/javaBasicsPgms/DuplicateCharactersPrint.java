/**
 * 
 */
package javaBasicsPgms;

import java.util.HashMap;
import java.util.Set;

/**
 * @author abhay
 *
 */
public class DuplicateCharactersPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Anuaaabbhavkumar";
		char [] ch=str.toCharArray();
		System.out.println(ch);
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char chars:ch)
		{
			if(map.containsKey(chars)){
				map.put(chars, map.get(chars)+1);
		}
		else
		{
			map.put(chars, 1);
		}
			//System.out.println(map);
	}
		
		System.out.println(str +":::" +map);
//		
//		Set<Character> s=map.keySet();
//		for(Character ch1:s)
//		{
//			if(map.get(ch1)>1)
//			{
//				System.out.println(ch1 +""+ map.get(ch1));
//			}
//			
//		}
		
		


	}}
