
/*
 *  
é por aqui que os usuários chegam aos dados, o teste pode ser feito 
via POSTMAN:
 
	GET localhost:8080/categories/1 OU localhost:8080/categories
 
*/

package com.hmarianno.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmarianno.course.entities.Category;
import com.hmarianno.course.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {

	
	@Autowired
	private CategoryService service;
	
	/* end point para buscar todas as categorias */	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List <Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	/* end point para buscar por Id */	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
