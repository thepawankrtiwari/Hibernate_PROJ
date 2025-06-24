package com.controller;

import com.service.LibraryService;

public class LibraryController {

	public static void main(String[] args) {

		LibraryService ls= new LibraryService();
		ls.updateData();
	}

}
