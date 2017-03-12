package com.williamvo.fortesting;

import java.util.ArrayList;
import java.util.List;

public class PermutationsNoEM1 {

	static List<String> permutationList = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "abcd";
		getPermutations("", testString);
		System.out.println(permutationList);
	}
	static void getPermutations(String prefix, String input){
		if(input.length() == 0){
			permutationList.add(prefix);
		}
		for(int i = 0; i < input.length(); i++)
			getPermutations(prefix + input.charAt(i), input.substring(0, i) + input.substring(i+1));
	}
}
