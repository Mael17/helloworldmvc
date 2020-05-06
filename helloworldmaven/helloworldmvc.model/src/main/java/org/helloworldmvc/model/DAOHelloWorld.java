package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class DAOHelloWorld {
	private static String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	private Model model;
	
	private void DAOHelloWorld() {
	}
	private  DAOHelloWorld() {
		return;
	}
	private static void setInstance(DAOHelloWorld instance) {
	}
	private void readFile() throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(FileName), "UTF-8"));
		String line = read.readLine();
		read.close();
		System.out.println(line);

		
	}
	public String getHelloWorldMessage() {
		return helloWorldMessage;
		
	}
	public void setHelloWorldMessage(String helloWorldMessage) {
		
	}
}


