package exercises;

/*
 * Prevent the user from instantiating this class elsewhere you add the word abstract
 * The child classes can only have one parent abstract class, but can implement many interfaces
 * You cannot have code in an interface but you can have default code in abstract classes
 * The child classes take the fundamental functionality of the parent abstract classes unlike in interfaces
 */
public abstract class AbstractBase {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Forces child class to implement these methods, acts like an interface
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutDown();

	public void run() {
		start();
		doStuff();
		shutDown();
	}

}
