package com.bridgelabz.DataStructuresAlgorithms;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomMessageRegex {
	static String name = "<<name>>";
	static String fullName = "<<full name>>";
	static String mobileNumber = "xxxxxxxxxx";
	static String date = "xx/xx/xxxx";
	static String print;

	/*
	 * Method to write custom message using Pattern & Matcher
	 */
	private static void customizedMessage(String message) {
		Pattern pattern = Pattern.compile(name);
		Matcher matcher = pattern.matcher(message);
		print = matcher.replaceAll("Rahul");
		Pattern pattern1 = Pattern.compile(fullName);
		Matcher matcher1 = pattern1.matcher(print);
		print = matcher1.replaceAll("Rahul Patil");
		Pattern pattern2 = Pattern.compile(mobileNumber);
		Matcher matcher2 = pattern2.matcher(print);
		print = matcher2.replaceAll("9967116186");
		LocalDateTime localDateTime = LocalDateTime.now();
		Pattern pattern3 = Pattern.compile(date);
		Matcher matcher3 = pattern3.matcher(print);
		print = matcher3.replaceAll(String.format(String.valueOf(localDateTime)));
		System.out.println(print);
	}

	public static void main(String[] args) {

		String message = "Hello <<name>>, We have your full name as <<full name>> in our system. Your contact number is +91 xxxxxxxxxx. Please,let us know in case of any clarification. Thank you BridgeLabz. xx/xx/xxxx.";
		customizedMessage(message);

	}
}
