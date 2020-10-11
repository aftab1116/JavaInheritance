// Java program to illustrate the 
// concept of Multilevel inheritance 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class one 
{ 
	public void print_one() 
	{ 
		System.out.println("One"); 
	} 
} 

class two extends one 
{ 
	public void print_two() 
	{ 
		System.out.println("two"); 
	} 
} 

class three extends two 
{ 
	public void print_three() 
	{ 
		System.out.println("three"); 
	} 
} 

// Drived class 
public class Main 
{ 
	public static void main(String[] args) 
	{ 
		three g = new three(); 
		g.print_one(); 
		g.print_two(); 
		g.print_three(); 
	} 
} 
