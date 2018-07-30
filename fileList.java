import java.io.*;


public class fileList{
public static void main(String[] args){
//	for(File f:(new File("e:/")).listFiles((File f)->f.isDirectory())) {
//		System.out.println(f);
//	}
	String dir = "e:/";
	for(File f:(new File(dir)).listFiles()) {
		if(f.isDirectory()) System.out.println(f);
	}
}}