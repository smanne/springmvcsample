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
package com.costrategix.user.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.costrategix.account.domain.Account;
import com.costrategix.core.domain.CoreEntity;

@Entity
public class User extends CoreEntity implements IUser {
    
    @OneToOne(cascade = {CascadeType.ALL}) 
    private Account primaryAccount;
    @NotNull
    @Size(min=1, max=25)
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    
    public Account getPrimaryAccount() {
        return primaryAccount;
    }
    
    public void setPrimaryAccount(Account primaryAccount) {
        this.primaryAccount = primaryAccount;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDob() {
        return dob;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    @Override
    public String toString() {
        return firstName + "(created on "+createdDateTime+")";
    }
}
