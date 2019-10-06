/**
 * 
 */
package javaBasicsPgms;

/**
 * @author abhay
 *
 */
public class Swap2Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Anubhav";
		String str2="kumar";
		
		str1=str1+str2;
		System.out.println("str1"+str1);
		System.out.println("str2"+ str2);
		str2=str1.substring(0,str1.length()-str2.length());
		System.out.println("str1"+str1);
		System.out.println("str2"+ str2);
		str1=str1.substring(str2.length());
		System.out.println("str1"+str1);
		System.out.println("str2"+ str2);
		

	}

}
