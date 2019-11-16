package hy.android.androidproject.util;

public class User {
	private String group_id;
	private String user_id;
	private String user_info;
	private Double score;
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_info() {
		return user_info;
	}
	public void setUser_info(String user_info) {
		this.user_info = user_info;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public User(String group_id, String user_id, String user_info, Double score) {
		super();
		this.group_id = group_id;
		this.user_id = user_id;
		this.user_info = user_info;
		this.score = score;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [group_id=" + group_id + ", user_id=" + user_id + ", user_info=" + user_info + ", score=" + score
				+ "]";
	}
}
