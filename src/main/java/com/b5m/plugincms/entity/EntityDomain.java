package com.b5m.plugincms.entity;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.b5m.dao.annotation.Id;

public abstract class EntityDomain {
	
	@Id
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
}
