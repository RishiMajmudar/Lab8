package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.EmptyStackException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testPushPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        assertEquals(Integer.valueOf(1), stack.pop());
    }

    public void testPush() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        assertEquals(1, stack.size());
        assertEquals(Integer.valueOf(1), stack.get(0));
    }

    public void testPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        int sizeBeforePop = stack.size();
        Integer poppedValue = stack.pop();
        assertEquals(Integer.valueOf(1), poppedValue);
        assertEquals(sizeBeforePop - 1, stack.size());
    }

    public void testEmptyStackPop() {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        try {
            stack.pop();
            fail("Expected EmptyStackException");
        } catch (EmptyStackException e) {
            // Expected behavior
        }
    }

    public void testNotEmptyStackPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        assertFalse(stack.isEmpty());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertTrue(stack.isEmpty());
    }

    public void testIsEmpty() {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    public void testSize() {
        MyStack<Integer> stack = new MyStack<>();
        assertEquals(0, stack.size());
        stack.push(1);
        assertEquals(1, stack.size());
        stack.push(2);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }
}
