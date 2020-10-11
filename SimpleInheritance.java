class Parent {
int a = 3;
public void message(){
System.out.println("this is parent class");
}
}
class SimpleInheritance extends Parent{
public static void main(String args[]){
message();
int b = a;
}
}
