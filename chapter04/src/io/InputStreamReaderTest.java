package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;
		try {
			reader = new InputStreamReader(new FileInputStream("./ms949.txt"), "MS949");// ms949로 encoding안써주면 utf-8로
																						// 되기때문에 에러남
			int data = -1;
			try {
				while ((data = reader.read()) != -1) {
					System.out.println();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않는 charset:" + e);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일없음");
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
