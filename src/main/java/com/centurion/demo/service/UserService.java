package com.centurion.demo.service;

import com.centurion.demo.model.User;

public interface UserService {

	User findUserByEmail(String email);

	void saveUser(User user);
}
