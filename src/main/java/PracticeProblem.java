import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void swap(ArrayList<String> arrL, int num, int num2){
		String temp = arrL.get(num);
		arrL.set(num, (arrL.get(num2)));
		arrL.set(num2, temp);
	}

	public static ArrayList<Double> createArrayList(double[] arr){
		ArrayList<Double> arrL = new ArrayList<Double>();
		for(int i = 0; i < arr.length; i++){
			arrL.add(i, arr[i]);
		}
		return arrL;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages){
		HashMap<String, Integer> map = new HashMap <String, Integer> ();
		for(int i = 0; i < names.length; i++){
			map.put((names[i]), (ages[i]));
		}
		return map;
	}

	public static void increaseAge(HashMap<String,Integer> map, String name){
		int age = map.get(name) + 1;
		map.put(name, age);
	}
}
