package edu.ucsb.cs56.pconrad.parsing.syntax;

/**
 * Represents the addition operation (<code>+</code>)
 */
public class Plus extends OperatorScaffold {
    // begin constants
    public static final Plus PLUS = new Plus();
    // end constants
    
    public Plus() {
        super('+');
    }

    /**
     * Calls <code>visitor</code>'s <code>visitPlus</code> method.
     * @see edu.ucsb.cs56.pconrad.parsing.syntax.OperatorVisitor#visitPlus
     */
    public <A, T extends Throwable> A accept(final OperatorVisitor<A, T> visitor) throws T {
	return visitor.visitPlus();
    }
} // Plus
