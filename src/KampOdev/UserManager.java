package KampOdev;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� Eklendi" + user.name);
	}
	public void remove(User user) {
		System.out.println("Kullan�c� Kald�r�ld�" + user.name);
	}
}
