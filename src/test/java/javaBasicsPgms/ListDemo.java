/**
 * 
 */
package javaBasicsPgms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abhay
 *
 */
public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>list=new ArrayList<String>();
		list.add("anubhav");
		list.add("Account");
		list.add("kumar");
		System.out.println(list);
		for(String s:list)
		{
			if(list.contains("Account"))
			{
			System.out.println(s);
			
			}
			break;
		}
	}

}
