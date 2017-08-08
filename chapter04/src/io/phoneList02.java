package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class phoneList02 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			BufferedReader br = null;
			File file = new File("./phone.txt");
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다");
				return;
			}

			System.out.println("=====파일정보=====");
			System.out.println("경로:" + file.getAbsolutePath());
			System.out.println("크기:" + file.length() + "Bytes");

			// Date date=new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

			System.out.println("====전화번호====");
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String name = sc.next();
				String phone1 = sc.next();// sc.nextInteger는 010을 10으로 읽음
				String phone2 = sc.next();
				String phone3 = sc.next();
				System.out.println(name + ":" + phone1 + ":" + phone2 + ":" + phone3);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
