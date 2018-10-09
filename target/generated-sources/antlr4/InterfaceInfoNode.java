import java.util.ArrayList;

public class InterfaceInfoNode {
	private String name;
	private ArrayList<MethodInfoNode> methods;

	public InterfaceInfoNode(String name){
		this.methods = new ArrayList<MethodInfoNode>();
		this.name = name;
	}

	public void addMethodName(String name,int parameter){
		MethodInfoNode addMethod = new MethodInfoNode(name, parameter);
		methods.add(addMethod);
	}
	
	public ArrayList<MethodInfoNode> methods(){
		return this.methods;
	}
	
	public void setMethods(ArrayList<MethodInfoNode> methods){
		this.methods = methods;
	}
}