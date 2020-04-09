package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GenericCollections {
	public static List<String> lettersAndNumbers(List<Character> list) {
		List<String> newList = new ArrayList<>();
		if (list.equals(null)) {
			return null;
		}
		if (list.isEmpty()) {
			newList.add(" ");
		}
		for (Character c : list) {
			if (Character.isLetter(c)) {
				if (Character.isLowerCase(c)) {
					newList.add("L(" + Character.toLowerCase(c) + ")");
				}
				if (Character.isUpperCase(c)) {
					newList.add("U(" + Character.toLowerCase(c) + ")");
				}
			}
			if (Character.isDigit(c)) {
				newList.add("N(" + c + ")");
			}
		}
		return null; //newList;
	}

	public static int modify(List<Integer> list) {

		if (list.equals(null)) {
			throw new NullPointerException("The list cannot be null");
		}

		for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {
			Integer integer = iter.next();
			if (integer % 3 == 0) {
				iter.remove();
			}

		}

		for (int i = 4; i < 7; ++i) {
			for (int j = 1; j < 6; ++j) {
				list.add(i * j);
			}
		}
		Collections.sort(list);

		List<Integer> tempList = new ArrayList<>();

		for (Integer i : list) {
			if (tempList.contains(i)) {

			} else
				tempList.add(i);
		}

		return tempList.size();
	}

	public static void removeEveryNthElement(List<?> list, int n) {

	}

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();

		intList.add(3);
		intList.add(5);
		intList.add(9);
		intList.add(3);
		intList.add(3);
		intList.add(7);
		intList.add(65);

		int x = modify(intList);

		System.out.println(x);
		for (Integer i : intList) {
			System.out.print(i + " ");
		}

	}
}
