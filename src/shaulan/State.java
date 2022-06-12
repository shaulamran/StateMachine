package shaulan;

import java.io.Serializable;

public abstract class State implements Serializable {
	private static final long serialVersionUID = 5765308319172984482L;

	public abstract State onEvent(Event event);
}