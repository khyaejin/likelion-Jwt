package com.example.jwt.util.init;

import com.example.jwt.domain.Role;
import com.example.jwt.domain.RoleName;
import com.example.jwt.role.RoleRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final RoleRepository roleRepository;

    @PostConstruct
    public void init() {
        if (roleRepository.count() == 0) {
            roleRepository.save(new Role(1L, RoleName.ROLE_CLIENT));
            roleRepository.save(new Role(2L, RoleName.ROLE_ADMIN));
        }
    }
}

//프로젝트 실행하면 DB에 무조건 들어가게 해주는 코드?