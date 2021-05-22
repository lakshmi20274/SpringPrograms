package com.webservice.exception;

public class ProductNotFoundException extends RuntimeException {
	   private static final long serialVersionUID = 1L;
	  	   
	  //userdefined Exceptions
	   public ProductNotFoundException() {
		   super("Product Not Found Exception");
	   }
	   
	   public String toString() {
		   return "Exception is ProductNotFoundException";
	   }
	}
