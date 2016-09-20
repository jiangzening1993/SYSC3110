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

	public void removeBuddy(int index) {
		if (index >= 0) {
			addressbook.remove(index);
		}
	}
}
