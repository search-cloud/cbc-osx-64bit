package net.loveruby.cflat.ast;
import net.loveruby.cflat.type.*;

abstract public class AbstractAssignNode extends ExprNode {
    ExprNode lhs, rhs;

    public AbstractAssignNode(ExprNode lhs, ExprNode rhs) {
        super();
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public Type type() {
        return lhs.type();
    }

    public ExprNode lhs() {
        return lhs;
    }

    public ExprNode rhs() {
        return rhs;
    }

    public void setRHS(ExprNode node) {
        this.rhs = node;
    }
}
