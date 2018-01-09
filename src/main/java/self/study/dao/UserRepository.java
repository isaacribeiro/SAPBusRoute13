package self.study.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import self.study.pojo.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
