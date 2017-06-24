package com.surya.mock;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class ExamplePojoTest {
	
	@InjectMocks
	ExamplePojo pojo;
	
	@Test
	public void privateMethod() throws Exception
	{
        ExamplePojo spyExamplePojo = PowerMockito.spy(new ExamplePojo());

		PowerMockito.when(spyExamplePojo, PowerMockito.method(ExamplePojo.class, "privateMethod", String.class)).withArguments(Matchers.anyString()).thenReturn("lala");
		String result = pojo.methodMakingPrivateMethodCall("test");
        assertEquals("test test", result);
	}
	
	 
}
