package org.uva.sea.ql.ast.expr;

import org.uva.sea.ql.checker.ExprVisitor;


public class Pos extends UnaryExpr {

	public Pos(Expr arg) {
		super(arg);
	}
	
	@Override
	public <T> T accept(ExprVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
