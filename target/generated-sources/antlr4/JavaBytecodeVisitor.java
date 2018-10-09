import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JavaBytecodeVisitor extends HelloBaseVisitor<String>{
	ArrayList<ClassInfoNode> classTable = new ArrayList<ClassInfoNode>();
	ArrayList<StaticClassInfoNode> classStaticTable = new ArrayList<StaticClassInfoNode>();
	ArrayList<InterfaceInfoNode> interfaceTable = new ArrayList<InterfaceInfoNode>();
	ArrayList<VariableInfoNode> localVriableTable = new ArrayList<VariableInfoNode>();
	ArrayList<VariableInfoNode> staticVriableTable = new ArrayList<VariableInfoNode>();
	
	@Override
	public String visitProgram(HelloParser.ProgramContext ctx) {
		System.out.println();
		return super.visitProgram(ctx);
	}
	
	@Override
	public String visitPackage_decl(HelloParser.Package_declContext ctx) {
		System.out.print("package ");
		super.visitPackage_decl(ctx);
		System.out.println(";");
		return "";
	}
	
	@Override
	public String visitComma(HelloParser.CommaContext ctx) {
		System.out.print(", ");
		return super.visitComma(ctx);
	}

	@Override
	public String visitDot(HelloParser.DotContext ctx) {
		System.out.print(".");
		return super.visitDot(ctx);
	}

	@Override
	public String visitImport_decl(HelloParser.Import_declContext ctx) {
		System.out.print("import ");
		super.visitImport_decl(ctx);
		System.out.println(";");
		
		return "";
	}
	
	@Override
	public String visitInterface_decl(HelloParser.Interface_declContext ctx) {
		System.out.print("interface ");
		
		return super.visitInterface_decl(ctx);
	}
	
	@Override
	public String visitInterface_compound(HelloParser.Interface_compoundContext ctx) {
		System.out.println("\n"+ctx.getChild(0).getText());
		
		String interfaceName = getInterfaceName(ctx);
		InterfaceInfoNode node = new InterfaceInfoNode(interfaceName);
		interfaceTable.add(node);
		
		super.visitInterface_compound(ctx);
		System.out.println(ctx.getChild(ctx.getChildCount()-1).getText());
		return "";
	}
	
	@Override
	public String visitInterface_method(HelloParser.Interface_methodContext ctx) {
		String str = "public Object ";
		System.out.print(str);
		
		String interfaceName = ((HelloParser.Interface_declContext)ctx.parent.parent).ident().getText();
		String methodName = "";
		int parameterNumber = 0;
		
		methodName = ctx.getChild(0).getText();
		visit(ctx.getChild(0)); 
		
		//get child number 
		if(ctx.getChildCount()>3){
			int child = ctx.getChild(2).getChildCount(); 
			parameterNumber = (child/2) + (child%2);
		}
		
		int index = getInterfaceIndex(interfaceName);
		interfaceTable.get(index).addMethod(methodName, parameterNumber);
		
		System.out.print(ctx.getChild(1).getText());
		
		if (ctx.getChildCount() > 3) {
			visit(ctx.getChild(2));
		}
		
		str = ctx.getChild((ctx.getChildCount()-1)).getText();
		System.out.println(str+";");
		return "";
	}
	
	public int getInterfaceIndex(String name){
		for(int i=0; i<interfaceTable.size(); i++){
			if(interfaceTable.get(i).name().equals(name))
				return i;
		}
		return -1;	
	}
	
	public String getInterfaceName(HelloParser.Interface_compoundContext ctx) {
		HelloParser.Interface_declContext interface_decl 
			= (HelloParser.Interface_declContext) ctx.parent;
		
		return interface_decl.ident().getText();
	}
	
	@Override
	public String visitExtend(HelloParser.ExtendContext ctx) {
		System.out.print(" extends ");
		
		//extends 할 파일을 검사할 필요가 있음 (import 미구현으로 아직 불가능)
		String parentClass = ctx.ident().getText();
		
		return super.visitExtend(ctx);
	}
	
	
	@Override
	public String visitParams(HelloParser.ParamsContext ctx) {
		// TODO Auto-generated method stub	
		return super.visitParams(ctx);
	}
	
	@Override
	public String visitParam(HelloParser.ParamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParam(ctx);
	}
	
	@Override
	public String visitClass_decl(HelloParser.Class_declContext ctx) {
	
		String str = "\npublic class ";
		System.out.print(str);
		
		//indent가 공백이거나 null이면 에러를 띄워야함
		String className = ctx.ident().getText();
		
		ClassInfoNode node = new ClassInfoNode(className);
		classTable.add(node);
		
		return super.visitClass_decl(ctx);
	}
	
	@Override
	public String visitImplement(HelloParser.ImplementContext ctx) {
		String str = " implements ";
		String list[];
		list = getImplementationClassList(ctx);
		
		for(int i = 0; i<list.length; i++){
			if(i!=0){
				str+=", ";
			}
			int index = getInterfaceIndex(list[i].trim());
			if(index == -1){
				//예외처리 해야될 부분 
				System.out.println("error");
			}
			str +=list[i];
		}
		
		System.out.println(str);
		return "";
	}
	
	public String[] getImplementationClassList(HelloParser.ImplementContext ctx) {
		//trim strings excepts class names
		String str = ctx.getPayload().getText();
		String list = str.split("]")[0];
		list = list.substring(1, list.length()).trim();

		return list.split(",");
	}
	@Override
	public String visitClass_compound(HelloParser.Class_compoundContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(ctx.getChild(0).getText());
		super.visitClass_compound(ctx);
		System.out.println(ctx.getChild((ctx.getChildCount()-1)).getText());
		return "";
	}
	
	@Override
	public String visitClass_field(HelloParser.Class_fieldContext ctx) {
		// TODO Auto-generated method stub
		//변수테이블에서 변수 관리
//		super.visitClass_field(ctx);
		declaresVar(ctx);
		return "";
	}
	
	public void declaresVar(HelloParser.Class_fieldContext ctx) {
		//can't cast to HelloParser.Assignment_stmtContext;
//		HelloParser.Assignment_stmtContext assignCtx = (HelloParser.Assignment_stmtContext) ctx.getChild(0);
//		
//		if (assignValue(assignCtx)) {
//			
//		}
//		else { //declaration without assignment
//			
//		}
	}
	
	public boolean assignValue(HelloParser.Assignment_stmtContext ctx) {
		return (ctx.getChildCount() == 3);
	}
	
	@Override
	public String visitClass_field_decl(HelloParser.Class_field_declContext ctx) {
		// TODO Auto-generated method stub
		//System.out.print("Class field decl");
		return super.visitClass_field_decl(ctx);
	}
	
	public boolean classHasMultipleVar(HelloParser.Class_field_declContext ctx){
		return (ctx.getParent().getChildCount() > 3);
	}
	@Override
	public String visitAssignment_stmt(HelloParser.Assignment_stmtContext ctx) {
		// TODO Auto-generated method stub
//		return super.visitAssignment_stmt(ctx);
		return "";
	}
	
	@Override
	public String visitIdent(HelloParser.IdentContext ctx) {
		// TODO Auto-generated method stub
		System.out.print(ctx.getPayload().getText());
		return super.visitIdent(ctx);
	}

	@Override
	public String visitNum(HelloParser.NumContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNum(ctx);
	}

	@Override
	public String visitAssign_symbol(HelloParser.Assign_symbolContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAssign_symbol(ctx);
	}

	@Override
	public String visitReturn_symbol(HelloParser.Return_symbolContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturn_symbol(ctx);
	}

	public boolean assignsVal(HelloParser.Assignment_stmtContext ctx) {
		return (ctx.getChildCount() > 3);
	}
	@Override
	public String visitExpression(HelloParser.ExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpression(ctx);
	}
	
	@Override
	public String visitPostfixUnaryOP(HelloParser.PostfixUnaryOPContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPostfixUnaryOP(ctx);
	}

	@Override
	public String visitIf_stmt(HelloParser.If_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIf_stmt(ctx);
	}

	@Override
	public String visitBoolean_literal(HelloParser.Boolean_literalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBoolean_literal(ctx);
	}

	

	@Override
	public String visitMethod_call(HelloParser.Method_callContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMethod_call(ctx);
	}

	@Override
	public String visitClass_method(HelloParser.Class_methodContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClass_method(ctx);
	}

	@Override
	public String visitElse_if_condition(HelloParser.Else_if_conditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElse_if_condition(ctx);
	}

	@Override
	public String visitReturn_stmt(HelloParser.Return_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitReturn_stmt(ctx);
	}

	@Override
	public String visitIf_condition(HelloParser.If_conditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIf_condition(ctx);
	}

	@Override
	public String visitWhile_stmt(HelloParser.While_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitWhile_stmt(ctx);
	}

	@Override
	public String visitOp(HelloParser.OpContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOp(ctx);
	}

	@Override
	public String visitPrefixUnaryOP(HelloParser.PrefixUnaryOPContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrefixUnaryOP(ctx);
	}

	@Override
	public String visitThis_prefix(HelloParser.This_prefixContext ctx) {
		// TODO Auto-generated method stub
		return super.visitThis_prefix(ctx);
	}

	@Override
	public String visitSuper_prefix(HelloParser.Super_prefixContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSuper_prefix(ctx);
	}

	@Override
	public String visitElse_condition(HelloParser.Else_conditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitElse_condition(ctx);
	}

	@Override
	public String visitCompound(HelloParser.CompoundContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCompound(ctx);
	}

	@Override
	public String visitClass_static_field(HelloParser.Class_static_fieldContext ctx) {
		// TODO Auto-generated method stub
		return super.visitClass_static_field(ctx);
	}

	@Override
	public String visitArgs(HelloParser.ArgsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArgs(ctx);
	}

	@Override
	public String visitContinue_stmt(HelloParser.Continue_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitContinue_stmt(ctx);
	}

	@Override
	public String visitBreak_stmt(HelloParser.Break_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBreak_stmt(ctx);
	}

	@Override
	public String visitStmt(HelloParser.StmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmt(ctx);
	}
}
