
public class VariableInfoNode {
	private String identifier;
	private int type;
	private Object value;
	
	public VariableInfoNode(String identifier, int type, Object value) {
		this.identifier = identifier;
		this.type = type;
		this.value = value;
	}

	public String identifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public int type() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Object value() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
