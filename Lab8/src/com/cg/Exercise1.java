package com.cg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise1 {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
		int sum=0;
		String n=br.readLine().trim();
		StringTokenizer st=new StringTokenizer(n," ");
		while(st.hasMoreTokens())
		{
			String temp = st.nextToken();
			sum=sum+Integer.parseInt(temp);
			System.out.println(temp);
		}
		System.out.println("sum= "+sum);
			
	}

}
