package com.scp.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadCount {

	public static void main(String[] args) throws IOException 
	{
	File file= new File("F:\\software\\java\\AmarRepo\\Basics\\src\\com\\scp\\basic\\abc.txt");
	FileReader fReader= new FileReader(file);
	BufferedReader bReader= new BufferedReader(fReader);
	
	String line=null;
	int LineCount=0;
	int charCount=0;
	int countOfWords=0;
	while ((line=bReader.readLine() )!= null)
	{
		//line=bReader.readLine();
		LineCount++;
		if(!(bReader.readLine().equals("")))
		{
			charCount+=bReader.readLine().length();
			String[] wordCount= line.split("");
			System.out.println(wordCount);
			countOfWords=wordCount.length;
		}
	}
	System.out.println("No of Lines-- "+LineCount);
	System.out.println("No of Characters-- "+charCount);
	//System.out.println(bReader.readLine());
	
	
	}

}
 