package com.colvindesign.powerscape.repos;

import com.colvindesign.powerscape.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    //find account by ID

    //find account by username

    //return all accounts

    //delete account by id
}
