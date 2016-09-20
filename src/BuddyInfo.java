
public class BuddyInfo {

	private String name;
	private String address;
	private String telephone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public static void main(String[] args) {
		BuddyInfo bi = new BuddyInfo();
		bi.setName("Homer");
		System.out.println("Hello " + bi.getName());


	}

}
