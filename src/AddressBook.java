import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> addressbook;
	
	public AddressBook(){
		addressbook = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo bi){
		addressbook.add(bi);
	}
	
	public void removeBuddy(BuddyInfo bi){
		addressbook.remove(bi);
	}
}
