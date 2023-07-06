package com.rays.IOsStreams;

import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {
public static void main(String[] args) throws Exception{
	
	FileReader reader = new FileReader("C:\\Users\\chouh\\Desktop\\io\\Chouhan.txt");
	Scanner sc = new Scanner(reader);
	
	while (sc.hasNext()) {
		System.out.println(sc.nextLine());
		
	}
	reader.close();
}
}
