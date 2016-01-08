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
  * This template is the base template for the Open Source Moba Generator.<br>
  * If you are going to generate an mobile application based on the <code>org.mobadsl.grammar.generator.common</code> generator,
  * then you need to add this template as a "used template".
  * All Constants, Settings and Data are handled by the Generator.<p>@verson = <code>0.8.2</code></p>
*/ 
public interface MobaBaseTemplateConstants extends org.mobadsl.templates.MobaAuthorizationTemplateConstants,
		org.mobadsl.templates.MobaConstantsTemplatesConstants,
		org.mobadsl.templates.MobaDataTypeTemplatesConstants,
		org.mobadsl.templates.MobaDateFormatTemplatesConstants,
		org.mobadsl.templates.MobaExternalModulesTemplateConstants,
		org.mobadsl.templates.MobaHttpCodesTemplatesConstants,
		org.mobadsl.templates.MobaMimeTypesTemplateConstants,
		org.mobadsl.templates.MobaNumberTemplatesConstants,
		org.mobadsl.templates.MobaTriggersTemplateConstants,
		org.mobadsl.templates.MobaCachingTemplateConstants{
	
	public static final String Application__MobaBaseTemplate_Name = "MobaBaseTemplate";
	public static final String Application__MobaBaseTemplate_Version = "0.8.2";
	//
	// GENERATORS
	//
	/**
	  * The <i><b>Open Source Moba Generator</b></i>.<br>
	  * It supports all used templates.<p>
	  * 		<b><i>Used Generators:</i></b><br>
	  * 		<ul>
	  * 		<li><b>Common Moba Generator</b>  <i>under (Apache v2</i>) - The open source generator for Moba projects: <code>org.mobadsl.grammar.generator.common:0.3.1-SNAPSHOT</code></li>
	  * 		</ul>
	 */ 
	public static final String Generator__CommonMobaGenerator = "CommonMobaGenerator";
	
}
