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
package com.costrategix.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.costrategix.core.service.CoreEntityManager;
import com.costrategix.user.domain.User;
import com.costrategix.user.repository.UserDao;

@Component
public class UserManager extends CoreEntityManager {
    
    @Autowired
    private UserDao userDao;
    
    public void save(User user) {
	userDao.persist(user);
    }
    
    public User find(Long id) {
	return (User) userDao.find(id);
    }
}
