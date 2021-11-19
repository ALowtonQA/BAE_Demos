package com.qa.generics;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface DAOInterface<T> {

	// Create
	T create(T t);
	
	// Read All
	List<T> readAll();
	
	// Read by id
	T read(Long id);

	// Update
	T update(T t);

	// Delete
	int delete(long id);

	// ModelFromResultSet
	T modelFromResultSet(ResultSet resultSet) throws SQLException;
	
}
