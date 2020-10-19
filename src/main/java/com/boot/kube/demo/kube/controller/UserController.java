package com.boot.kube.demo.kube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.boot.kube.demo.kube.dao.UserDao;
import com.boot.kube.demo.kube.model.User;

//@RestController
@Controller
public class UserController
{
	@Autowired
	UserDao repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addUser")
	public String addUser(User user)
	{
		repo.save(user);
		return "home.jsp";
	}
	@RequestMapping("/getUser")
	public ModelAndView getUser(@RequestParam int uid)
	{
		ModelAndView mv=new ModelAndView("showUser.jsp");
		User user=repo.findById(uid).orElse(new User());
		mv.addObject(user);
		return mv;
	}
	
	/*@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@PostMapping(path="/user",consumes= {"application/json"})
	public User addUser(@RequestBody User user)
	{
		repo.save(user);
		return user;
	}
	@GetMapping(path="/users")
	public Iterable<User> getUsers()
	{
		return repo.findAll();
	}
	@RequestMapping("/user/{uid}")
	public Optional<User> getUser(@PathVariable("uid")int uid)
	{
		return repo.findById(uid);	
	}*/
}


