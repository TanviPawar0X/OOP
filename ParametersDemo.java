/*
 * Method in java can have parameters.
 * Parameters are input tobe provided for a method to be invoked properly.
 * 2ways
 * Pass by value:
 * process in which func para values are copied to an another variable and used in func.any change made to variable will not be reflected back to variable after the function has returned .This is the java feature
 * Pass by reference:
 * the same variable will be passed as argument, so any change made to this function will be reflected back to the calling function. In this way, u could have created a method that returns more than one value from its call. This feature is available in C++, C# and VB. However, objects of classes are reference types, they are passed as reference copies only.  
//In java, pass by value is only for primitive types and pass by reference is only for reference types(Classes).
 * 
 * pass by value->primitive types
 * pass by reference->
 */



class Customer{
	public int cstId;
	public String cstName;
	
	public Customer(int id,String name) {
		cstId=id;
		cstName=name;
	}
}

public class ParametersDemo {

	static void passByValue(int someData) {
		System.out.println("Value passed by function: "+someData);
		someData+=3456;
		System.out.println("Value modified in function: "+someData);
	}
	
	static void passReferenceObject(Customer cst) {
		cst.cstName="Chnaged Name";
	}
	
	public static void main(String[] args) {
		int someData=123;
		
    	passByValue(someData); 
		//Variable is not passed, copy will be passed.
        //So any change u make in func will be applicable only to copy.
        //after coming back from func copy is destroyed...........
		
    	System.out.println("After coming back from function: "+someData);
		
		System.out.println("////////////////////////////////////////");
		
		Customer cst=new Customer(123,"Tan");
		
		passReferenceObject(cst);
		//copy is alias to cst
		//both copy and obj will point to same memory,change will reflect back to the actual object as both are pointing to the same memory. Hence they are called as REFERENCE TYPES as the share the same reference across the application unless U explicitly create a new object.
		
		System.out.println("Customer after function call: "+cst.cstName);
		
		//A copy in reference type Stand point is it is same object with different name.
		Customer copy=cst;
		copy.cstName="Apple123";
		System.out.println(cst.cstName);
	}

}
