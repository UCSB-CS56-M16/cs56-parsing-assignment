package edu.ucsb.cs56.pconrad.parsing.tokenizer;

import static edu.ucsb.cs56.pconrad.parsing.tokenizer.TestArithmeticTokenizer.tokenizeNoException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Like <code>TestArithmeticTokenizer</code>, but it adds in
 * tests for the new grammar.  This would normally be put
 * in <code>TestArithmeticTokenizer</code>, but here we use a separate
 * file to help prevent merge conflicts from occurring.
 * @see edu.ucsb.cs56.pconrad.parsing.tokenizer.TestArithmeticTokenizer
 */
public class NewTestArithmeticTokenizer {
    // begin instance variables
    private final TokenFactory tf;
    // end instance variables

    public NewTestArithmeticTokenizer() {
        tf = DefaultTokenFactory.DEFAULT;
    }

    @Test
    public void testEqualsToken() {
        assertArrayEquals(new Token[] { tf.makeEqualsToken() },
                          tokenizeNoException("=="));
    }

    @Test
    public void testEqualsExpression() {
        assertArrayEquals(new Token[] { tf.makeIntToken(12),
                                        tf.makeEqualsToken(),
                                        tf.makeIntToken(13) },
                          tokenizeNoException("12 == 13"));
    }

    @Test
    public void testNotEqualsToken() {
        assertArrayEquals(new Token[] { tf.makeNotEqualsToken() },
                          tokenizeNoException("!="));
    }
    
    @Test
    public void testNotEqualsExpression() {
        assertArrayEquals(new Token[] { tf.makeIntToken(12),
                                        tf.makeNotEqualsToken(),
                                        tf.makeIntToken(13) },
                          tokenizeNoException("12 != 13"));
    }
}
