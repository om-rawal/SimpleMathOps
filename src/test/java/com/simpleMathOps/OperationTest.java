package com.simpleMathOps;
import  org.junit.Assert;
import org.junit.Test;

public class OperationTest {
	Operation o1=new Operation();
	@Test
    public void addTest()
    {
		Assert.assertEquals( 30,o1.add(10,20));
    }
    @Test
    public void subtractTest()
    {
    	Assert.assertEquals( -10,o1.subtract(10,20));
    }
    @Test
    public void divisionTest()
    {
    	Assert.assertEquals( 2,o1.getDivision(20,10));
    }
    
    @Test
    public void remainderTest()
    {
    	Assert.assertEquals( 10,o1.getRemainder(10,20));
    }
    
    @Test
    public void identityTest()
    {	
    	String result=o1.identify();
    	Assert.assertEquals( "This is created by Om Rawal",result);
    }
}
