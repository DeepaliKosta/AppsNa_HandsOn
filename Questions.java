package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Questions {

	public static void main(String[] args) {

		checkReverseOfString("madamm", "madam");
		findSquare(5);
		findNegativePower(2, -4);
		System.out.println(reverseStringWithRecusrion("Ram"));
		reverseString("Deepali");
		findUniqueCharacter("Deepali Kosta");
		System.out.println();
		printRepeatedCharacters("Aaash");
		printEachCharacterOccurrence("Deepali");
		countCharacterOccurrence("Deepali Kosta", 'a');
		countVowelsAndConsonants("Deepali Kosta");
		stringToInteger("200");
		equalsOperatorDifference();
		removeCharactersFromString("Deepali", "aeiou");
		sortStringLetterInAscendingOrder("Program");
		sortDigitsInAscendingOrder(28156437);
		// findAverage();
		findSumOdEvenAndOdd(new int[] { 1, 2, 3, 4, 5, 6 });
		countLetterA("Deepali Kosta");
		findLargestAndSmallestNumber(new int[] { 23, 200, 1, 34, 56, });
		findLeapYear(2023);
		findNonRepeatedDigits(new int[] { 23, 3, 4, 5, 61, 2, 2, 4, 2 });
		findSecondLargestNumber(new int[] { 23, 3, 4, 5, 61, 2, 2, 4, 2 });
		sortArray(new int[] { 23, 3, 4, 5, 61, 2, 2, 4, 2 });
		copyAllTheElements(new int[] { 23, 3, 4, 5, 61, 2, 2, 4, 2 });
		printEvenAndOdd(new int[] { 23, 3, 4, 5, 61, 2, 2, 4, 2 });
		mergeTwoArray(new int[] { 23, 3, 4, 5, 61, 2, 2, 4, 2 }, new int[] { 23, 3, 4, 5, 61, 2, 2, 4, 2 });
		findPrimeFactors(12);
		findPrimeNumbers(4, 20);
//	    System.out.println(factorial(5));
		checkStrongNumber(1459);
		perfectNumber(61);
		armstrongNumber(123);
		findSumOfDigits(123);
		findSmallestAndLargest(new int[] { 23, 3, 4, 5, 61, 2, 2, 4, 2 });
		rotateArrayFromLeft(new int[] { 23, 3, 4, 5, 61, 2, 2, 4, 2 });
		rotateArrayFromRight(new int[] { 23, 3, 4, 5, 61, 2, 2, 4, 2 });
		findLengthOfString("deepali");
		trimSpace("deepali kosta ");
		reverseString("Deepali");
		capitalizeEachWordFirstAndLastCharacter("deepali kosta");
	}

	// 1
	public static void checkReverseOfString(String s1, String s2) {

		String temp = "";

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			temp += c;
		}

		System.out.println(temp.equalsIgnoreCase(s2) ? "Yes," + s1 + " is a reverse of " + s2
				: "No," + s1 + " is not a reverse of " + s2);
	}

	// 3
	public static void findSquare(int n) {
		System.out.println(n * n);
	}

	// 4.1
	public static void findNegativePower(int base, int exponent) {
		int temp = Math.abs(exponent);

		double res = 1;
		double tempBase = (double) 1 / base;

		for (int i = 0; i < temp; i++) {

			res *= tempBase;
		}

		System.out.println(res);
	}

	// 4.2
	public static String reverseStringWithRecusrion(String s) {
		if (s == "") {
			return s;
		}
		int lengthOfString = s.length();
		char charAtIndex = s.charAt(lengthOfString - 1);
		String remainString = s.substring(0, lengthOfString - 1);

		return charAtIndex + reverseStringWithRecusrion(remainString);
	}

	// 4.3
	public static void reverseString(String s) {
		String revString = "";
		char ch = ' ';
		for (int i = s.length() - 1; i >= 0; i--) {
			ch = s.charAt(i);
			revString += ch;
		}

		System.out.println(revString);
	}

	// 5
	public static void findUniqueCharacter(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = Character.toLowerCase(s.charAt(i));
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() == 1)
				System.out.print(e.getKey() + ",");
		}

	}

	// 6
	public static void printRepeatedCharacters(String s) {

		Map<Character, Integer> map = new HashMap<>();
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = Character.toLowerCase(s.charAt(i));
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
		}

	}

	// 7
	public static void printEachCharacterOccurrence(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = Character.toLowerCase(s.charAt(i));
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

	// 8
	public static void countCharacterOccurrence(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == c) {
				count++;
			}
		}
		System.out.println(count);
	}

	// 9
	public static void countVowelsAndConsonants(String s) {
		int vowelCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}

		}

		System.out.println("Vowel count " + vowelCount);

		System.out.println("Consonant count " + consonantCount);
	}

	// 10
	public static void stringToInteger(String s) {
		System.out.println(Integer.parseInt(s));
	}

	// 11
	public static void equalsOperatorDifference() {
		String s1 = "Deepali";
		String s2 = s1;
		String s3 = "Deepali";

		String s4 = new String("Deepali");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
	}

	// 12
	public static void removeCharactersFromString(String s1, String s2) {
		String resultString = "";

		for (char c : s1.toCharArray()) {
			if (s2.indexOf(c) == -1) {
				resultString += c;
			}
		}
		System.out.println(resultString);
	}

	// 15
	public static void sortStringLetterInAscendingOrder(String s) {
		char[] temp = s.toLowerCase().toCharArray();
		Arrays.sort(temp);
		System.out.println(temp);
	}

	// 16
	public static void sortDigitsInAscendingOrder(int number) {
		String temp = String.valueOf(number);
		sortStringLetterInAscendingOrder(temp);
	}

	// 17
	public static void findAverage() {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];

		double average = 0;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			numbers[i] = scanner.nextInt();

			sum += numbers[i];
		}

		average = (double) sum / 10;

		System.out.println(average);

	}

	// 18
	public static void findSumOdEvenAndOdd(int[] a) {
		int evenSum = 0, oddSum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenSum += a[i];
			} else {
				oddSum += a[i];
			}
		}

		System.out.println("Even Sum:" + evenSum + " ,Odd Sum:" + oddSum);
	}

	// 19
	public static void countLetterA(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 65 || s.charAt(i) == 97) {
				count++;
			}
		}

		System.out.println(s + " contains " + count + " times of a ");
	}

	//
	public static void findLeapYear(int year) {
		if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

	// 20
	public static void findLargestAndSmallestNumber(int[] array) {
		Arrays.sort(array);

		System.out.println("Min number:" + array[0] + " and Max number: " + array[array.length - 1]);
	}

	// 21
	public static void findNonRepeatedDigits(int[] array) {
		// String s = Arrays.toString(a);

		Map<Integer, Integer> map = new HashMap<>();

		for (int a : array) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}

		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				System.out.println(m.getKey());
			}
		}

	}

	// 22
	public static void findSecondLargestNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[i]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println("Second largest number " + array[1]);
	}

	// 23
	public static void sortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println("Sorted array");
		for (int x : array) {
			System.out.println(x);
		}
	}

	// 24
	public static void copyAllTheElements(int[] array) {
		int[] secondArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			secondArray[i] = array[i];
		}

		System.out.println("Copied Elements from one array to another");
		for (int n : secondArray) {
			System.out.println(n);
		}
	}

	// 25
	public static void printEvenAndOdd(int[] array) {
		List<Integer> evenIntegers = new ArrayList<>();
		List<Integer> oddIntegers = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenIntegers.add(array[i]);
			} else {
				oddIntegers.add(array[i]);
			}
		}

		System.out.println("Even integers");
		for (int i : evenIntegers) {
			System.out.println(i);
		}

		System.out.println("Odd integers");
		for (int i : oddIntegers) {
			System.out.println(i);
		}
	}

	// 26
	public static void mergeTwoArray(int[] arr1, int[] arr2) {

		int[] newArray = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {

			newArray[i] = arr1[i];

		}

		for (int i = 0; i < arr2.length; i++) {

			newArray[arr1.length + i] = arr2[i];

		}

		System.out.println("Merged two arrays");
		for (int n : newArray) {
			System.out.println(n);
		}
	}

	// 27
	public static void findPrimeFactors(int n) {
		List<Integer> factors = new ArrayList<>();

		if (n == 1) {
			System.out.println("1 has no prime factors");
		}

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				if (isPrime(i)) {
					factors.add(i);
				}
			}
		}

		System.out.println("Prime factors");
		for (int i : factors) {
			System.out.println(i);
		}
	}

	public static boolean isPrime(int n) {

		int count = 1;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {

				count++;
			}
		}

		if (count >= 2) {
			System.out.println(n + " " + count);
			return false;
		}
		System.out.println(n + " " + count);
		return true;
	}

	// 28
	public static void findPrimeNumbers(int a, int b) {
		List<Integer> primeNumbers = new ArrayList<>();
		for (int i = a; i <= b; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}

		System.out.println("Prime numbers between " + a + " and " + b);
		for (int n : primeNumbers) {
			System.out.println(n);
		}
	}

	// 29
	// Sum of factorial of each digit
	public static void checkStrongNumber(int n) {
		int temp = n;
		int rem = 0;
		int sum = 0;
		while (temp != 0) {
			rem = temp % 10;
			int factorial = factorial(rem);
			sum += factorial;
			temp = temp / 10;
		}
		if (sum == n) {
			System.out.println(n + " is a strong number");
		} else {
			System.out.println(n + " is not a strong number");
		}
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}

	// 30
	// sum of its divisor should be equal to itself
	public static void perfectNumber(int n) {
		int sum = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (sum == n) {
			System.out.println(n + " is perfect number");
		} else {
			System.out.println(n + " is not a perfect number");
		}
	}

	// 31
	// sum of cube of digits is equal to itself
	public static void armstrongNumber(int n) {
		int sum = 0;
		int temp = n;
		int rem = 0;

		while (temp != 0) {
			rem = temp % 10;
			sum += Math.pow(rem, 3);
			temp /= 10;
		}

		if (n == sum) {
			System.out.println(n + " is an armstrong number");
		} else {
			System.out.println(n + " is not an armstrong number");
		}
	}

	// 32
	public static void findSumOfDigits(int num) {
		int temp = num, sum = 0, rem = 0;
		while (temp != 0) {
			rem = temp % 10;
			sum += rem;
			temp /= 10;
		}

		System.out.println("Sum of digits " + sum);
	}

	// 33
	public static void findSmallestAndLargest(int[] n) {
		int smallest = n[0];
		int largest = n[0];

		for (int i = 0; i < n.length; i++) {
			if (n[i] < smallest) {
				smallest = n[i];
			}
		}

		for (int i = 0; i < n.length; i++) {
			if (n[i] > largest) {
				largest = n[i];
			}
		}

		System.out.println("Smallest number " + smallest + " and largest number " + largest);
	}

	// 34
	public static void rotateArrayFromLeft(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[arr.length - 1] = temp;

		System.out.println("Rotate array");
		for (int n : arr) {
			System.out.println(n);
		}
	}

	// 35
	public static void rotateArrayFromRight(int[] arr) {
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;

		System.out.println("Rotate array From right");
		for (int n : arr) {
			System.out.println(n);
		}
	}

	// 36
	public static void findLengthOfString(String s) {
		int count = 0;
		for (char ch : s.toCharArray()) {
			count++;
		}

		System.out.println("Length of string " + s + " is " + count);
	}

	// 37
	public static void trimSpace(String s) {
		String s1 = "";
		for (char c : s.toCharArray()) {
			if (c != ' ') {
				s1 += c;
			}
		}
		System.out.println(s1);
	}
	
	//38
	public static void checkStringPalindrome(String s) {
		String revString="";
		for(int i=s.length()-1;i>=0;i--) {
			revString += s.charAt(i);
		}
		
		System.out.println(revString);
	}
	
	//39
	public static void capitalizeEachWordFirstAndLastCharacter(String s) {
		String[] reStrings= s.split("//s");
		
		for(String s1:reStrings) {
			capitalizeString(s1).join(",");
		}
		for(String s1:reStrings) {
			System.out.println(s1);
		}
		
		 
	}
	public static String capitalizeString(String s) {
		String reString="";
		for(int i=0;i<s.length();i++) {
			if(i==0 && i==s.length()-1) {
			reString +=Character.toUpperCase(s.charAt(i));
			}
			else {
				reString += s.charAt(i);
			}
		}
		return reString;
	}
}
