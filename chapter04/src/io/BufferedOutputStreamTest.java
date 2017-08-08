package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bos=null;
		try {
			//FileOutputStream fos=new FileOutputStream("./123.txt");//주 스트림
			//BufferedOutputStream bos= new BufferedOutputStream(fos);//보조스트림에 주 스트림을 넣는다.
			 bos= new BufferedOutputStream(new FileOutputStream("./123.txt"),20);//버퍼 사이즈 정하는것. 버퍼 사이즈가 꽉차면 flush되서 버퍼 단위 만큼 write됨
			 
			 for(int i='1';i<='9';i++) {
				 try {
					bos.write(i);
					//버퍼가 풀나면 자동 플러쉬됨
					bos.flush();//버퍼가 끝나지 않은 상태에서 플러시를 강제로 한다.
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("io exception"+e);
			 }}}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("파일 없음"+e);
		}
	finally {
		if(bos!=null) {
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}

}
