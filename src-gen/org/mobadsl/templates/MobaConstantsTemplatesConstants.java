package org.mobadsl.templates;

/**
  * Contains a set of <b>Constants</b>.<p>@verson = <code>0.9.1-SNAPSHOT</code></p>
*/ 
public interface MobaConstantsTemplatesConstants {
	
	public static final String Application__MobaConstantsTemplates_Name = "MobaConstantsTemplates";
	public static final String Application__MobaConstantsTemplates_Version = "0.9.1-SNAPSHOT";
	//
	// CONSTANTS
	//
	/**
	  * A constant to mark data as undefined<p>@value = <code>undefined</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__UNDEFINED = "undefined";
	
	/**
	  * A constant to mark a variable, that data needs to become defined by a subtype. <br>
	  * This subtype needs to use the <code>extends {XYZ}</code> to override this setting.<p>
	  * For instance:<br>
	  * <code>server Foo url=TO_BE_DEFINED_BY_SUBTYPE {<br>
	  * ...<br>
	  * }</code><br>
	  * <br>
	  * This URL is not a valid URL. But instead the subtype needs to redefine the URL:<br><br>
	  * <code>server Baa url="http://www.example.com/baa" extends Foo {<br>
	  * ...<br>
	  * }</code><br>
	  * <br><p>@value = <code>toBeDefinedBySubclass</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__TO_BE_DEFINED_BY_SUBTYPE = "toBeDefinedBySubclass";
	
	/**
	  * A constant for <b>ok</b> in lower case.<p>@value = <code>ok</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__OK = "ok";
	
	/**
	  * A constant for <b>not ok</b> in lower case.<p>@value = <code>not ok</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__NOK = "not ok";
	
	/**
	  * A constant for <b>null</b> in lower case.<p>@value = <code>null</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__NULL = "null";
	
	/**
	  * A constant for <b>name</b> in lower case<p>@value = <code>name</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__NAME_LC = "name";
	
	/**
	  * A constant for <b>NAME</b> in lower case<p>@value = <code>NAME</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__NAME_UC = "NAME";
	
	/**
	  * A constant for <b>Name</b> in upper case<p>@value = <code>Name</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__NAME_FIRST_UC = "Name";
	
	/**
	  * A constant for <b>description</b> in lower case<p>@value = <code>description</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__DESCRIPTION_LC = "description";
	
	/**
	  * A constant for <b>DESCRIPTION</b> in upper case<p>@value = <code>DESCRIPTION</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__DESCRIPTION_UC = "DESCRIPTION";
	
	/**
	  * A constant for <b>Description</b> in upper case<p>@value = <code>Description</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__DESCRIPTION_FIRST_UC = "Description";
	
	/**
	  * A constant for <b>address</b> in lower case<p>@value = <code>address</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__ADDRESS_LC = "address";
	
	/**
	  * A constant for <b>ADDRESS</b> in upper case<p>@value = <code>ADDRESS</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__ADDRESS_UC = "ADDRESS";
	
	/**
	  * A constant for <b>Description</b> in upper case<p>@value = <code>Address</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__ADDRESS_FIRST_UC = "Address";
	
	/**
	  * A constant for <b>id</b> in lower case<p>@value = <code>id</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__ID_LC = "id";
	
	/**
	  * A constant for <b>ID</b> in upper case<p>@value = <code>ID</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__ID_UC = "ID";
	
	/**
	  * A constant for <b>Id</b> in first upper case<p>@value = <code>Id</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__ID_FIRST_UC = "Id";
	
	/**
	  * A constant for <b>uuid</b> in lower case<p>@value = <code>uuid</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__UUID_LC = "uuid";
	
	/**
	  * A constant for <b>UUID</b> in lower case<p>@value = <code>UUID</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__UUID_UC = "UUID";
	
	/**
	  * A constant for <b>Uuid</b> in first upper case<p>@value = <code>Uuid</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__UUID_FIRST_UC = "Uuid";
	
}
