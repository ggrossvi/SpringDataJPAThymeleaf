package com.gloriavilla.glab30982springdatajpathymeleaf.repository;
import com.gloriavilla.glab30982springdatajpathymeleaf.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RoleRepository extends JpaRepository <Role, Long>{
    Role findByName(String name);

    Role save(Role role);
}
