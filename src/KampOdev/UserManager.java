package KampOdev;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý Eklendi" + user.name);
	}
	public void remove(User user) {
		System.out.println("Kullanýcý Kaldýrýldý" + user.name);
	}
}
