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
package com.costrategix.core.service;

import java.util.List;

import com.costrategix.core.domain.CoreEntity;
import com.costrategix.core.repository.CoreEntityDao;

public abstract class CoreEntityManager {
    
    protected CoreEntityDao entityDao;
    
    @SuppressWarnings("rawtypes")
    public List getEntities()
    {
	return this.entityDao.getAllList();
    }
    
    @SuppressWarnings("rawtypes")
    public List getEntities(int recordsPerPage, int pageNumber)
    {
	return this.entityDao.getAllList(recordsPerPage, pageNumber);
    }
    
    public void addEntity(CoreEntity entity) 
    {
	this.entityDao.persist(entity);
    }
    
    public void getEnityByPk(Long id)
    {
	this.entityDao.find(id);
    }
    
    public void setDao(CoreEntityDao entityDao) {
	this.entityDao = entityDao;
    }
}
