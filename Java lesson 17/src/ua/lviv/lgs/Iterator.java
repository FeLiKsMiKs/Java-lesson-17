package ua.lviv.lgs;

public interface Iterator {
public boolean hasNext();
public Integer next();
}
class Collection{
	private static Integer[] arr;
	Collection (Integer [] arr){
		Collection.arr = arr;
	}
	public class Forward implements Iterator{
		private int i = 0;
		@Override
		public boolean hasNext() {
			return i< arr.length;
		}

		@Override
		public Integer next() {
			return arr[i++];
		}
		
	}
	public Forward createForward() {
		return new Forward();
			
		}
	public class Backward implements Iterator{
int i = arr.length -1;
		@Override
		public boolean hasNext() {
			
			return i>=0;
		}

		@Override
		public Integer next() {
			i = i - 2;
			return arr[i+2];
		}
		
	}
	
public Backward createBackward() {
	return new Backward();
}
}