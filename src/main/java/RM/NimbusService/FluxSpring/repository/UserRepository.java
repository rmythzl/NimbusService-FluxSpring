package RM.NimbusService.FluxSpring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import RM.NimbusService.FluxSpring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
