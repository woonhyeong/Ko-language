import java.util.ArrayList;

public class StaticClassInfoNode {
	private String name;
	private ArrayList<VariableInfoNode> field;

	public StaticClassInfoNode(String name){
		this.name = name;
		field = new ArrayList<VariableInfoNode>();
	}

	public void addStaticVariable(String identifier, int type, Object value){
		VariableInfoNode v = new VariableInfoNode(identifier, type, value);
		field.add(v);
	}

	public int variableContains(String variable){
		for(int i=0; i<field.size(); i++){
			if(field.get(i).identifier().equals(variable))
				return i;
		}
		return -1;
	}

	public Object variableValueAtIndex(int index){
		return field.get(index).value();
	}

	public String variableIdentifierAtIndex(int index){
		return field.get(index).identifier();
	}

	public void modifyVariable(int index, int type, Object value){
		field.get(index).setType(type);
		field.get(index).setValue(value);
	}
}