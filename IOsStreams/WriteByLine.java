package com.rays.IOsStreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteByLine {
public static void main(String[] args) throws IOException {
	
FileWriter out = new FileWriter("C:\\Users\\chouh\\Desktop\\io\\IM.txt");
PrintWriter pw = new PrintWriter(out);
for (int i = 0; i < 5; i++) {
	 pw.println (i + " : hey ");
	
}
pw.close();
out.close();

System.out.println("C:\\Users\\chouh\\Desktop\\io\\IM.txt");

}
}
