package com.SIH.Amigo.service;

import com.SIH.Amigo.model.Users;
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

    public String verify(Users user) {
        Authentication authentication = authManger
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));

        if(authentication.isAuthenticated())
        {
            Users dbUser = usersRepository.findByUsername(user.getUsername());
            return jwtService.generateToken(dbUser);
        }
        else return "fail";
    }
}
