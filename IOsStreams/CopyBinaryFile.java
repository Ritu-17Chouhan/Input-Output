package com.rays.IOsStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinaryFile {
	public static void main(String[] args)throws IOException {
		
		String source = "C:\\Users\\chouh\\Desktop\\io\\VK18.jpeg";
		String target = "C:\\Users\\chouh\\Desktop\\io\\VKpic.jpeg";

		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int joke = in.read();
		
		while(joke != -1) {
			
			out.write(joke);
			joke = in.read();
			
		}
		in.close();
		out.close();
		
		System.out.println("C:\\Users\\chouh\\Desktop\\io\\Got.txt");
	}
	
	
 
}
