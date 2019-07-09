package exercises;

class Puppet{
	
	private int id;
	private String name;
	
	public Puppet( int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" : ").append(name);
		return sb.toString();
		
		//Not as efficient as builder
		//return id + ": " + name;
		
		//Another method:
		//return String.format("%-4d: %s", id, name);
	}
}
public class TheToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppet obj = new Puppet(1, "Big Frog");
		System.out.println(obj);
	}

}
