package net.javaguides.bankmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.bankmanagementsystem.dto.UserRegistrationDto;
import net.javaguides.bankmanagementsystem.entity.User;
import net.javaguides.bankmanagementsystem.repository.Userrepository;
import net.javaguides.bankmanagementsystem.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    
    private Userrepository Userrepository;
    
    public UserServiceImpl(net.javaguides.bankmanagementsystem.repository.Userrepository userrepository) {
        this.Userrepository = userrepository;
    }

    @Override
    public List<User> getAllUsers() {
        
        return Userrepository.findAll();
    }

    @Override
    public User saveUser(User user){
        return Userrepository.save(user);
    }


    @Override
    public User getUserById(Long id)
    {
        return Userrepository.findById(id).get();
    }

    @Override
    public User updatUser(User user)
    {
        return Userrepository.save(user);
    }

    @Override
    public void deleteUserById(Long id){
        Userrepository.deleteById(id);
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user=new User(registrationDto.getFirstName(),registrationDto.getLastName(),registrationDto.getEmail());
        return Userrepository.save(user);




    }

   



    

    
    
     

    





    
}
