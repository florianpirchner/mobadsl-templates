package org.mobadsl.templates;

/**
  * Contains a set of <b>Triggers</b> for the different Types available.
  * All date format constants start with <code>"Trigger_"</code>.<p>@verson = <code>0.9.1-SNAPSHOT</code></p>
*/ 
public interface MobaTriggersTemplateConstants {
	
	public static final String Application__MobaTriggersTemplate_Name = "MobaTriggersTemplate";
	public static final String Application__MobaTriggersTemplate_Version = "0.9.1-SNAPSHOT";
	//
	// TRIGGERS
	//
	/**
	  * A trigger which is invoked on <b>App install</b><p>
	 */ 
	public static final String Trigger__Trigger_InstallAPP = "Trigger_InstallAPP";
	
	/**
	  * A trigger which is invoked on <b>App update</b><p>
	 */ 
	public static final String Trigger__Trigger_UpdateAPP = "Trigger_UpdateAPP";
	
	/**
	  * A trigger which is invoked on <b>Device restart</b><p>
	 */ 
	public static final String Trigger__Trigger_DeviceStart = "Trigger_DeviceStart";
	
	/**
	  * A trigger which is invoked by an <b>Email</b><p>
	 */ 
	public static final String Trigger__Trigger_Email = "Trigger_Email";
	
	/**
	  * A trigger which is invoked if a defined Geofence was <b>entered</b><p>
	 */ 
	public static final String Trigger__Trigger_GeoFence_Enter = "Trigger_GeoFence_Enter";
	
	/**
	  * A trigger which is invoked if a defined Geofence was <b>left</b><p>
	 */ 
	public static final String Trigger__Trigger_GeoFence_Leave = "Trigger_GeoFence_Leave";
	
	/**
	  * A trigger which is invoked by a <b>Push event</b><p>
	 */ 
	public static final String Trigger__Tigger_Push = "Tigger_Push";
	
	/**
	  * A trigger which is invoked by a <b>SMS</b><p>
	 */ 
	public static final String Trigger__Trigger_SMS = "Trigger_SMS";
	
}
