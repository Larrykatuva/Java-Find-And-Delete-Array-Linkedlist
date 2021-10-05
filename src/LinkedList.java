
public class LinkedList {
	private Link first;
	
	
	/**
	 * Class constructor
	 */
	public LinkedList() {
		this.first = null;
	}
	
	
	/**
	 * Checking if the linked list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return this.first == null;
	}
	
	
	/**
	 * Inserting value into the linked list
	 * @param key
	 * @param value
	 */
	public void insertFirst(int key, int value) {
		Link newLink = new Link(key, value);
		newLink.next = first;
		first = newLink;
	}
	
	
	/**
	 * Searching a deleting from the linked list
	 * @param key
	 * @return Link matching the key
	 */
	public Link searchKey(int key) {
		Link currentLink = this.first;
		while(currentLink.data != key) {
			if(currentLink.next == null) {
				return null;
			}else {
				currentLink = currentLink.next;
			}
		}
		return currentLink;
	}
	
	
	/**
	 * Search and delete by key from the linked list
	 * @param key
	 * @return Link deleted
	 */
	public Link deleteByKey(int key) {
		Link currentLink = this.first;
		Link previousLink = this.first;
		while(currentLink.data != key) {
			if(currentLink.next == null) {
				return null;
			}else {
				previousLink = currentLink;
				currentLink = currentLink.next;
			}
		}
		if(currentLink == this.first) {
			this.first = this.first.next;
		}else {
			previousLink.next = currentLink.next;
		}
		return currentLink;
	}
	
	
	/**
	 * Displaying all the values in the linked list
	 */
	public void displayList() {
		Link currentLink = this.first;
		while(currentLink != null) {
			currentLink.displayLink();
			currentLink = currentLink.next;
		}
	}

}
