import java.util.TreeMap;

public class TreeMapExample {

	static TreeMap<Integer,String> values=new TreeMap<Integer,String>();
	
	public static void main(String[] args) {
		
		values.put(4,"b44");
		values.put(5,"c55");
		values.put(6,"a66");
		values.put(1,"d11");
		values.put(2,"a22");
		values.put(3,"a33");
		
		
		System.out.println(values);
		values.forEach((k,v)->System.out.print(k+" "));
		
	}

}
