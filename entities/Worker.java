package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//composição de objetos
	private Department department;
	private List<HourContact> contracts = new ArrayList<>();
	
	public Worker() {
	}
	//quando tiver uma lista nos atributos, nao gerar construtor pra ela.
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContact> getContracts() {
		return contracts;
	}
	
	public void addContract (HourContact contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContact contract) {
		contracts.remove(contract);
	}
	
	
	
	
	
}
