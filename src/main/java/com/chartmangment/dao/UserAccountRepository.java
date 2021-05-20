package com.chartmangment.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.chartmangment.entities.UserAccount;

public interface UserAccountRepository extends PagingAndSortingRepository<UserAccount, Long> {

}
