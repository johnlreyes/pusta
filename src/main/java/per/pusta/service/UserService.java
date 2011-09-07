package per.pusta.service;

public interface UserService {

	boolean existing(String email);

	void register(String name, String email, String password);

	void login(String email, String password);
}
