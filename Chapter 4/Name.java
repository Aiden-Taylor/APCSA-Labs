
public class Name {
	String name;
	String frst;
	String middl;
	String lst;
	String comp;
	String i1;
	String i2;
	String i3;
	public Name(String first, String middle, String last) {
		name = (first + " " + middle + " " + last);
		frst = first;
		middl = middle;
		lst = last;
	}
	public String getFirst() {
		return frst;
	}
	public String getMiddle() {
		return middl;
	}
	public String getLast() {
		return lst;
	}
	public String firstMiddleLast() {
		return name;
	}
	public String lastFirstMiddle() {
		return (lst + ", " + frst + " " + middl);
	}
	public boolean equals(Name other) {
		comp = other.firstMiddleLast();
		return name.equalsIgnoreCase(comp);
	}
	public String initials() {
		i1 = frst.substring(0,1);
		i2 = middl.substring(0,1);
		i3 = lst.substring(0,1);
		return (i1+i2+i3);
	}
	public int length() {
		return frst.length()+middl.length()+lst.length();
	}
}
