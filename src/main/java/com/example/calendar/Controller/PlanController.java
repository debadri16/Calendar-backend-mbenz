package com.example.calendar.Controller;

import java.util.ArrayList;

import com.example.calendar.Model.Plan;
import com.example.calendar.Repository.PlanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("plans")
public class PlanController {

    @Autowired
	private PlanRepository planRepo;
    
    @GetMapping("/get")
	public Object get(){
		// if(!header.equals(authKey)) {
		// 	return new ResponseEntity<Integer>(HttpStatus.UNAUTHORIZED);
		// }
		return (ArrayList<Plan>) planRepo.findAll();
	}

    @PostMapping("/save")
	public Object save(@RequestBody Plan plan) {
		// if(!header.equals(authKey)) {
		// 	return new ResponseEntity<Integer>(HttpStatus.UNAUTHORIZED);
		// }
		return(planRepo.save(plan));
	}

    // @PutMapping("/update")
	// public Object update(@RequestBody Plan plan) {
	// 	// if(!header.equals(authKey)) {
	// 	// 	return new ResponseEntity<Integer>(HttpStatus.UNAUTHORIZED);
	// 	// }
	// 	return(planRepo.s);
	// }

    @DeleteMapping("/delete")
	public Object delete(@RequestBody Long id) {
		// if(!header.equals(authKey)) {
		// 	return new ResponseEntity<Integer>(HttpStatus.UNAUTHORIZED);
		// }
        planRepo.deleteById(id);
		return(new String("Plan deleted"));
	}

}
