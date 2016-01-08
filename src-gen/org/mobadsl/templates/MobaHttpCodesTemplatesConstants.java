package org.mobadsl.templates;

/**
  * Contains a set of common HTTP status code constants.<br>
  * Constants start with <code>"HTTP_CODE_"</code><p>@verson = <code>0.9.1-SNAPSHOT</code></p>
*/ 
public interface MobaHttpCodesTemplatesConstants extends org.mobadsl.templates.MobaDataTypeTemplatesConstants{
	
	public static final String Application__MobaHttpCodesTemplates_Name = "MobaHttpCodesTemplates";
	public static final String Application__MobaHttpCodesTemplates_Version = "0.9.1-SNAPSHOT";
	//
	// CONSTANTS
	//
	/**
	  * OK<p>@value = <code>200</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__HTTP_CODE_200 = 200;
	
	/**
	  * No Content<p>@value = <code>204</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__HTTP_CODE_204 = 204;
	
	/**
	  * Bad request<p>@value = <code>400</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__HTTP_CODE_400 = 400;
	
	/**
	  * Internal Server Error<p>@value = <code>500</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__HTTP_CODE_500 = 500;
	
	//
	// DTOS
	//
	/**
	  * A default http response data transfer object. May become extended by clients.<p>
	 */ 
	public static final String Dto__DefaultHttpResponseDto = "DefaultHttpResponseDto";
	
}
