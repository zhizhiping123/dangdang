package util;

public class Result {
private Integer result;
private Object data;
private String message;

public Result(Integer result, Object data, String message) {
	super();
	this.result = result;
	this.data = data;
	this.message = message;
}

public Result() {
	super();
	// TODO Auto-generated constructor stub
}

public Integer getResult() {
	return result;
}
public void setResult(Integer result) {
	this.result = result;
}
public Object getData() {
	return data;
}
public void setData(Object data) {
	this.data = data;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "Result [result=" + result + ", data=" + data + ", message=" + message + "]";
}

}
