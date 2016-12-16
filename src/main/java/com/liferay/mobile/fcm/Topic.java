/*
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.fcm;

import com.liferay.mobile.fcm.exception.InvalidTopicNameException;

/**
 * @author Bruno Farache
 */
public class Topic {

	public Topic(String name) throws InvalidTopicNameException {
		if (!name.matches("[a-zA-Z0-9-_.~%]+")) {
			throw new InvalidTopicNameException(name);
		}

		this.name = name;
	}

	public String name() {
		return name;
	}

	@Override
	public String toString() {
		return "'" + name + "' in topics";
	}

	Topic() {
	}

	protected String name;

}