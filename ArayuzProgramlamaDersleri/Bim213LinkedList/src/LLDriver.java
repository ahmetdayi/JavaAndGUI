
public class LLDriver {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list =list.insert(list, 3);
		list =list.insert(list, 5);
		list =list.insert(list, 7);
		list.deleteByKey(list, 7);
		list.PrintList(list);
		
	}
}
