package com.rays.IOsStreams;

import java.io.FileReader;

public class ReadTextFile {
public static void main(String[] args) throws Exception {
	FileReader in = new FileReader("C:\\Users\\chouh\\Desktop\\Io\\hello.txt");
int ch = in.read(); 
while (ch != -1) { 
	System.out.println((char)ch);
ch = in.read();



}
	
}
 

	
}

