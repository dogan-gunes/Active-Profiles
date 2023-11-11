package com.dgn.springbootactiveprofiles.repository;

import com.dgn.springbootactiveprofiles.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
