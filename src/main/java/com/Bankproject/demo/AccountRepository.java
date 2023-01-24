package com.Bankproject.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Modifying
    @Query("update Account u set u.checking = :checking  where u.email = :email")
    void updateChecking(@Param(value = "email") String email, @Param(value = "checking") Double checking);

}
