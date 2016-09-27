import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> addressbook;

	public AddressBook() {
		addressbook = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo bi) {
		if (bi != null) {
			addressbook.add(bi);
		}
	}

	public BuddyInfo removeBuddy(int index) {
		if (index >= 0) {
			return addressbook.remove(index);
		}
		return null;
	}
	
	public static void main(String args[]){
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 1234);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
}
