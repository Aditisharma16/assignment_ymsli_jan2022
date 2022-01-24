package com.Day4Q7;

import java.io.IOException;
import java.util.InputMismatchException;

public class Q7 {
	public static void throwException() {
		throw new InputMismatchException();
	}

	public static void main(String[] args) {
		throwException();
	}
}