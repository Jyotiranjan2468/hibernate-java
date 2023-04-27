package com.rosy1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class problem {
	@Id
	private int problemId;
	private String problem;
	
	@OneToMany
	private List<Solution> solution;

	public int getProblemId() {
		return problemId;
	}

	public void setProblemId(int problemId) {
		this.problemId = problemId;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public List<Solution> getSolution() {
		return solution;
	}

	public void setSolution(List<Solution> solution) {
		this.solution = solution;
	}

	public problem(int problemId, String problem, List<Solution> solution) {
		super();
		this.problemId = problemId;
		this.problem = problem;
		this.solution = solution;
	}

	public problem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
