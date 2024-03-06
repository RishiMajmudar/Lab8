package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    public void testPush() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        assertEquals(Integer.valueOf(1), stack.get(0));
    }

    public void testPushMultiple() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(Integer.valueOf(3), stack.get(stack.size() - 1));
    }

    public void testPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        Integer popped = stack.pop();
        assertEquals(Integer.valueOf(1), popped);
        assertTrue(stack.isEmpty());
    }
}
