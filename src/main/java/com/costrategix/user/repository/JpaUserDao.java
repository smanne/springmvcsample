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
package com.costrategix.user.repository;


import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.costrategix.core.domain.CoreEntity;
import com.costrategix.core.repository.JpaEntityDao;
import com.costrategix.user.domain.User;
@Component
public class JpaUserDao extends JpaEntityDao implements UserDao {

    public List<User> getAllList() {
	TypedQuery<User> query = em.createQuery(
                "SELECT u FROM User u", User.class);
        return query.getResultList();
    }

    public void remove(CoreEntity entity) {
	em.remove(entity);
    }

    public List<User> getAllList(int recordsPerPage, int pageNumber) {
	TypedQuery<User> query = em.createQuery(
                "SELECT u FROM User u", User.class);
	query.setFirstResult(pageNumber*recordsPerPage);
	query.setMaxResults(recordsPerPage);
        return query.getResultList();
    }

    public CoreEntity find(Long id) {
	return em.find(User.class, id);
    }

}
