
public class HelloWorld {
String name;
int ID;

String getName(){
	return name;
}

void setName(String n) {
	name=n;
}

int getID(){
	return ID;
}

void setID(int i) {
	ID=i;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld obj = new HelloWorld();
		obj.setName("ABC");
		String n=obj.getName();
		obj.setID(29744);
		int i=obj.getID();
		
		
		System.out.println("Name: "+n);
		System.out.println("ID: "+i);
		
	}

}
