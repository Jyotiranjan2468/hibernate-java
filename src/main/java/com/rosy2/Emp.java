package com.rosy2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Emp {
	@Id
	private int eId;
	private String eName;
	
	@ManyToMany
	private List<Project> project;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Emp(int eId, String eName, List<Project> project) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.project = project;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
