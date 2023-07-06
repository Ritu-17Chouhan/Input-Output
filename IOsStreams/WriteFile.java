package com.rays.IOsStreams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args) throws IOException {
	
	
FileWriter out = new FileWriter("C:\\Users\\chouh\\Desktop\\io\\Got.txt");
out.write('C');
out.write('n');
out.write("This is line one");
out.write("This is line two");
out.close();
System.out.println(" ");
	
}
}
