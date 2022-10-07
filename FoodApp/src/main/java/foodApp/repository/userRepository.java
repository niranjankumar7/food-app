package foodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import foodApp.dto.user;

public interface userRepository extends JpaRepository<user, Integer> {

}
