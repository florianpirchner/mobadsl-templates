/**
 * Copyright (c) 2015 - 2016, Lunifera GmbH (Wien), Ekkehard-Gentz (Rosenheim)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.mobadsl.templates;

/**
  * Contains a set of <b>Authorization</b> constants and a UserLoginDto.
  * All date format constants start with <code>"AUTH_"</code>.<p>@verson = <code>0.9.1-SNAPSHOT</code></p>
*/ 
public interface MobaAuthorizationTemplateConstants extends org.mobadsl.templates.MobaDataTypeTemplatesConstants{
	
	public static final String Application__MobaAuthorizationTemplate_Name = "MobaAuthorizationTemplate";
	public static final String Application__MobaAuthorizationTemplate_Version = "0.9.1-SNAPSHOT";
	//
	// AUTHORIZATIONS
	//
	/**
	  * No authorization needed
	  * For public services
	  * For services behind the firewall through BlackBerry infrastructure<p>
	 */ 
	public static final String Authorization__NO = "NO";
	
	/**
	  * Authorization based on O_AUTH2.<br>
	  * See <a href="https://de.wikipedia.org/wiki/OAuth">Wikipedia O-Auth</a><p>
	 */ 
	public static final String Authorization__O_AUTH2 = "O_AUTH2";
	
	/**
	  * Follows the rules of SAP Mobile Pölatform
	  * (Token, APP-CID, ...)<p>
	 */ 
	public static final String Authorization__SAP_MOBILE_PLATFORM = "SAP_MOBILE_PLATFORM";
	
	/**
	  * Authorization based on User and Password.<p>
	 */ 
	public static final String Authorization__USER_PWD = "USER_PWD";
	
	/**
	  * Authorization based on User and Password.
	  * needs an extra TOKEN for WRITE, UPDATE, DELETE Access<p>
	 */ 
	public static final String Authorization__USER_PWD_WRITE_TOKEN = "USER_PWD_WRITE_TOKEN";
	
	/**
	  * Authorization based on App-specific TOKEN
	  * No username or password needed
	  * Only TOKEN
	  * makes sense if running inside a secure environment as BlackBerry Enterprise Service<p>
	 */ 
	public static final String Authorization__TOKEN_ONLY = "TOKEN_ONLY";
	
	/**
	  * Authorization based on Device PIN (BlackBerry) or IMEI (Android, ...)
	  * No username or password needed
	  * Only Device PIN
	  * makes sense if running inside a secure environment as BlackBerry Enterprise Service<p>
	 */ 
	public static final String Authorization__DEVICE_PIN = "DEVICE_PIN";
	
	/**
	  * Authorization based on Device PIN (BlackBerry) or IMEI (Android, ...)
	  * No username or password needed
	  * after registering with device PIN, app get's a TOKEN
	  * makes sense if running inside a secure environment as BlackBerry Enterprise Service<p>
	 */ 
	public static final String Authorization__DEVICE_PIN_AND_TOKEN = "DEVICE_PIN_AND_TOKEN";
	
	//
	// DTOS
	//
	/**
	  * A base data transfer object to send userName and password login information to a service.<br>
	  * May be extended by clients.<p>
	 */ 
	public static final String Dto__UserNameAndPasswordLoginRequestDto = "UserNameAndPasswordLoginRequestDto";
	
}
