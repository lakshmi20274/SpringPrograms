package com.webservice.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.webservice.exception.ProductNotFoundException;
import com.webservice.bean.Product;
import com.webservice.bean.*;

@RestController
public class ProductController {
   
	private static Map<String, Product> productRepo = new HashMap<>();
   static {
      Product honey = new Product();
      honey.setId("100");
      honey.setName("Honey");
      productRepo.put(honey.getId(), honey);
      
      Product almond = new Product();
      almond.setId("200");
      almond.setName("Almond");
      productRepo.put(almond.getId(), almond);
   }
   
   @RequestMapping(value="/")
   public String displayMessage(){
	   
	   return "Successfull webservice App";
	   
   }
   @RequestMapping(value="/products",method = RequestMethod.GET)
   public ResponseEntity<Object> getProducts() {
      return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
   }
   
 //write a code for post method
 	 @RequestMapping(value = "/product", method = RequestMethod.POST)
 	   public ResponseEntity<Object> saveProduct(@RequestBody Product p) {
 	      productRepo.put(p.getId(), p);
 	      return new ResponseEntity<>("product saved  successfully", HttpStatus.CREATED);
 	   }
   
     @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
   public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) { 
      if(!productRepo.containsKey(id))throw new ProductNotFoundException();
     
      productRepo.remove(id);
      product.setId(id+10);
      productRepo.put(id, product);
      return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
   }
}
