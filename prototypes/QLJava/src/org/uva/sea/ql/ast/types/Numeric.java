package org.uva.sea.ql.ast.types;

public class Numeric extends Type {
	@Override
	public boolean isCompatibleTo(Type t) {
		return t.isCompatibleToNumeric();
	}
	
	@Override
	public boolean isCompatibleToInt() {
		return true;
	}
	
	@Override
	public boolean isCompatibleToMoney() {
		return true;
	}
	
	@Override
	public boolean isCompatibleToNumeric() {
		return true;
	}
	
	@Override
	public String toString() {
		return "numeric";
	}

	@Override
	public <T, U> T accept(Visitor<T, U> visitor, U arg) {
		return visitor.visit(this, arg);
	}
}
