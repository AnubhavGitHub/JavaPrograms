/**
 * 
 */
package javaBasicsPgms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author abhay
 *
 */
public class Compare2Files {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br1=new BufferedReader(new FileReader("/Users/abhay/Downloads/1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("/Users/abhay/Downloads/1 copy.txt"));
		
		boolean isEqual=true;
		int lineNum=1;
		
		String line1=br1.readLine();
		String line2=br2.readLine();
		
		while(line1!=null || line2!=null)
		{
			if(line1==null || line2==null)
			{
				isEqual=false;
				break;
			}
			else if(!line1.equalsIgnoreCase(line2))
			{
				isEqual=false;
				break;
			}
			line1=br1.readLine();
			line1=br2.readLine();
			lineNum++;
			
		}
		
		if(isEqual)
		{
			System.out.println("content Same");
		}
		else
		{
			System.out.println("content Diff");
		}

	}

}
