package KampOdev;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanıcı Eklendi" + user.name);
	}
	public void remove(User user) {
		System.out.println("Kullanıcı Kaldırıldı" + user.name);
	}
}
