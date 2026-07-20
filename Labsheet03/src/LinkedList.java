
public class LinkedList {
	private Node head; // The first node of the list

	public LinkedList() {
		this.head = null;

	}

	public String traversal() {
		Node current_node = head;
		String result = "[";
		boolean fisrt_node = true;
		while (current_node != null) {
			result += (!fisrt_node ? ", " : "") + current_node.data;
			current_node = current_node.next;
			fisrt_node = false;
		}
		result += "]";
		return result;
	}

	public void insert(int position, Object value) {
		Node new_Node = new Node(value);
		if (head == null) {
			head = new_Node;
		} else if (position == 0) {
			new_Node.next = head;
			head = new_Node;
		} else {
			Node current_node = head;
			int current_position = 0;
			while (current_node != null && current_position < position - 1) {
				current_node = current_node.next;
				current_position++;
			}
			new_Node.next = current_node.next;
			current_node.next = new_Node;
		}
	}

	public void insert(Object value) {
		Node new_Node = new Node(value);
		if (head == null) {
			head = new_Node;
		} else {
			Node current_node = head;
			while (current_node.next != null) {
				current_node = current_node.next;
			}
			current_node.next = new_Node;
		}
	}

	public void remove(int position) {
		if (position == 0) {
			Node current_node = head;
			head = current_node.next;
		} else {
			Node current_node = head;
			int current_position = 0;
			while (current_node.next != null && current_position < position - 1) {
				current_node = current_node.next;
				current_position++;
			}
			current_node.next = current_node.next.next;
		}
	}

	public void removeLastElement() {
		if (head != null) {
			if (head.next == null) {
				head = null;
			} else {
				Node current_node = head;
				while (current_node.next.next != null) {
					current_node = current_node.next;
				}
				current_node.next = null;
			}
		}
	}

	public int length() {
		int count = 0;
		Node current_node = head;
		while (current_node != null) {
			count++;
			current_node = current_node.next;
		}
		return count;
	}

	public Object get(int position) {
		Node current_node = head;
		int current_position = 0;
		while (current_node != null && current_position < position) {
			current_node = current_node.next;
			current_position++;
		}
		if (current_node != null) {
			return current_node.data;
		}
		return null;
	}

	public void set(int position, Object value) {
		// update data in node at the position
		Node current_node = head;
		int current_position = 0;

		while (current_node != null && current_position < position) {
			current_node = current_node.next;
			current_position++;
		}

		if (current_node != null) {
			current_node.data = value;
		}
	}

	public void clear() {
		head = null;
	}

}
