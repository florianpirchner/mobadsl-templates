package org.mobadsl.samples;

/**
  * <p>@verson = <code>1.0.1</code></p>
*/ 
public interface CustomerUiAppConstants extends org.mobadsl.templates.MobaBaseTemplateConstants{
	
	public static final String Application__CustomerUiApp_Name = "CustomerUiApp";
	public static final String Application__CustomerUiApp_Version = "1.0.1";
	//
	// CONSTANTS
	//
	/**
	  * <p>@value = <code>AhAHAH</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__XXX = "AhAHAH";
	
	/**
	  * <p>@value = <code>10</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__INT = 10;
	
	/**
	  * <p>@value = <code>10.12</code><br>
	  * 		@valueType = DECIMAL
	  * 		</p>
	 */ 
	public static final double Const__DOUBLE = 10.12;
	
	/**
	  * <p>@value = <code>10AHAHAH10.12     1013</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__STRING_10 = "10" + "AHAHAH" + Const__DOUBLE + "     " + Const__INT + 13;
	
	/**
	  * <p>@value = <code>10.12</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__STRING_10_12 = "10.12";
	
	/**
	  * <p>@value = <code>A</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__STRING_A = "A";
	
	/**
	  * Constants concated<p>@value = <code>ADDRESS _ foo _ 10AHAHAH10.12     10130.0</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__BAA = Const__ADDRESS_UC + " _ foo _ " + Const__STRING_10 + Const__DECIMAL_0;
	
	//
	// DTOS
	//
	/**
	  * <p>
	 */ 
	public static final String Dto__TestPayload = "TestPayload";
	
	//
	// ENTITIES
	//
	/**
	  * <p>
	 */ 
	public static final String Entity__TestEntity = "TestEntity";
	
	//
	// GENERATORS
	//
	/**
	  * Generator for My-Customer<p>
	  * 		<b><i>Used Generators:</i></b><br>
	  * 		<ul>
	  * 		<li><b>Common Moba Generator</b>  <i>under (Apache v2</i>) - The open source generator for Moba projects: <code>org.mobadsl.grammar.generator.common:0.3.1-SNAPSHOT</code></li>
	  * 		<li><b>OSGi REST services</b>  <i>under (EPL v1</i>) - Generates REST Services based on OSGi enRoute: <code>org.mobadsl.grammar.generator.server.rest:0.8.9-SNAPSHOT</code></li>
	  * 		</ul>
	 */ 
	public static final String Generator__My = "My";
	
	//
	// QUEUES
	//
	/**
	  * <p>
	 */ 
	public static final String Queue__ServerQueue = "ServerQueue";
	
	//
	// REST CUSTOM
	//
	/**
	  * <p>
	 */ 
	public static final String RestCustom__TestBase = "TestBase";
	
	/**
	  * <p>
	 */ 
	public static final String RestCustom__Test = "Test";
	
	/**
	  * <p>
	 */ 
	public static final String RestCustom__AnotherTest = "AnotherTest";
	
	//
	// SERVERS
	//
	/**
	  * <p>
	 */ 
	public static final String Server__My = "My";
	
	//
	// TANSPORT SERIALIZATION TYPE
	//
	/**
	  * <p>
	 */ 
	public static final String TransportSerialization__XML = "XML";
	
	/**
	  * <p>
	 */ 
	public static final String TransportSerialization__JSON = "JSON";
	
}
