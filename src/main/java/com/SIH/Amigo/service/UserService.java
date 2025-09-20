package com.SIH.Amigo.service;

import com.SIH.Amigo.model.MentorData;
import com.SIH.Amigo.model.Users;
import com.SIH.Amigo.model.UsersData;
import com.SIH.Amigo.repository.MentorDataRepository;
import com.SIH.Amigo.repository.UsersDataRepository;
import com.SIH.Amigo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UsersDataRepository usersDataRepository;

    @Autowired
    private MentorDataRepository mentorDataRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    AuthenticationManager authManger;

    public String register(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        usersRepository.save(user);
        return "success";
    }

    public String verify(String username , String password) {
        Authentication authentication = authManger
                .authenticate(new UsernamePasswordAuthenticationToken(username,password));

        if(authentication.isAuthenticated())
        {
            Users dbUser = usersRepository.findByUsername(username);
            return jwtService.generateToken(dbUser);
        }
        else return "fail";
    }

    public String addUserData(UsersData usersData) {
        usersDataRepository.save(usersData);
        return "successful";
    }

    public String addMentorData(MentorData mentorData) {
        mentorDataRepository.save(mentorData);
        return "successful";
    }
}
