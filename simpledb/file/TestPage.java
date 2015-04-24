
package simpledb.file;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TestPage {
@Test	
// test setShort and getShort function
public void testShort()
{
	Page page=new Page();
	short vals=5;
	short valsget=4;
	
	page.setShort(10,vals);
	valsget=page.getShort(10);
	assertEquals(valsget,vals);	
}
@Test
// test setBoolean and getBloolen function
public void testBool(){
	Page page=new Page();
	boolean valb=true;
	boolean valbget=false;
	page.setBoolean(9,valb);
	valbget=page.getBoolean(9);
	assertEquals(valb, valbget);
}
@Test
// test setBytes and getBytes function
public void testBytes(){
	Page page=new Page();
	byte[] valb={'a','b','c','d'};
	byte[] valbget=new byte[4];
	page.setBytes(5,valb);
	valbget=page.getBytes(5);
	assertArrayEquals(valb, valbget);
}
@Test
// test setDate and getDate function
public void testDate(){
	Page page=new Page();
	Date vald=new Date();
	Date valdget=new Date(System.currentTimeMillis() - (4 * 60 * 60 * 1000));
	page.setDate(5, vald);
	valdget=page.getDate(5);
	
	assertEquals(vald.getTime(), valdget.getTime());
}

}
