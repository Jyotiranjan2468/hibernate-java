package com.rosy1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Solution {
	@Id
	private int solutionId;
	private String solution;
	
	@ManyToOne
	private problem problem;


	public int getSolutionId() {
		return solutionId;
	}


	public void setSolutionId(int solutionId) {
		this.solutionId = solutionId;
	}


	public String getSolution() {
		return solution;
	}


	public void setSolution(String solution) {
		this.solution = solution;
	}


	public problem getProblem() {
		return problem;
	}


	public void setProblem(problem problem) {
		this.problem = problem;
	}


	public Solution(int solutionId, String solution, com.rosy1.problem problem) {
		super();
		this.solutionId = solutionId;
		this.solution = solution;
		this.problem = problem;
	}


	public Solution() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
