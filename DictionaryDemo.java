import java.util.*;

public class DictionaryDemo {
	
	static Map<String,String> users=new HashMap<String,String>();
	
	private static void addElementsToMap(){

		users.put("A","1");
		users.put("B","2");
		users.put("C","3");
		users.put("D","4");
		users.put("E","5");
		users.put("E","6");
		
		System.out.println(users);
		System.out.println(users.size());
	}
	
	

private static void displayAllElements() {
	Set<String> keys = users.keySet();
	
	for(String key:keys) {
		System.out.print("Keys: "+key+"  ");
		System.out.println("Value: "+users.get(key));
	}

}

public static void iteratingMap() {
	//for(Map.Entry<String,String> entry:map.entrySet()){
	for(Map.Entry<String,String> entry: users.entrySet()){
		System.out.print("Keys: "+entry.getKey()+"  ");
		System.out.println("Value: "+entry.getValue());
	}
}
	private static void usingLambdaExpression() {
		users.forEach((key,value)->System.out.println(String.format("%s-%s",key,value)));
	}
	
	public static void main(String[] args) {
		
		
		try {
			addElementsToMap();
			
			//displayAllElements();
			
			users.remove("A");
			
			iteratingMap();
			
			usingLambdaExpression();
			
		}catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}


	}

}

























