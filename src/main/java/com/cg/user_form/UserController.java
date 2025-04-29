package com.cg.user_form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/page1")
    public String showFirstPage() {
        return "first-page";
    }

    @PostMapping("/page2")
    public String goToSecondPage(@RequestParam String firstName,
                                 @RequestParam String lastName,
                                 Model model) {
        UserModel user = context.getBean(UserModel.class);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        model.addAttribute("user", user);
        return "second-page";
    }

    @PostMapping("/page3")
    public String goToThirdPage(@RequestParam String email,
                                @RequestParam String phone,
                                Model model) {
        UserModel user = context.getBean(UserModel.class);
        user.setEmail(email);
        user.setPhone(phone);
        model.addAttribute("user", user);
        return "third-page";
    }

    @PostMapping("/page4")
    public String goToFourthPage(@RequestParam String city,
                                 @RequestParam String country,
                                 Model model) {
        UserModel user = context.getBean(UserModel.class);
        user.setCity(city);
        user.setCountry(country);
        model.addAttribute("user", user);
        return "summary";
    }
}
