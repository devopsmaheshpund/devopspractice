package com.practice.sourcecode;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Addition {

	@Test
	public void add() {
		int add = 10 + 20;
		System.out.println("Addition is : " + add);
	}

	@Test
	public void sub() {
		int sub = 20 - 10;
		System.out.println("Substraction is : " + sub);
	}
}
