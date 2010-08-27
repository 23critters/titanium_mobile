/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package ti.modules.titanium.map;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.util.TiConfig;

public class AnnotationProxy extends KrollProxy
{
	private static final String LCAT = "AnnotationProxy";
	private static final boolean DBG = TiConfig.LOGD;

	public AnnotationProxy(TiContext tiContext, Object[] args) {
		super(tiContext);

		if (DBG) {
			Log.d(LCAT, "Creating an Annotation");
		}
		if (args.length > 0) {
			setProperties((KrollDict) args[0]);
		}
	}
}
