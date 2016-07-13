package edu.ucsb.cs56.pconrad.parsing.evaluator;

import edu.ucsb.cs56.pconrad.parsing.syntax.*;

import static edu.ucsb.cs56.pconrad.parsing.evaluator.TestEvaluator.evaluateNoException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Like <code>TestEvaluator</code>, but it adds in
 * tests for the new grammar.  This would normally be put
 * in <code>TestEvaluator</code>, but here we use a separate
 * file to help prevent merge conflicts from occurring.
 * @see edu.ucsb.cs56.pconrad.parsing.evaluator.TestEvaluator
 */
public class TestEvaluatorNew {
    // BEGIN INSTANCE VARIABLES
    private final ASTFactory af;
    // END INSTANCE VARIABLES

    public TestEvaluatorNew() {
        af = DefaultASTFactory.DEFAULT;
    }

    @Test
    public void testEqualsEquals() {
        assertEquals(1,
                     evaluateNoException(af.makeEqualsNode(af.makeLiteral(5),
                                                           af.makeLiteral(5))));
    }

    @Test
    public void testEqualsNotEquals() {
        assertEquals(0,
                     evaluateNoException(af.makeEqualsNode(af.makeLiteral(5),
                                                           af.makeLiteral(6))));
    }

    @Test
    public void testNotEqualsEquals() {
        assertEquals(0,
                     evaluateNoException(af.makeNotEqualsNode(af.makeLiteral(5),
                                                              af.makeLiteral(5))));
    }
    
    @Test
    public void testNotEqualsNotEquals() {
        assertEquals(1,
                     evaluateNoException(af.makeNotEqualsNode(af.makeLiteral(5),
                                                              af.makeLiteral(6))));
    }
} // TestEvaluatorNew
