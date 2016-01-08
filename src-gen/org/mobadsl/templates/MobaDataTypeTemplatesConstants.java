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
package org.mobadsl.templates;

/**
  * Contains a set of common datatypes.<p>@verson = <code>0.9.1-SNAPSHOT</code></p>
*/ 
public interface MobaDataTypeTemplatesConstants extends org.mobadsl.templates.MobaDateFormatTemplatesConstants{
	
	public static final String Application__MobaDataTypeTemplates_Name = "MobaDataTypeTemplates";
	public static final String Application__MobaDataTypeTemplates_Version = "0.9.1-SNAPSHOT";
	//
	// CONSTANTS
	//
	/**
	  * The minimum length of a description<p>@value = <code>0</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__DESCRIPTION_MIN_LENGTH = 0;
	
	/**
	  * The maximum length of a description<p>@value = <code>125</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__DESCRIPTION_MAX_LENGTH = 125;
	
	//
	// DATATYPES
	//
	/**
	  * Represents a String<p>
	 */ 
	public static final String Datatype__String = "String";
	
	/**
	  * Represents a String that must not be <code>null</code><p>
	 */ 
	public static final String Datatype__String_NotNull = "String_NotNull";
	
	/**
	  * Represents a String with max length of 25<p>
	 */ 
	public static final String Datatype__String_0to25 = "String_0to25";
	
	/**
	  * Represents a String with min length of 3 and a max length of 25<p>
	 */ 
	public static final String Datatype__String_3to25 = "String_3to25";
	
	/**
	  * Represents a Description with min length of 0 and a max length of 125<p>
	 */ 
	public static final String Datatype__Description = "Description";
	
	/**
	  * Represents a password.<p>
	 */ 
	public static final String Datatype__Password = "Password";
	
	/**
	  * <p>
	 */ 
	public static final String Datatype__int = "int";
	
	/**
	  * <p>
	 */ 
	public static final String Datatype__long = "long";
	
	/**
	  * <p>
	 */ 
	public static final String Datatype__double = "double";
	
	/**
	  * <p>
	 */ 
	public static final String Datatype__bool = "bool";
	
	/**
	  * Represents a ByteArray<p>
	 */ 
	public static final String Datatype__ByteArray = "ByteArray";
	
	/**
	  * Represents a number value <b>without fraction digits</b><p>
	 */ 
	public static final String Datatype__Number = "Number";
	
	/**
	  * Represents a decimal value <b>with fraction digits</b><p>
	 */ 
	public static final String Datatype__Decimal = "Decimal";
	
	/**
	  * Represents a decimal value <b>with fraction digits</b>.<br>
	  * It allows <code>7 pre-decimals</code> and <code>2 decimal places</code>.<p>
	 */ 
	public static final String Datatype__Decimal_7_2 = "Decimal_7_2";
	
	/**
	  * Represents a Date<p>
	  * 		@dateformat = default</br>
	 */ 
	public static final String Datatype__Date = "Date";
	
	/**
	  * Represents a Time<p>
	  * 		@dateformat = yy</br>
	 */ 
	public static final String Datatype__Time = "Time";
	
	/**
	  * Represents a TimeStamp<p>
	  * 		@dateformat = yyyy.mm.dd HH:mm:ss</br>
	 */ 
	public static final String Datatype__TimeStamp = "TimeStamp";
	
	/**
	  * Represents a Year in the pattern <code>"2015"</code><p>
	  * 		@dateformat = yyyy</br>
	 */ 
	public static final String Datatype__Year_Long = "Year_Long";
	
	/**
	  * Represents a Year in the pattern <code>"15"</code><p>
	  * 		@dateformat = yy</br>
	 */ 
	public static final String Datatype__Year_Short = "Year_Short";
	
	/**
	  * Represents a month following the pattern <code>Oct=10</code><p>
	  * 		@dateformat = mm</br>
	 */ 
	public static final String Datatype__Month = "Month";
	
	/**
	  * Represents a day following the pattern <code>2015.Oct.24=24</code><p>
	  * 		@dateformat = dd</br>
	 */ 
	public static final String Datatype__Day = "Day";
	
	/**
	  * encapsulates a Coordinate and location-specific logic<p>
	 */ 
	public static final String Datatype__GeoCoordinate = "GeoCoordinate";
	
	/**
	  * encapsulates a GEO Address and location-specific logic<p>
	 */ 
	public static final String Datatype__GeoAddress = "GeoAddress";
	
	/**
	  * An enum datatype for boolean values.<p>
	 */ 
	public static final String Datatype__BooleanEnum = "BooleanEnum";
	
	/**
	  * An enum datatype for gender.<p>
	 */ 
	public static final String Datatype__GenderEnum = "GenderEnum";
	
	/**
	  * An enum datatype for acceptance.<p>
	 */ 
	public static final String Datatype__AcceptanceEnum = "AcceptanceEnum";
	
	//
	// ENUMS
	//
	/**
	  * An enum datatype for boolean values.<p>
	 */ 
	public static final String Enum__BooleanEnum = "BooleanEnum";
	
	/**
	  * An enum datatype for gender.<p>
	 */ 
	public static final String Enum__GenderEnum = "GenderEnum";
	
	/**
	  * An enum datatype for acceptance.<p>
	 */ 
	public static final String Enum__AcceptanceEnum = "AcceptanceEnum";
	
}
