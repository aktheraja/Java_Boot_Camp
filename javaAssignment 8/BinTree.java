

public class BinTree {
//reference to geeks for geeks
	Student root;
	int initialSize;
	String inOrder = "";
	String BreadthFirst = "";
	
	public BinTree() {
		root = null;
		initialSize = 0;

	}
	public void insert(String number, String lastname, String home, String program, char year) {

		Student node = new Student(number, lastname, home, program, year);

		if (root == null)
			root = node;
		else {
			Student cur;
			cur = searchLocation(root, node);

			if (cur.getLastname().toLowerCase().compareTo(node.getLastname().toLowerCase()) < 0)
				cur.setRight(node);
			else if (cur.getLastname().toLowerCase().compareTo(node.getLastname().toLowerCase()) > 0)
				cur.setLeft(node);
		}
		initialSize++;
	}

	public boolean delete(String lastname) {
		Student temp = search(lastname);
		if (temp == null)
			return false;
		else {
			Student head = null;
			Student current = root;
			while (current != temp) {
				head = current;
				if (lastname.toLowerCase().compareTo(current.getLastname().toLowerCase()) > 0)
					current = current.getRight();
				else if (lastname.toLowerCase().compareTo(current.getLastname().toLowerCase()) < 0)
					current = current.getLeft();
			}
			if (current.getRight() == null && current.getLeft() == null) {
				if (head == null)
					root = null;
				else if (current.getLastname().toLowerCase().compareTo(head.getLastname().toLowerCase()) > 0)
					head.setRight(current.getRight());
				else
					head.setLeft(current.getLeft());
			} else if (current.getRight() == null) {
				if (head == null)
					root = current.getLeft();
				else if (current.getLastname().toLowerCase().compareTo(head.getLastname().toLowerCase()) > 0)
					head.setRight(current.getLeft());
				else
					head.setLeft(current.getLeft());
			} else if (current.getLeft() == null) {
				if (head == null)
					root = current.getRight();
				if (current.getLastname().toLowerCase().compareTo(head.getLastname().toLowerCase()) < 0)
					head.setLeft(current.getRight());
				else
					head.setRight(current.getRight());
			} else if (current.getRight() != null && current.getLeft() != null) {
				Student replacement = findMin(current.getRight());
				replacement.setLeft(current.getLeft());
				if (replacement != current.getRight())
					replacement.setRight(current.getRight());
				if (head == null)
					root = replacement;
				else if (current.getLastname().toLowerCase().compareTo(head.getLastname().toLowerCase()) > 0)
					head.setRight(replacement);
				else
					head.setLeft(replacement);
			}
		}
		initialSize--;
		return true;
	}

	private Student findMin(Student root) {
		Student head = null;
		while (root.getLeft() != null) {
			head = root;
			root = root.getLeft();
		}
		Student temp = null;
		try {
			temp = (Student) root.clone();
		} catch (CloneNotSupportedException c) {
			System.out.println("cloning can not be implemented");
		}

		head.setLeft(root.getRight());
		return temp;
	}

	public Student search(String lastname) {
		Student current = root;
		while (current != null && !current.getLastname().equals(lastname)) {
			if (lastname.toLowerCase().compareTo(current.getLastname().toLowerCase()) > 0)
				current = current.getRight();
			else
				current = current.getLeft();
		}
		if (current == null)
			return null;
		else
			return current;
	}

	private Student searchLocation(Student current, Student node) {
		if (current.getLeft() == null && current.getRight() == null)
			return current;
		if ((node.getLastname().toLowerCase().compareTo(current.getLastname().toLowerCase()) > 0) && current.getRight() != null)
			current = searchLocation(current.getRight(), node);
		else if ((node.getLastname().toLowerCase().compareTo(current.getLastname().toLowerCase()) < 0) && current.getLeft() != null)
			current = searchLocation(current.getLeft(), node);
		return current;
	}

	public void inOrder() {
		inOrderTraverse(root);
	}

	public void breadthFirst() {
		breadthFirstTraverse(root);
	}

	private void inOrderTraverse(Student current) {
		if (current != null) {
			inOrderTraverse(current.getLeft());
			System.out.println(current.toString());
			inOrder += current + "\n";
			inOrderTraverse(current.getRight());
		}
	}

	private void breadthFirstTraverse(Student cur) {
		AVL myQueue = new AVL(initialSize);
		myQueue.enqueue(cur);
		while (!myQueue.isqueEmpty()) {
			Student temp = myQueue.dequeue();
			System.out.println(temp);
			BreadthFirst += temp + "\n";
			if (temp.getLeft() != null)
				myQueue.enqueue(temp.getLeft());
			if (temp.getRight() != null)
				myQueue.enqueue(temp.getRight());
		}

	}
}
