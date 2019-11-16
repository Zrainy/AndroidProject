package hy.android.androidproject.util;

import java.util.Arrays;

public class Result {
	private String face_token;
	private User[] user_list;
	public String getFace_token() {
		return face_token;
	}
	public void setFace_token(String face_token) {
		this.face_token = face_token;
	}
	public User[] getUser_list() {
		return user_list;
	}
	public void setUser_list(User[] user_list) {
		this.user_list = user_list;
	}
	public Result(String face_token, User[] user_list) {
		super();
		this.face_token = face_token;
		this.user_list = user_list;
	}
	public Result() {
		super();
	}
	@Override
	public String toString() {
		return "Result [face_token=" + face_token + ", user_list=" + Arrays.toString(user_list) + "]";
	}
	

}
