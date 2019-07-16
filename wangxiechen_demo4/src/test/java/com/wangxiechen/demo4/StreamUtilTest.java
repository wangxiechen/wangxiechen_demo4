package com.wangxiechen.demo4;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() throws FileNotFoundException {
		StreamUtil.closeAll(new FileInputStream(new File("d:/text.txt")));
	}

	@Test
	public void testCopy() throws FileNotFoundException, IOException {
		StreamUtil.copy(new FileInputStream(new File("d:/a.txt")), new FileOutputStream(new File("d:/a.txt")), true,true);
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException, IOException {
		String string = StreamUtil.readTextFile(new FileInputStream(new File("d:/a.txt")));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileCloseableArray() throws FileNotFoundException, IOException {
		String string = StreamUtil.readTextFile(new File("d:/a.txt"));
		System.out.println(string);
	}

	@Test
	public void testReadStringFromSystemIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的姓名");
		String name = sc.next();
		String namecopy = StreamUtil.readStringFromSystemIn(name);
		System.out.println(namecopy);
	}

	@Test
	public void testReadIntFromSystemIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的年龄");
		String age = sc.next();
		System.out.println(StreamUtil.readIntFromSystemIn(age));
	}

}
