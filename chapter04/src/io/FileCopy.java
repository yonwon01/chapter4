package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("./choi.jpg");
			os = new FileOutputStream("./choiCopy.jpg");

			int data = -1;
			try {
				while ((data = is.read()) != -1) {
					os.write(data);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IO오류:" + e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 없음 :" + e);
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
