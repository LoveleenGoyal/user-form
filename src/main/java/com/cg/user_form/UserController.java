package com.cg.user_form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@SessionAttributes("user")
public class UserController {

    @ModelAttribute("user")
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
                                 @RequestParam String country,
                                 SessionStatus status) {
        user.setCity(city);
        user.setCountry(country);
        return "summary";
    }
}
