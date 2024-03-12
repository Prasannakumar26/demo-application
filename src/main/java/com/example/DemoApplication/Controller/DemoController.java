package com.example.DemoApplication.Controller;


import com.example.DemoApplication.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {


    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("main", model);
        return "main";
    }

    @GetMapping("/register")
    public String newUserRegistration(Model model) {
        model.addAttribute("registerRequest", model);
        return "register";
    }
    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("loginRegister", model);

        return "login";
    }
    @PostMapping("/register")
    public String register(@ModelAttribute Customer customer) {
        System.out.println("registerRequest"+customer);

        return "redirect:/login";
    }
    @PostMapping("/login")
    public String dashboard(Model model) {
        model.addAttribute("registerRequest", model);
        return "redirect:/newpage";
    }
    @GetMapping("/newpage")
    public String getNewPage(Model model) {
        // Add any necessary model attributes
        return "newpage"; // Make sure this matches the template name
    }

    @GetMapping("/transfer")
    public String getTransfer(Model model) {
        // Add any necessary model attributes
        return "transfer"; // Make sure this matches the template name
    }
}
