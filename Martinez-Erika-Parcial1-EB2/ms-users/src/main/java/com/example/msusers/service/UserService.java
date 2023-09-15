package com.example.msusers.service;

import com.example.msusers.domain.BillDTO;
import com.example.msusers.domain.User;
import com.example.msusers.repository.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    private final List<User> userRepository;
    private BillRepository billRepository;

    public UserService(BillRepository billRepository) {
        this.billRepository = billRepository;
        this.userRepository = List.of(new User("1", "Tomas", "Pereyra", "tomas.pereyra@digitalhouse.com"));
    }

    public User findById(String id){
        User user = userRepository.stream().filter(_user -> Objects.equals(_user.getId(), id)).findFirst().orElse(null);
        BillDTO billDTO = billRepository.findByUserId(id);
        if (user != null)
            user.setBill(billDTO);

        return user;
    }
}
