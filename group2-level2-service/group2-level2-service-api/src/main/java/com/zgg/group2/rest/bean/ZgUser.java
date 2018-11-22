package com.zgg.group2.rest.bean;

import java.io.Serializable;

public class ZgUser implements Serializable{
    private static final long serialVersionUID = 1L;

	private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

	public ZgUser() {
		super();
	}

	public ZgUser(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}