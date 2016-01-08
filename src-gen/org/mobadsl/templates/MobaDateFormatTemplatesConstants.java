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
  * Contains a set of <b>DateFormat-Constants</b>.
  * All date format constants start with <code>"DF_"</code>.<p>@verson = <code>0.9.1-SNAPSHOT</code></p>
*/ 
public interface MobaDateFormatTemplatesConstants {
	
	public static final String Application__MobaDateFormatTemplates_Name = "MobaDateFormatTemplates";
	public static final String Application__MobaDateFormatTemplates_Version = "0.9.1-SNAPSHOT";
	//
	// CONSTANTS
	//
	/**
	  * Time in the form <code>07:23</code> for <code>2015.Oct.10 07:23.11234</code><p>@value = <code>HH:mm:ss</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__DF_TIME = "HH:mm:ss";
	
	/**
	  * Time in the form <code>2015.Oct.10 07:23.11234</code> for <code>2015.Oct.10 07:23.11234</code><p>@value = <code>yyyy.mm.dd HH:mm:ss</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__DF_TIME_STAMP = "yyyy.mm.dd HH:mm:ss";
	
	/**
	  * Year in the form <code>15</code> for <code>2015</code><p>@value = <code>yy</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__DF_YEAR_SHORT = "yy";
	
	/**
	  * Year in the form <code>2015</code> for <code>2015</code><p>@value = <code>yyyy</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__DF_YEAR_LONG = "yyyy";
	
	/**
	  * Month in the form <code>10</code>.<p>@value = <code>mm</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__DF_MONTH = "mm";
	
	/**
	  * Day in the form <code>10</code>.<p>@value = <code>dd</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__DF_DAY = "dd";
	
	/**
	  * Date in the form <code>2015-12-24</code> for <code>2015.Dec.24 07:23.11234</code><p>@value = <code>yyyy-MM-dd</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__DF_YEAR_MONTH_DAY = "yyyy-MM-dd";
	
	/**
	  * Date in the form <code>2015-12-24 07:23:00</code> for <code>2015.Dec.24 07:23.11234</code><p>@value = <code>yyyy-MM-dd hh:mm:ss</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__DF_YEAR_MONTH_DAY_HOUR_MIN_SEC = "yyyy-MM-dd hh:mm:ss";
	
}
