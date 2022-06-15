package ua.lviv.lgs;

public class IteratorApplication {
	public static void main(String[] args) {
		
	
Integer[] array = {17, 3, 7, 9,-5, 22, 76,-37,90,-99};
Collection collection = new Collection(array);
Iterator iteratorForward = collection.createForward();
while(iteratorForward.hasNext()) {
	Integer next =  iteratorForward.next();
	if(next % 2 != 0 ) {
		System.out.println("null");
	}else {
		System.out.println(next);
	}
		
}
System.out.println();
Iterator iterBackward = collection.createBackward();
while(iterBackward.hasNext()) {
	Integer next =  iterBackward.next();
	System.out.println(next);
}
}
}