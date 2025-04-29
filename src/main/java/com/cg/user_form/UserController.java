package com.cg.user_form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
//@SessionAttributes("user")
public class UserController {
    @GetMapping("/page1")
    public String showPage1() {
        return "first-page";
    }

    @PostMapping("/page2")
    public String goToPage2(Model model, UserModel user) {
        model.addAttribute("user", user);
        return "second-page";
    }

    @PostMapping("/page3")
    public String goToPage3(Model model, UserModel user) {
        model.addAttribute("user", user);
        return "third-page";
    }

    @PostMapping("/page4")
    public String goToPage4(Model model, UserModel user) {
        model.addAttribute("user", user);
        return "summary";
    }

    /*@ModelAttribute("user")
    public UserModel setUpUserForm() {
        return new UserModel();
    }

    @GetMapping("/")
    public String showFirstPage() {
        return "first-page";
    }

    @PostMapping("/page2")
    public String goToSecondPage(@ModelAttribute("user") UserModel user,
                                 @RequestParam String firstName,
                                 @RequestParam String lastName) {
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return "second-page";
    }

    @PostMapping("/page3")
    public String goToThirdPage(@ModelAttribute("user") UserModel user,
                                @RequestParam String email,
                                @RequestParam String phone) {
        user.setEmail(email);
        user.setPhone(phone);
        return "third-page";
    }

    @PostMapping("/page4")
    public String goToFourthPage(@ModelAttribute("user") UserModel user,
                                 @RequestParam String city,
                                 @RequestParam String country) {
        user.setCity(city);
        user.setCountry(country);
        return "summary";
    }*/
}
