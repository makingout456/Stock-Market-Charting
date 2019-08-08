package com.premium.stc.dao;

import java.util.List;

import com.premium.stc.model.User;

public interface UserDaoInterface {

		public int addOrUpdateUser(User userData,int index);
		public User getUser(String username, String password);
		public List<User> usersList();
		public User getUserByIdOrUsername(int id,String username);
		public boolean deleteUserByIdOrUsername(int id, String username);
}
