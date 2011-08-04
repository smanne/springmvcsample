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
package com.costrategix.core.repository;

import java.util.List;

import com.costrategix.core.domain.CoreEntity;

public interface CoreEntityDao {
    
    /**
     * Return List of all elements for that entity
     * @return <code>List</code> of <code>Entity</code>
     */
    @SuppressWarnings("rawtypes")
    public List getAllList();
    
    public void persist(CoreEntity entity);
    
    public void remove(CoreEntity entity);
    
    /**
     * @param recordsPerPage - records per page
     * @param pageNumber     - page number to display
     * @return <code>List</code> of <code>Entity</code>
     */
    @SuppressWarnings("rawtypes")
    public List getAllList(int recordsPerPage, int pageNumber);
    
    public CoreEntity find(Long id); 
    
}
