package edu.ucsb.cs56.pconrad.parsing.parser;

import edu.ucsb.cs56.pconrad.parsing.tokenizer.*;
import edu.ucsb.cs56.pconrad.parsing.syntax.*;

import static edu.ucsb.cs56.pconrad.parsing.parser.TestParser.parseNoException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Like <code>TestParser</code>, but it adds in
 * tests for the new grammar.  This would normally be put
 * in <code>TestParser</code>, but here we use a separate
 * file to help prevent merge conflicts from occurring.
 * @see edu.ucsb.cs56.pconrad.parsing.parser.TestParser
 */
public class NewTestParser {
    // begin instance variables
    private final ASTFactory af;
    // end instance variables

    public NewTestParser() {
        af = DefaultASTFactory.DEFAULT;
    }

    @Test
    public void testEqualsLiterals() {
        assertEquals(af.makeEqualsNode(af.makeLiteral(1),
                                       af.makeLiteral(2)),
                     parseNoException("1 == 2"));
    }
    
    @Test
    public void testNotEqualsLiterals() {
        assertEquals(af.makeNotEqualsNode(af.makeLiteral(1),
                                          af.makeLiteral(2)),
                     parseNoException("1 != 2"));
    }
} // NewTestParser
