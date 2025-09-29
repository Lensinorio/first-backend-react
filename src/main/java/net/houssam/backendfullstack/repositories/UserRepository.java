package net.houssam.backendfullstack.repositories;

import net.houssam.backendfullstack.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
