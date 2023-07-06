package com.rays.IOsStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadByLine {
public static void main(String[] args) throws Exception {
	FileReader file = new FileReader("C:\\Users\\chouh\\Desktop\\io\\sK.txt");
	BufferedReader in = new BufferedReader(file);
	
	String line = in.readLine();
	
	while (line != null) {
System.out.println(line);
line = in.readLine();
	}
	in.close();
	
	
}
}
