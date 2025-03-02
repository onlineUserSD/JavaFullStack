package com.saad.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saad.model.Product;
import com.saad.service.ProductService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
 
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:3000/")
public class ProductController {
@Autowired
private ProductService pservice;
@PostMapping("/add")
public ResponseEntity<String> adddata(@RequestBody Product p)
{
	String msg="DATA INSERTED";
	pservice.addData(p);
	return new ResponseEntity<String>(msg,HttpStatus.CREATED);
}

@GetMapping("/fetch")
public  ResponseEntity<List<Product>> getData()
{
	List<Product> plist=pservice.getData();
	return new ResponseEntity<List<Product>>(plist,HttpStatus.OK);
}

@GetMapping("/fetch/{pid}")
public ResponseEntity<Product> getDatabyId(@PathVariable String pid)
{
	return new ResponseEntity<Product>(pservice.getDataById(pid),HttpStatus.OK);
}
@DeleteMapping("/del/{pid}")
 public ResponseEntity<String> deletedata(@PathVariable String pid)
 {
	 String msg="DATA DELETED";
	 pservice.deleteData(pid);
	 return new ResponseEntity<String>(msg,HttpStatus.OK);
 }

//@PutMapping("/upd/{pid}")

//public ResponseEntity<Product> updateData(@PathVariable String pid,@RequestBody Product ps){
//	Product p =pservice.updateData(pid,ps);
//	return new ResponseEntity<Product>(p,HttpStatus.OK);
//}
@PutMapping("/upd/{pid}")
public ResponseEntity<String> updateData(@PathVariable String pid,@RequestBody Product ps){
     
	Product p =pservice.getDataById(pid);
			if(p!=null) {
				Product pOld=pservice.updateData(pid,ps);
				return new ResponseEntity<String>("Product updated succesfully",HttpStatus.OK);
			}
			else {
				return new ResponseEntity<String>("Not found",HttpStatus.NOT_FOUND);
			}
	 
}





}
