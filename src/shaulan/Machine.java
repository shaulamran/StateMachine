package shaulan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Machine {
	private State state;

	// Default constructor restores state from file
	public Machine() throws ClassNotFoundException, IOException {
		loadSavedState();
	}
	
	public Machine(State initialState) {
		this.state = initialState;
	}
	
	public State state() {
		return this.state;
	}
	
	public void onEvent(Event event) throws IOException {
		this.state = state.onEvent(event);
	
		persistState();
	}
	
	private void loadSavedState() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("state.dat");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
        Object obj = objectIn.readObject();

        objectIn.close();
        this.state = (State) obj;
	}
	
	private void persistState() throws IOException {
		FileOutputStream fos = new FileOutputStream("state.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(this.state);
	    oos.close();
	}
}
