package com.lti.demotest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.democlass.DemoClass;

public class DemoTest {

	@Test
    public void testShow() {        
        DemoClass d= new DemoClass();        
        assertEquals("Hello World - DevOps !!",d.show());
    }

}
