package com.web.controller;

import java.io.File;

public class FileManager {

	private String booksPath;
	public FileManager(String booksPath) {
		this.booksPath = booksPath;
	}


	public String getBooksPath() {
		return booksPath;
	}
	
}
