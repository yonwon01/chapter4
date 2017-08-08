package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FilerReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;//문자단위로 읽음
		FileInputStream is=null;//바이트 단위로 읽음
		int count=0;
		try {
			reader = new FileReader("./123.txt");
			is=new FileInputStream("123.txt");
			int data = -1;
			try {
				while ((data = reader.read()) != -1) {
					System.out.print((char)data);
					count++;
				}
				System.out.println("\n읽은 횟수"+count);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("io error:" + e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일없음:" + e);
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
