package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
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
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

			String line = null;

			while ((line = br.readLine()) != null) {
			//	System.out.println(line);
				StringTokenizer st=
						new StringTokenizer(line,"\t");//두번째 파라미터에 분류할 문자
				int index=0;
				while(st.hasMoreTokens()) {
					String s = st.nextToken();
				if(index==0) {
					System.out.print(s+":");
				}
				else if(index==1) {
					System.out.print(s+"-");
				}
				else if(index==2) {
					System.out.print(s+"-");
				}
				else {
					System.out.print(s);}
				
				index++;
				}
			
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println("마지막 수정일" + sdf.format(new Date(file.lastModified())));
	}

}
