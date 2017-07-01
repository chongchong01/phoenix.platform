/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.suren.autotest.platform.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suren
 * @date 2017年2月11日 下午9:29:18
 */
@RestController
@RequestMapping("/api/user_manager")
public class UserManagerApiController
{
	@Autowired
	private SessionRegistry sessionRegistry;
	
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public int onLineCount()
	{
		return sessionRegistry.getAllPrincipals().size();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Object> onLineUser()
	{
		return sessionRegistry.getAllPrincipals();
	}

}
