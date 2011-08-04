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
package com.costrategix.account.domain;

import javax.persistence.Entity;
import com.costrategix.core.domain.CoreEntity;

@Entity
public class Account extends CoreEntity {
	
	private String name;
	private String password;
	
	public String getName() {
	    return name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	public String getPassword() {
	    return password;
	}
	
	public void setPassword(String password) {
	    this.password = password;
	}
}
