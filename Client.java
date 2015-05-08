/* @Jeffrey Zhou
 * Jzhou46
 * CS 342
 * Prof. Buy
 * 5/2/15
 * Homework 5
 * Client Class
 */


package edu.uic.cs342.Jzhou46;

public class Client {

	public static void main(String[] args){
		Thread tls = new TLSController();
		Thread ew = new EWSensor(); 
		
		System.out.println("Running TLS program....\n");
		
		tls.start();
		ew.start(); 	
	}
}
