import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> items = new LinkedList<String>();
//		do {
//			System.out.println("Enter the product Name");
//		}while(true);
		
		items.add("Purple");
		items.add("Red");
		items.add("Green");
		items.add("Yellow");
		items.add("Voilet");
		items.add("Blue");
		if(items.size()==6)
			items.remove();
		System.out.println(items);
		
		items.forEach((i)->System.out.println(i));
	}

}
