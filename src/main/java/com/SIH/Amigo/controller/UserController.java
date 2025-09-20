package com.SIH.Amigo.controller;

import com.SIH.Amigo.model.MentorData;
import com.SIH.Amigo.model.Users;
import com.SIH.Amigo.model.UsersData;
import com.SIH.Amigo.service.JwtService;
import com.SIH.Amigo.service.UserService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody Users user)
    {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestParam String username ,@RequestParam String password)
    {
        return userService.verify(username,password);
    }

    @PostMapping("/addUserData")
    public String addUserData(
            @RequestParam String name,
            @RequestParam List<String> interests,
            @RequestParam String dateOfBirth, // yyyy-MM-dd
            @RequestParam int markSSC,
            @RequestParam int markHSC,
            @RequestParam String schoolName,
            @RequestParam String address,
            @RequestParam String phoneNo,
            @RequestParam String gender,
            @RequestParam String mailId,
            @RequestParam(value = "profilePhoto", required = false) MultipartFile profilePhoto,
            @AuthenticationPrincipal UserDetails userDetails
    ) {
        String username = userDetails.getUsername();

        UsersData usersData = new UsersData();
        usersData.setUsername(username);
        usersData.setName(name);
        usersData.setInterests(interests);
        usersData.setDateOfBirth(LocalDate.parse(dateOfBirth));
        usersData.setMarkSSC(markSSC);
        usersData.setMarkHSC(markHSC);
        usersData.setSchoolName(schoolName);
        usersData.setAddress(address);
        usersData.setPhoneNo(phoneNo);
        usersData.setGender(gender);
        usersData.setMailId(mailId);

        if (profilePhoto != null && !profilePhoto.isEmpty()) {
            try {
                usersData.setProfilePhoto(profilePhoto.getBytes());
            } catch (IOException e) {
                throw new RuntimeException("Error converting file to bytes", e);
            }
        }

        return userService.addUserData(usersData);
    }

    @PostMapping("/addMentorData")
    public String addMentorData(@RequestParam String name,
                                @RequestParam List<String> specialization,
                                @RequestParam String gender,
                                @RequestParam String organization,
                                @RequestParam String phoneNo,
                                @RequestParam String dateOfBirth,
                                @RequestParam String mailId,
                                @RequestParam(value = "profilePhoto", required = false) MultipartFile profilePhoto,
                                @AuthenticationPrincipal UserDetails userDetails)
    {
        String username = userDetails.getUsername();

        MentorData mentorData = new MentorData();
        mentorData.setUsername(username);
        mentorData.setName(name);
        mentorData.setSpecialization(specialization);
        mentorData.setGender(gender);
        mentorData.setOrganization(organization);
        mentorData.setPhoneNo(phoneNo);
        mentorData.setDateOfBirth(LocalDate.parse(dateOfBirth));
        mentorData.setMailId(mailId);

        if (profilePhoto != null && !profilePhoto.isEmpty()) {
            try {
                mentorData.setProfilePhoto(profilePhoto.getBytes());
            } catch (IOException e) {
                throw new RuntimeException("Error converting file to bytes", e);
            }
        }
        return userService.addMentorData(mentorData);
    }

}
