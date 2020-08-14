package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDAO {

	void Insert(Department obj);
	void Alter(Department obj);
	void DeleteByID(Integer id);
	Department FindById(Integer id);
	List<Department> findALL();
	
}
