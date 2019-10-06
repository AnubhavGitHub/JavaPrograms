/**
 * 
 */
package javaBasicsPgms;

/**
 * @author abhay
 *
 */
public class SumOfAllDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,sum=0;
		int num=38387;
		while(num!=0)
		{
			rem=num%10; //7		//8
			sum=sum+rem; //0+7	//0+7+8
			num=num/10;//3838	//383
		}
		System.out.println(sum);

	}

}
