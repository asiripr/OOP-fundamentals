package learnArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> tvs = new ArrayList<String>();
		tvs.add("Rupavahini");
		tvs.add("Swarnawahini");
		tvs.add("Sirasa TV");
		tvs.add("Derana TV");
		tvs.add("Hiru TV");
		System.out.println(tvs);
		tvs.add(0, "ITN");
		System.out.println(tvs);
		System.out.println(tvs.get(1));
		tvs.set(4, "TV Derana");
		System.out.println(tvs);
		tvs.remove(5);
		System.out.println(tvs);
		//tvs.clear();
		System.out.println(tvs.size());
		// for loop
		for(int i=0; i<tvs.size(); i++) {
			System.out.println(tvs.get(i));
		}
		//for each loop
		for(String j : tvs) {
			System.out.println(j);
		}
		//other types
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		myNums.add(13);
		myNums.add(-8);
		myNums.add(4);
		myNums.add(51);
		myNums.add(-12);
		
		for(int i: myNums) {
			System.out.println(i);
		}
		
		// sort using Collections class
		Collections.sort(tvs);
		Collections.sort(myNums);
		for(String i: tvs) {
			System.out.println(i);
		}
		for(int i: myNums) {
			System.out.println(i);
		}
	}
}
