/**
 *  Copyright (C) 2008-2017  Telosys project org. ( http://www.telosys.org/ )
 *
 *  Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.gnu.org/licenses/lgpl.html
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.telosys.tools.dsl;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.telosys.tools.dsl.parser.model.DomainNeutralTypes;

public class KeyWords {

	/**
	 * String to start a single line comment
	 */
	private final static String SINGLE_LINE_COMMENT = "//" ;
	
	/**
	 * List annotations names (# means numeric parameter required)
	 */
	private final static String[] annotations = { 
		
		AnnotationName.ID, // "Id",
		AnnotationName.AUTO_INCREMENTED,
		
		AnnotationName.NOT_NULL, //"NotNull",
		AnnotationName.NOT_EMPTY, 
		AnnotationName.NOT_BLANK, 
		
		AnnotationName.MIN + "#", //"Min#",      // # means decimal parameter
		AnnotationName.MAX + "#", //"Max#",      // # means decimal parameter
		AnnotationName.SIZE_MIN + "%", // "SizeMin%",  // % means integer parameter
		AnnotationName.SIZE_MAX + "%", // "SizeMax%",  // % means integer parameter
		AnnotationName.PAST, // "Past",
		AnnotationName.FUTURE, // "Future",
		
		AnnotationName.PRIMITIVE_TYPE,
		AnnotationName.UNSIGNED_TYPE,
		AnnotationName.OBJECT_TYPE,
		AnnotationName.SQL_TYPE,

		AnnotationName.LONG_TEXT,
		
		AnnotationName.EMBEDDED // "Embedded"
		// In the future 
		// "DbColumn$" // $ means string parameter
		// "DbTable$"  // $ means string parameter
		// etc
	} ;
	
	/**
	 * Return the single line comment string (ie '//' )  <br>
	 * @return
	 */
	public final static String getSingleLineComment() {
		return SINGLE_LINE_COMMENT ;
	}
	
	/**
	 * Return the list of neutral types keywords <br>
	 * e.g. 'string', 'integer', 'decimal', etc
	 * @return
	 */
	public final static List<String> getNeutralTypes() {
		return DomainNeutralTypes.getNames();
	}
	
	/**
	 * Return the list of annotations keywords with specific ending character if any<br>
	 * e.g. 'Id', 'NotNull', 'Min#', 'Max#', etc
	 * @return
	 */
	public final static List<String> getAnnotations() {
		return new LinkedList<String>(Arrays.asList(annotations));
	}
	
}