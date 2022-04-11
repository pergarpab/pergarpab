class LinkedList<Integer> {

    static class LinkedListNode<Integer> {
        int data;
        LinkedListNode<Integer> next;
    }

    /**
     * Not exactly the best object orientation, but we'll manage
     */

    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;

    public LinkedList () {
        this.head = new LinkedListNode<Integer>();
        this.tail = new LinkedListNode<Integer>();
        head.next = tail;
    }

    void addLast(int e) {
        LinkedListNode<Integer> node = new LinkedListNode<Integer>(); // e and next are null
        tail.data = e;
        tail.next = node;
        tail = node;
    }

    LinkedListNode<Integer> findFirst(int e) {
        LinkedListNode<Integer> curr = head.next;
        while(curr != null) {
            if(curr.data == e) return curr;
            curr = curr.next;
        }
        return null;
    }
	
	static LinkedListNode insert (LinkedListNode head2, int data) {
		LinkedListNode node = new LinkedListNode();
		
		if (head2 == null || data < head2.data) {
			node.next = head2;
			return node;
		}
		
		LinkedListNode current = head2;
		while (current.next != null && data > current.next.data) {
			current = current.next;
		}
		
		node.next = current.next;
		current.next = node;
        node.data = data;
		
		return head2;
	}

    void print() {
        LinkedListNode<Integer> curr = head.next;
        while(curr.next != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.addLast(20);

        //list.print();

        LinkedListNode cinco = list.findFirst(5);
        LinkedListNode first_node = insert(cinco,17);
        list.print();
        

    }

}