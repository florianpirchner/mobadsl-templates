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
public interface MobaCachingTemplateConstants {
	
	public static final String Application__MobaCachingTemplate_Name = "MobaCachingTemplate";
	public static final String Application__MobaCachingTemplate_Version = "0.9.1-SNAPSHOT";
	//
	// CONSTANTS
	//
	/**
	  * caching type CACHE_NO
	  * the Entity will not be cached automatically<p>@value = <code>CACHE_NO</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CACHE_TYPE_NO = "CACHE_NO";
	
	/**
	  * caching type CACHE_RO
	  * the Entity will not be read from cache at start, but not cached automatically<p>@value = <code>CACHE_RO</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CACHE_TYPE_READ_ONLY = "CACHE_RO";
	
	/**
	  * caching type CACHE_RW
	  * the Entity will not be read from cache at start, and cached automatically<p>@value = <code>CACHE_RW</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CACHE_TYPE_READ_WRITE = "CACHE_RW";
	
	/**
	  * caching strategy CACHE_AT_EXIT
	  * Cache will be written to disc at exit of app<p>@value = <code>CACHE_AT_EXIT</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CACHE_STRATEGY_AT_EXIT = "CACHE_AT_EXIT";
	
	/**
	  * caching strategy CACHE_IMMEDIATELY
	  * Cache will be written to disc at every modification<p>@value = <code>CACHE_IMMEDIATELY</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CACHE_STRATEGY_IMMEDIATELY = "CACHE_IMMEDIATELY";
	
	/**
	  * caching strategy CACHE_TIMER
	  * Cache will be written at the end of the app and also every x seconds<p>@value = <code>CACHE_TIMER</code><br>
	  * 		@valueType = STRING
	  * 		</p>
	 */ 
	public static final String Const__CACHE_STRATEGY_TIMER = "CACHE_TIMER";
	
	/**
	  * Cache interval of 10<p>@value = <code>10</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__CACHE_INTERVAL_10 = 10;
	
	/**
	  * Cache interval of 100<p>@value = <code>100</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__CACHE_INTERVAL_100 = 100;
	
	/**
	  * Cache interval of 1000<p>@value = <code>1000</code><br>
	  * 		@valueType = NUMERIC
	  * 		</p>
	 */ 
	public static final int Const__CACHE_INTERVAL_1000 = 1000;
	
	//
	// CACHES
	//
	/**
	  * <p>
	 */ 
	public static final String Cache__SqLiteCache = "SqLiteCache";
	
	//
	// PERSISTENCE TYPES
	//
	/**
	  * Cache persists with JSON<p>
	 */ 
	public static final String PersistenceType__JSON = "JSON";
	
	/**
	  * Cache persists with SQLite<p>
	 */ 
	public static final String PersistenceType__SQ_LITE = "SQ_LITE";
	
}
