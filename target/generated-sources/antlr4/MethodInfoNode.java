import java.util.ArrayList;

public class MethodInfoNode {
	private String name;
	private int parameter;
	
	public MethodInfoNode(String name, int parameter){
		this.name = name;
		this.parameter = parameter;
	}

	public int prameterCount(){
		return parameter;
	}
	
	public String name(){
		return this.name;
	}
}