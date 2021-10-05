
public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList theList = new LinkedList(); // make new list
		 theList.insertFirst(22, 29); // insert four items
		 theList.insertFirst(44, 49);
		 theList.insertFirst(66, 69);
		 theList.insertFirst(88, 89);
		 theList.displayList(); 
		 
		 System.out.println("\nDeleting");
		 theList.deleteByKey(44).displayLink();
		 System.out.println("");
		 
		 theList.displayList();
		 
		 System.out.println("\nSearching");
		 theList.searchKey(88).displayLink();
		 System.out.println("");

	}

}
