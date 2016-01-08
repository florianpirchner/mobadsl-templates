package org.mobadsl.templates;

/**
  * Contains a set of <b>MIME-Type-Constants</b>.
  * All mime type constants start with <code>"MIMETYPE_"</code>.<p>@verson = <code>0.9.1-SNAPSHOT</code></p>
*/ 
public interface MobaMimeTypesTemplateConstants {
	
	public static final String Application__MobaMimeTypesTemplate_Name = "MobaMimeTypesTemplate";
	public static final String Application__MobaMimeTypesTemplate_Version = "0.9.1-SNAPSHOT";
	//
	// CONSTANTS
	//
	/**
	  * "text/css" -> .css<p>@value = <code>text/css</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__MIMETYPE__TEXT_CSS = "text/css";
	
	/**
	  * "text/html" -> *.htm *.html *.shtml<p>@value = <code>text/html</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__MIMETYPE__TEXT_HTML = "text/html";
	
	/**
	  * "text/javascript" -> *.js<p>@value = <code>text/javascript</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__MIMETYPE__TEXT_JAVASCRIPT = "text/javascript";
	
	/**
	  * "text/plain" -> *.txt<p>@value = <code>text/plain</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__MIMETYPE__TEXT_PLAIN = "text/plain";
	
	/**
	  * "text/richtext" -> *.rtx<p>@value = <code>text/richtext</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__MIMETYPE__TEXT_RICHTEXT = "text/richtext";
	
	/**
	  * "text/rtf" -> *.rtf<p>@value = <code>text/rtf</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__MIMETYPE__TEXT_RTF = "text/rtf";
	
	/**
	  * "text/xml" -> *.xml<p>@value = <code>text/xml</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__MIMETYPE__TEXT_XML = "text/xml";
	
	/**
	  * "video/mpeg" -> *.mpeg *.mpg *.mpe<p>@value = <code>video/mpeg</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__MIMETYPE__VIDEO_MPEG = "video/mpeg";
	
	/**
	  * "video/mov" -> *.qt *.mov<p>@value = <code>video/quicktime</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__MIMETYPE__VIDEO_MOV = "video/quicktime";
	
	/**
	  * POST with Parameters<p>@value = <code>application/x-www-form-urlencoded</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CONTENTTYPE_URL_ENCODED = "application/x-www-form-urlencoded";
	
	/**
	  * Multipart with Form Data
	  * Uplaoding Images and other stuff to Server<p>@value = <code>multipart/form-data</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CONTENTTYPE_MULTIPART_FORM = "multipart/form-data";
	
	/**
	  * POST with plain text as payload<p>@value = <code>text/plain</code><br>
	  * 		@valueType = CONSTANT
	  * 		</p>
	 */ 
	public static final String Const__CONTENTTYPE_TEXT_PLAIN = "text/plain";
	
	/**
	  * Content is a JPEG Image<p>@value = <code>image/jpeg</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CONTENTTYPE_IMG_JPG = "image/jpeg";
	
	/**
	  * POST with JSON as payload<p>@value = <code>application/json</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CONTENTTYPE_APP_JSON = "application/json";
	
	/**
	  * POST with XML as payload<p>@value = <code>application/xml</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CONTENTTYPE_APP_XML = "application/xml";
	
	/**
	  * POST with JSON as payload<p>@value = <code>application/json; charset=utf-8</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CONTENTTYPE_APP_JSON_UTF8 = "application/json; charset=utf-8";
	
	/**
	  * POST with XML as payload<p>@value = <code>application/xml; charset=utf-8</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CONTENTTYPE_APP_XML_UTF8 = "application/xml; charset=utf-8";
	
	/**
	  * POST as app-specific stream
	  * used from Multipart Uploads<p>@value = <code>application/octet-stream</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CONTENTTYPE_OCTET_STREAM = "application/octet-stream";
	
	/**
	  * Some REST API requires this special parameter<p>@value = <code>$format</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__PARAMETER_FORMAT = "$format";
	
	/**
	  * <p>@value = <code>JSON</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__PARAMETER_FORMAT_JSON = "JSON";
	
	/**
	  * <p>@value = <code>en-US,en;q=0.8</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__LANGUAGE_EN = "en-US,en;q=0.8";
	
	/**
	  * <p>@value = <code>de-DE,en,*</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__LANGUAGE_DE = "de-DE,en,*";
	
	/**
	  * <p>@value = <code>Accept</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__RAWHEADER_ACCEPT = "Accept";
	
	/**
	  * <p>@value = <code>Accept-Language</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__RAWHEADER_ACCEPT_LANGUAGE = "Accept-Language";
	
	/**
	  * <p>@value = <code>Authorization</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__RAWHEADER_AUTHENTICATION = "Authorization";
	
	/**
	  * <p>@value = <code>X-SMP-APPCID</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__RAWHEADER_SAP_APPCID = "X-SMP-APPCID";
	
	/**
	  * <p>@value = <code>X-CSRF-TOKEN</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__RAWHEADER_SAP_WRITE_TOKEN = "X-CSRF-TOKEN";
	
	/**
	  * <p>@value = <code>X-SMP-SESSID</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__RAWHEADER_SAP_SESSION_ID = "X-SMP-SESSID";
	
}
