/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * This file is part of jscms
 *  
 * Author: Sandeep Manne
 * ver. 1.00
 * Copyright: CoStrategix <info@costrategix.com>
 *
 * jscms is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * jscms is distributed WITHOUT ANY WARRANTY.
 * See the license for more details.
 *  
 * You should have received a copy of the GNU General Public License
 * along with jscms. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.costrategix.user.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.costrategix.core.web.ResourceNotFoundException;
import com.costrategix.user.domain.User;
import com.costrategix.user.service.UserManager;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserManager userManager;

    @RequestMapping(method=RequestMethod.GET)
    public String getCreateForm(Model model) {
	model.addAttribute(new User());
	return "user/createForm";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String create(@Valid User user, BindingResult result) {
	if (result.hasErrors()) {
	    return "user/createForm";
	}
	userManager.save(user);
	return "redirect:/user/" + user.getId();
    }

    @RequestMapping(value="{id}", method=RequestMethod.GET)
    public String getView(@PathVariable Long id, Model model) {
	User user = userManager.find(id);
	if (user == null) {
	    throw new ResourceNotFoundException(id);
	}
	model.addAttribute(user);
	return "user/view";
    }
}
