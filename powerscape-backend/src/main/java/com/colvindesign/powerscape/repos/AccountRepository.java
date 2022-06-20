package com.colvindesign.powerscape.repos;

import com.colvindesign.powerscape.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account save(Account account);

    List<Account> findByIsTracked(boolean isTracked);

}
