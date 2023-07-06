package com.rays.IOsStreams;

import java.io.FileReader;

import in.co.rays.basic.While_loop;

public class TxtFileRead {
public static void main(String[] args) throws Exception {

	FileReader in = new FileReader("C:\\Users\\chouh\\Desktop\\Srh");
	
	int ch = in.read();
	while (ch != -1) {
		
		System.out.println((char)ch);
		ch = in.read();
		
	}
	
	
}
}
