package com.surya.mock;

public class ExamplePojo {
	public String methodMakingPrivateMethodCall(String message) {
        return privateMethod(message);
    }
 
    public String methodMakingStaticNonVoidMethodCall(String message) {
        return ExampleUtil.sayHello(message);
    }
 
    public String methodMakingStaticVoidMethodCall(String message) {
        ExampleUtil.printHello(message);
        return "printed " + message;
    }
 
    private String privateMethod(String helloMessage) {
    	System.out.println(helloMessage);
        return "another " + helloMessage;
    }
}
