package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class synonym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		HashMap<String, Set<String>> map = new HashMap<>();
		Set<String> a = new TreeSet<String>();
		a.add("GoodMornig");
		a.add("Shubhodaya");
		a.add("Shubhohday");
		a.add("Bonjour");
		map.put("GoodMorning", a);
		Set<String> b = new HashSet<String>();
		b.add("GoodEvennig");
		b.add("Shubha sange");
		b.add("susandhya");
		b.add("Bonsoir");
		map.put("GoodEvening", b);
		int i = 1;
		while (i == 1) {

			String str = s.nextLine();
			if (map.containsKey(str))
				System.out.println(map.get(str));
			else {
				System.out.println("Do you want enter this word to dictionay \t pess Y else N and enter");
				String ans = s.nextLine();
				if (ans.equals("Y")) {
					String word = new String();
					word = s.nextLine();
					ArrayList<String> arr = new ArrayList<String>();

					while (word.length() != 0) {
						arr.add(word);
						word = s.nextLine();

					}
					System.out.println("words added to the dictionary   try again ");
					if (!arr.isEmpty()) {
						Set<String> c = new TreeSet<String>();
						c.addAll(arr);
						map.put(arr.get(0), c);
					}

				} else {
					System.out.println("Try another word  ");

				}
			}

		}
	}

}
