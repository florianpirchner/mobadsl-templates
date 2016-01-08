/**
 * Copyright (c) 2015 - 2016, Lunifera GmbH (Wien), Ekkehard Gentz (Rosenheim)
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *           Florian Pirchner - Initial implementation
 */
package org.mobadsl.samples;

/**
  * Contains a set of common datatypes.<p>@verson = <code>0.9.1-SNAPSHOT</code></p>
*/ 
public interface MobaOverrideSampleConstants extends org.mobadsl.templates.MobaDataTypeTemplatesConstants,
		org.mobadsl.templates.MobaHttpCodesTemplatesConstants{
	
	public static final String Application__MobaOverrideSample_Name = "MobaOverrideSample";
	public static final String Application__MobaOverrideSample_Version = "0.9.1-SNAPSHOT";
	//
	// CONSTANTS
	//
	/**
	  * Overrides the template min length constant by a different value.<p>@value = <code>12</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__DESCRIPTION_MIN_LENGTH = 12;
	
	//
	// AUTHORIZATIONS
	//
	/**
	  * Overrides the O_AUTH2 authorization and adds properties "foo=bar" to it.<p>
	  * 		Properties: <code>foo=bar</code>
	 */ 
	public static final String Authorization__O_AUTH2 = "O_AUTH2";
	
	//
	// DATATYPES
	//
	/**
	  * This enum extends the GenderEnum with a <b>no sex</b> literal.<p>
	 */ 
	public static final String Datatype__SampleGenderEnum = "SampleGenderEnum";
	
	/**
	  * Overrides the "year short" datatype with a different format.<p>
	  * 		@dateformat = yyyy</br>
	 */ 
	public static final String Datatype__Year_Short = "Year_Short";
	
	//
	// DTOS
	//
	/**
	  * Adds the attribute foo to the DefaultHttpResponseDto<p>
	 */ 
	public static final String Dto__SampleHttpResponseDto = "SampleHttpResponseDto";
	
	//
	// ENUMS
	//
	/**
	  * This enum extends the GenderEnum with a <b>no sex</b> literal.<p>
	 */ 
	public static final String Enum__SampleGenderEnum = "SampleGenderEnum";
	
}
