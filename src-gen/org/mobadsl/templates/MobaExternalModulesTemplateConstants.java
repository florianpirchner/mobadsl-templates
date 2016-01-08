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
  * Contains a set of <b>External Modules</b>.<p>@verson = <code>0.9.1-SNAPSHOT</code></p>
*/ 
public interface MobaExternalModulesTemplateConstants {
	
	public static final String Application__MobaExternalModulesTemplate_Name = "MobaExternalModulesTemplate";
	public static final String Application__MobaExternalModulesTemplate_Version = "0.9.1-SNAPSHOT";
	//
	// EXTERNAL MODULES
	//
	/**
	  * An external module for <b>bluetooth low energy</b> communication<p>
	 */ 
	public static final String Ext_Module__Bluetooth_LowEngergyModule = "Bluetooth_LowEngergyModule";
	
	/**
	  * An external module for <b>bluetooth SPP</b> communication<p>
	 */ 
	public static final String Ext_Module__Bluetooth_SPPModule = "Bluetooth_SPPModule";
	
	/**
	  * An external module for <b>bluetooth beacon</b> communication<p>
	 */ 
	public static final String Ext_Module__Bluetooth_BeaconModule = "Bluetooth_BeaconModule";
	
	/**
	  * An external module for NFC communication by <b>ID</b><p>
	 */ 
	public static final String Ext_Module__NFC_IdModule = "NFC_IdModule";
	
	/**
	  * An external module for NFC communication by <b>text</b><p>
	 */ 
	public static final String Ext_Module__NFC_TextModule = "NFC_TextModule";
	
	/**
	  * An external module for NFC communication by <b>custom payload</b><p>
	 */ 
	public static final String Ext_Module__NFC_CustomModule = "NFC_CustomModule";
	
	/**
	  * An external module for push communication<p>
	 */ 
	public static final String Ext_Module__PushModule = "PushModule";
	
}
