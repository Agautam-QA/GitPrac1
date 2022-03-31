package ArrayList;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		//adding elements to array list
		
		al.add("Hello");
		al.add(25);
		al.add(25.44);
		al.add('A');
		
		System.out.println("Number of elements in list:"+al.size());
		
		//number of elements present in al obj
		// result prints as:"Number of elements in list:4"
		
		al.add(1,"Everyone");
		al.add(2,1234);
		
		
		System.out.println("Number of elements in list after adding:"+al.size());
		// Prints number of elements as:"Number of elements in list after adding:6"
		
		System.out.println("Elements in array list:"+al);
	// prints all list-"Elements in array list:[Hello, Everyone, 1234, 25, 25.44, A]

	}

}
