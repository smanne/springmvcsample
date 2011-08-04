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
package com.costrategix.core.domain;


import java.lang.reflect.Field;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class CoreEntity {
    
    @Id @GeneratedValue
    protected Long id;
    
    protected Date createdDateTime;
    protected Date updatedDateTime;
    protected int status;
    
    private static Field[] columns;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Date getCreatedDateTime() {
        return createdDateTime;
    }
    
    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
    
    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }
    
    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }
    
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    
    @PrePersist
    protected void onCreate() {
      createdDateTime = new Date(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
      updatedDateTime = new Date(System.currentTimeMillis());
    }
    
    public Field[] getColumns()
    {
	columns = this.getClass().getDeclaredFields();
	return columns;
    }
}
