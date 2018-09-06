
public class Node {
	private Node next,previous;
	private int info;
	
	public Node(int info) {
		setInfo(info);
	}

	public void setInfo(int info) {
		this.info = info;
	}
	 public int getInfo(){
		 return info;
	}
	 public Node getNext(){
		 return next;
	 }
	 public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	 
}
