package net.javaguides.bankmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.bankmanagementsystem.entity.User;



public interface Userrepository extends JpaRepository<User,Long> {

}
