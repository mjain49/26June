package com.cg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
	public static void FileReader(File f) throws FileNotFoundException
	{
	String line;
	int c=1;
	try
	{
		FileInputStream fis=new FileInputStream(f);
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		while((line=br.readLine())!=null)
		{
			System.out.println(c+" "+line);
			c++;
		}
	}catch(IOException e)
	{
		e.printStackTrace();
	}
		
		
	}
	public static void main(String[] args) throws FileNotFoundException
	{
		File f=new File("D:\\source.txt");
		FileReader(f);
	}
}
