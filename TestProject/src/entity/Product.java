package entity;

public class Product {
private int pid;
public Product(int pid, String name) {
	this.pid = pid;
	this.name = name;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private String name;
}
