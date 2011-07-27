package per.pusta.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface UserService {

	boolean existing(String email);
	boolean register(String email, String password);
	void login(String email, String password);
}
