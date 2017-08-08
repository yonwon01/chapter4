package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));// 키보드에 들어온걸 라인단위로 읽기 위해.
			while (true) {
				System.out.println(">>");

				String line = br.readLine();
				if (line == null)
					break;
				if ("exit".equals(line))
					break;
				System.out.println(line);
			}
		}

		catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.out.println("지원하지않는 charset" + e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
