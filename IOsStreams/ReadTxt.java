package com.rays.IOsStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTxt {
public static void main(String[] args) throws Exception {
	FileReader in = new FileReader("C:\\Users\\chouh\\Desktop\\gt.txt");
	int ch = in.read();
	while (ch != -1){
		System.out.println((char)ch);{
ch = in.read();
		}
		in.close();
		
	}
	
}
}
