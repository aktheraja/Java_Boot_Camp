
public class AVL {
	
	Student [] arrlist;
	int currentSize = 0;
	int Sizefull = 0;
	int head = 0;
	int tail = -1;
	
	public AVL(int stackSize) {
		arrlist = new Student[stackSize];
		Sizefull = stackSize;
	}
	
	public Student dequeue() {
		if( isqueEmpty() == true)
			return null;
		Student temp = arrlist[head];
		head = head % Sizefull;
		head++; 
		currentSize--;
		
		return temp;
	}
	public void enqueue(Student current) { 
		if(isqueFull() == true)
			return;
		tail = tail % Sizefull;
		tail++;
		if(tail <= Sizefull)
			arrlist[tail] = current;
	currentSize++;		
	}
	
	public boolean isqueFull() {
		if (currentSize == Sizefull)
			return true;
		else
			return false;
	}
	
	public boolean isqueEmpty() {
		if(currentSize == 0)
			return true;
		else
			return false;
	}
}
