package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sample.api.facebook.Facebook;
import sample.api.facebook.Groups;

@Controller
public class HomeController {

	private Facebook facebook;

	@Autowired
	public HomeController(Facebook facebook) {
		this.facebook = facebook;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		Groups groups = facebook.getGroups();
		model.addAttribute("profile", facebook.getProfile());
		model.addAttribute("groups", groups.getData());
		return "home";
	}


	
}
