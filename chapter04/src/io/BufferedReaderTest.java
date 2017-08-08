package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./src/io/bufferedReaderTest.java"));
			String line = null;
			try {
				while ((line = br.readLine()) != null) {//readline은 버퍼에 개행문자가 들어오면 flush해버림
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("io exception :" + e);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일없음 :" + e);
		}finally {
			try {
				if(br!=null) {
				br.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
