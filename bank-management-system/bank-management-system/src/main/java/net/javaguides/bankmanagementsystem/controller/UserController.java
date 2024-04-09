package net.javaguides.bankmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import net.javaguides.bankmanagementsystem.entity.User;
import net.javaguides.bankmanagementsystem.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class UserController {

    //list the users

    private UserService UserService;

    public UserController(net.javaguides.bankmanagementsystem.service.UserService userService) {
        UserService = userService;
    }
    //handler method to handle list of users and return view 
    
    @GetMapping("/users")
    
    
    public String listUsers(Model model)
    {
        model.addAttribute("users",UserService.getAllUsers());
        return "users"; //returs a view 


    }
    
    @GetMapping("/users/new")
    public String createuserform(Model model){
        //create user obj to hold user from data
        User user=new User();
        model.addAttribute("user", user);
        return "create_user";

    }

    @PostMapping("/users")
    
    
    public String saveUser(@ModelAttribute("user") User user){
        UserService.saveUser(user);
        return "redirect:/users";




    }

    @GetMapping("/users/edit/{id}")

    public String editUserForm(@PathVariable Long id,Model model){
        model.addAttribute("user",UserService.getUserById(id));
        return "edit_user";
    }
    
    @PostMapping("/users/{id}")
    
    
    public String updateUser(@PathVariable Long id,
     @ModelAttribute("user") User user,
     Model model){
        //get user from database by id

        User existingUser=UserService.getUserById(id);
        existingUser.setId(id);
        existingUser.setFirstname(user.getFirstname());
        existingUser.setLastname(user.getLastname());
        existingUser.setEmail(user.getEmail());

        //save updated user
        UserService.updatUser(existingUser);
        return "redirect:/users";



    }

    //handler method for delete 
    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        UserService.deleteUserById(id);
        return "redirect:/users";


    }







}
