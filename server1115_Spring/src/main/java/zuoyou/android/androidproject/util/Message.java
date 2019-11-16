package hy.android.androidproject.util;

public class Message {
	private String error_code;
	private String error_msg;
	private String log_id;
	private String timestamp;
	private String cached;
	private Result result;
	public String getError_code() {
		return error_code;
	}
	public void setError_code(String error_code) {
		this.error_code = error_code;
	}
	public String getError_msg() {
		return error_msg;
	}
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	public String getLog_id() {
		return log_id;
	}
	public void setLog_id(String log_id) {
		this.log_id = log_id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getCached() {
		return cached;
	}
	public void setCached(String cached) {
		this.cached = cached;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public Message(String error_code, String error_msg, String log_id, String timestamp, String cached, Result result) {
		super();
		this.error_code = error_code;
		this.error_msg = error_msg;
		this.log_id = log_id;
		this.timestamp = timestamp;
		this.cached = cached;
		this.result = result;
	} 
	
}
