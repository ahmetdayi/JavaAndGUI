

public class LinkedList {

	Node head;//linked listtek� ilk basamak.
	
	public static LinkedList insert(LinkedList list, int data) {
		Node newNode = new Node(data);
		if(list.head == null) {
			list.head = newNode;//eger liste bossa �lk eklenen deger head olarak atand�.
		}
		else {
			Node last = list.head;//head� bozarsak d�ye kopyalad�k
			while(last.next !=null) {
				last = last.next;
			}
			last.next = newNode;//listen�n son elaman�n� bulduk ve son elaman�na newNodu ekled�k.
			
		}
		
		return list;
	}
	
	public static void PrintList(LinkedList list) {
		
		Node printNode = list.head;
		while(printNode!=null){
		System.out.println(printNode.Data);
		printNode = printNode.next;
		}
	}
	public static void deleteByKey(LinkedList list , int key) {
		Node currentNode = list.head;
		
		//case 1: If the head holds the key itself
		
		if(currentNode != null && currentNode.Data == key) {
			list.head = list.head.next;
		}
		Node prev = list.head;
	    //case 2: If the key somewhere other than the head 
			while(currentNode != null && currentNode.Data != key) {
				prev = currentNode;//bir oncek�n� el�m�zde tutmus olduk
				currentNode = currentNode.next;
			}
			prev.next = currentNode.next;
			
		
		//case3: key cannot be found
	}
}
