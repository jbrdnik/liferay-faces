/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.portal.util;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import com.liferay.faces.bridge.filter.HttpServletRequestAdapter;


/**
 * Since the Liferay CDI Portlet Bridge has a dependency on the {@link PortalUtil#getHttpServletRequest(PortletRequest)}
 * method, this class is necessary to provide a runtime compatibility layer.
 *
 * @author  Neil Griffin
 */
public class PortalUtil {

	public static HttpServletRequest getHttpServletRequest(PortletRequest portletRequest) {
		return new HttpServletRequestAdapter(portletRequest);
	}
}
