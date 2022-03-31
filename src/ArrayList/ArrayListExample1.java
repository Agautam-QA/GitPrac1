package ArrayList;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list=new ArrayList <String>();
//error appeared so use "import java.util.ArrayList;" as instruction
		
		list.add("Monday");// adding elements to Array list
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		
		System.out.println(list.size());
		//returns number of elements in array-5
		
		for(String s:list) {// reading elements from array list
			System.out.println(s);// printing all array list name
		

	}
  }
}
	
