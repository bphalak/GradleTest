package org.gradle;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBraces {

	public static void main(String[] args) {
		BalancedBraces bb = new BalancedBraces();
		
		String text = "((!!(123(x))))";
		System.out.println("Validity = "+bb.isStringValid(text));
	}
	
	public boolean isStringValid(String s){
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
	 
		return stack.empty();		
		
	}

}
