package phanthau5.example.tuan2thjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import phanthau5.example.tuan2thjava.entity.Contact;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home(){
        return "home/index";    }
    @GetMapping("/contact")
    public String showContactForm(Model model){
        model.addAttribute("contact", new Contact());
        return "home/contact";
    }
    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute("contact") Contact contact,Model model){
        model.addAttribute("contact",contact);
        return "home/result";
    }

}
