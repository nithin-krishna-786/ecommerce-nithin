package com.nithin.bootifyecommerce2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nithin.bootifyecommerce2.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
