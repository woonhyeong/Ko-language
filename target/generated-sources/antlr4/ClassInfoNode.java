import java.util.ArrayList;

public class ClassInfoNode {
	String name;
	ArrayList<MethodInfoNode> methods;
	ArrayList<VariableInfoNode> field;

	/*constructor */
	public ClassInfoNode(String name) {
		this.name = name;
		methods = new ArrayList<MethodInfoNode>();
		field = new ArrayList<VariableInfoNode>();
	}

	/*getter and setter */
	public String className() {
		return name;
	}

	public void setClassName(String name) {
		this.name = name;
	}

	public ArrayList<MethodInfoNode> methods(){
		return methods;
	}

	public ArrayList<VariableInfoNode> field(){
		return field;
	}

	public void setMethods(ArrayList<MethodInfoNode> methods){
		this.methods = methods;
	}

	public void setField(ArrayList<VariableInfoNode> field){
		this.field = field;
	}

	/*variable relative methods */
	public void addVariable(String identifier, int type, Object value){
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

	/*method relative methods */
	public void addMethod(String name, int parameter){
		MethodInfoNode m = new MethodInfoNode(name, parameter);
		methods.add(m);
	}

	public int methodContains(String method){
		for(int i=0; i<methods.size(); i++){
			if(methods.get(i).name().equals(method))
				return i;   
		}
		return -1;
	}

	public int methodParameterNumber(int index){
		return methods.get(index).prameterCount();
	}

	public String methodName(int index){
		return methods.get(index).name();
	}
}