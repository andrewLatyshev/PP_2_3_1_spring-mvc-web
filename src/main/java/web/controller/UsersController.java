package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.UserDaoIml;
import web.models.User;

import java.util.List;

@Controller
//@RequestMapping("/")
public class UsersController {

	private UserDaoIml userDaoIml;

	public UsersController(UserDaoIml userDaoIml) {
		this.userDaoIml = userDaoIml;
	}

//	@GetMapping("/")
//	public String homePage(Model model) {
//		model.addAttribute("welcome","This is Homepage");
//		return "index";
//	}

	@GetMapping( value = "/")
	public String showAllUsers(Model model) {
		List<User> users = userDaoIml.getAllUsers();
		model.addAttribute("users", users);
		return "index";
	}

	@GetMapping("/{id}")
	public String showUser(@PathVariable("id") int id, Model model) {
		model.addAttribute("showuser", userDaoIml.showUser(id));
		return "show";
	}


//	public String removeById() {
//		return null;
//	}

}