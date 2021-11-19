

public class LinkedList {

	Node head;//linked listteký ilk basamak.
	
	public static LinkedList insert(LinkedList list, int data) {
		Node newNode = new Node(data);
		if(list.head == null) {
			list.head = newNode;//eger liste bossa ýlk eklenen deger head olarak atandý.
		}
		else {
			Node last = list.head;//headý bozarsak dýye kopyaladýk
			while(last.next !=null) {
				last = last.next;
			}
			last.next = newNode;//listenýn son elamanýný bulduk ve son elamanýna newNodu ekledýk.
			
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
				prev = currentNode;//bir oncekýný elýmýzde tutmus olduk
				currentNode = currentNode.next;
			}
			prev.next = currentNode.next;
			
		
		//case3: key cannot be found
	}
}
