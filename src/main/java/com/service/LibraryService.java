package com.service;

import com.dao.LibraryDao;

public class LibraryService {

	public void updateData() {
		LibraryDao ld= new LibraryDao();
		ld.updateData();
	}
	
	public void insertData() {
		LibraryDao ld= new LibraryDao();
		ld.insertData();
	}
}
